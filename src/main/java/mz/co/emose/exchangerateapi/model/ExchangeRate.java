package mz.co.emose.exchangerateapi.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EXCHANGE_RATE")
public class ExchangeRate implements Serializable {

    @Id
    private Long id;
    @Column(name = "CURRENCY_ID", insertable = true, updatable = true, nullable = false)
    private Long currencyId;
    @Column(name = "PROVIDER_ID", insertable = true, updatable = true, nullable = false)
    private Long providerId;
    @Column(name = "PURCHASE", insertable = true, updatable = true, nullable = false)
    private double purchase;
    @Column(name = "SALE", insertable = true, updatable = true, nullable = false)
    private double sale;
    @Column(name = "CREATED_AT", insertable = true, updatable = true, nullable = false)
    private Date createdAt;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

}
