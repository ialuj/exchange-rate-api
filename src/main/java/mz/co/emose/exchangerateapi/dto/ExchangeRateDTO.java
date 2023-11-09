package mz.co.emose.exchangerateapi.dto;

import mz.co.emose.exchangerateapi.model.Currency;
import mz.co.emose.exchangerateapi.model.ExchangeRate;
import mz.co.emose.exchangerateapi.model.Provider;

import java.util.Date;
import java.util.List;

public class ExchangeRateDTO {
    private Provider provider;

    private List<ExchangeRate> rates;

    private Date dateTime;

    public ExchangeRateDTO(Provider provider, List<ExchangeRate> rates) {
        this.dateTime = new Date();
        this.provider = provider;
        this.rates = rates;
    }
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public List<ExchangeRate> getRates() {
        return rates;
    }

    public void setRates(List<ExchangeRate> rates) {
        this.rates = rates;
    }
}
