package mz.co.emose.exchangerateapi.service;

import mz.co.emose.exchangerateapi.dto.ExchangeRateDTO;
import mz.co.emose.exchangerateapi.model.Currency;
import mz.co.emose.exchangerateapi.model.ExchangeRate;
import mz.co.emose.exchangerateapi.model.Provider;
import mz.co.emose.exchangerateapi.repository.CurrencyRepository;
import mz.co.emose.exchangerateapi.repository.ExchangeRateRepository;
import mz.co.emose.exchangerateapi.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeRateServiceImplementation implements ExchangeRateService {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public List<ExchangeRate> getAllExchangeRates() {
        return exchangeRateRepository.findAll();
    }

    @Override
    public ExchangeRateDTO getExchangeRatesByProvider(String providerDesignation) {
        Provider provider = providerRepository.findProviderByDesignation(providerDesignation).get(0);
        List<ExchangeRate> exchangeRates = exchangeRateRepository.findByProvider(provider);
        ExchangeRateDTO exchangeRateDTO = new ExchangeRateDTO(provider, exchangeRates);
        return exchangeRateDTO;
    }
}
