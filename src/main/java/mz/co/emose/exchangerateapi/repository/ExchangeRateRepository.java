package mz.co.emose.exchangerateapi.repository;

import mz.co.emose.exchangerateapi.model.Currency;
import mz.co.emose.exchangerateapi.model.ExchangeRate;
import mz.co.emose.exchangerateapi.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {

/*    @Query("SELECT er FROM ExchangeRate er inner join fetch Currency c on er.currencyId = c.id " +
            "inner join fetch Provider p on er.providerId = p.id " +
            " where p.designation = :providerDesignation ")*/
    public List<ExchangeRate> findByProvider(Provider provider);
}
