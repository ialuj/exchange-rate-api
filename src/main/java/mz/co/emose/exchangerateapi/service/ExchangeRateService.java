package mz.co.emose.exchangerateapi.service;

import mz.co.emose.exchangerateapi.dto.ExchangeRateDTO;
import mz.co.emose.exchangerateapi.dto.RateDTO;
import mz.co.emose.exchangerateapi.model.ExchangeRate;

import java.util.List;

public interface ExchangeRateService {

    public abstract List<RateDTO> getAllExchangeRates();

    public abstract RateDTO getExchangeRatesByProvider(String providerDesignation);

}
