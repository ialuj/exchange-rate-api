package mz.co.emose.exchangerateapi.repository;

import mz.co.emose.exchangerateapi.model.Currency;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    public List<Currency> findByCode(String code);

    @Override
    Optional<Currency> findById(Long id);
}
