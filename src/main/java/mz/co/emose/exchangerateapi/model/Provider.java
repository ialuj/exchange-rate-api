package mz.co.emose.exchangerateapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "PROVIDER")
public class Provider implements Serializable {

    @Id
    private Long id;
    @Column(name = "DESIGNATION", insertable = true, updatable = true, nullable = false)
    private String designation;
    @Column(name = "BASE_CURRENCY", insertable = true, updatable = true, nullable = false, length = 3)
    private String baseCurrency;

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

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
}
