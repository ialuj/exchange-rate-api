package mz.co.emose.exchangerateapi.service;

import mz.co.emose.exchangerateapi.dto.ExchangeRateDTO;
import mz.co.emose.exchangerateapi.model.ExchangeRate;

import java.util.List;

public interface ExchangeRateService {

    public abstract List<ExchangeRate> getAllExchangeRates();

    public abstract ExchangeRateDTO getExchangeRatesByProvider(String providerDesignation);
}
