package mz.co.emose.exchangerateapi.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Jose Julai Ritsure
 */
public class ExchangeRateDTO {

    private String currency;

    private BigDecimal purchase;

    private BigDecimal sale;

    public ExchangeRateDTO(String currency, BigDecimal purchase, BigDecimal sale) {
        this.currency = currency;
        this.purchase = purchase;
        this.sale = sale;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPurchase() {
        return purchase;
    }

    public void setPurchase(BigDecimal purchase) {
        this.purchase = purchase;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

}
