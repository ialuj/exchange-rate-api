package mz.co.emose.exchangerateapi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CURRENCY")
public class Currency implements Serializable {
    @Id
    private Long id;
    @Column(name = "DESIGNATION", insertable = true, updatable = true, nullable = false, length = 4)
    private String designation;
    @Column(name = "CODE", insertable = true, updatable = true, nullable = false, length = 3)
    private String code;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "CURRENCY_ID", referencedColumnName = "id")
    private Set<ExchangeRate> rates = new HashSet<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<ExchangeRate> getRates() {
        return rates;
    }

    public void setRates(Set<ExchangeRate> rates) {
        this.rates = rates;
    }
}
