package mz.co.emose.exchangerateapi.repository;

import mz.co.emose.exchangerateapi.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    public List<Currency> findByCode(String code);
}
