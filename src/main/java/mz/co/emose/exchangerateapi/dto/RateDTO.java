package mz.co.emose.exchangerateapi.dto;

import mz.co.emose.exchangerateapi.model.ExchangeRate;
import mz.co.emose.exchangerateapi.model.Provider;

import java.util.Date;
import java.util.List;

public class RateDTO {
    private String dateTime;
    private String provider;
    private String baseCurrency;
    private List<ExchangeRateDTO> rates;

    public RateDTO(String provider, String baseCurrency, List<ExchangeRateDTO> rates) {
        this.dateTime = new Date().toString();
        this.provider = provider;
        this.baseCurrency = baseCurrency;
        this.rates = rates;
    }
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public List<ExchangeRateDTO> getRates() {
        return rates;
    }

    public void setRates(List<ExchangeRateDTO> rates) {
        this.rates = rates;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
}
