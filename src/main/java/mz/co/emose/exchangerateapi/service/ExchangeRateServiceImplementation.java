package mz.co.emose.exchangerateapi.service;

import mz.co.emose.exchangerateapi.dto.ExchangeRateDTO;
import mz.co.emose.exchangerateapi.dto.RateDTO;
import mz.co.emose.exchangerateapi.model.Currency;
import mz.co.emose.exchangerateapi.model.ExchangeRate;
import mz.co.emose.exchangerateapi.model.Provider;
import mz.co.emose.exchangerateapi.repository.CurrencyRepository;
import mz.co.emose.exchangerateapi.repository.ExchangeRateRepository;
import mz.co.emose.exchangerateapi.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExchangeRateServiceImplementation implements ExchangeRateService {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public List<RateDTO> getAllExchangeRates() {
        List<Provider> providers = providerRepository.findAll();
        List<RateDTO> dtos = new ArrayList<RateDTO>();
        for (Provider provider : providers) {
            RateDTO rateDTO = getExchangeRatesByProvider(provider);
            dtos.add(rateDTO);
        }
        return dtos;
    }

    @Override
    public RateDTO getExchangeRatesByProvider(String providerDesignation) {
        Provider provider = providerRepository.findProviderByDesignation(providerDesignation).get(0);
        List<ExchangeRate> exchangeRates = exchangeRateRepository.findByProviderId(provider.getId());
        List<ExchangeRateDTO> dtos =getRatesDTOs(exchangeRates);
        RateDTO exchangeRateDTO = new RateDTO(provider.getDesignation(), provider.getBaseCurrency(), dtos);
        return exchangeRateDTO;
    }

    private RateDTO getExchangeRatesByProvider(Provider provider) {
        List<ExchangeRate> exchangeRates = exchangeRateRepository.findByProviderId(provider.getId());
        List<ExchangeRateDTO> dtos =getRatesDTOs(exchangeRates);
        RateDTO exchangeRateDTO = new RateDTO(provider.getDesignation(), provider.getBaseCurrency(), dtos);
        return exchangeRateDTO;
    }

    private List<ExchangeRateDTO> getRatesDTOs(List<ExchangeRate> exchangeRates) {
        List<ExchangeRateDTO> dtos = new ArrayList<ExchangeRateDTO>();
        for (ExchangeRate exchangeRate :exchangeRates) {
            Optional<Currency> optCurrency = currencyRepository.findById(exchangeRate.getCurrencyId());
            Currency currency = optCurrency.get();
            ExchangeRateDTO exchangeRateDTO = new ExchangeRateDTO(currency.getCode(), convertPrice(exchangeRate.getPurchase()), convertPrice(exchangeRate.getSale()));
            dtos.add(exchangeRateDTO);
        }
        return dtos;
    }

    BigDecimal convertPrice(double value){
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal.setScale(4, RoundingMode.HALF_UP);
        return bigDecimal;
    }
}
