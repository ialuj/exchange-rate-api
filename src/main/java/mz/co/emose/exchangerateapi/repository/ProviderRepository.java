package mz.co.emose.exchangerateapi.repository;

import mz.co.emose.exchangerateapi.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

    public List<Provider> findProviderByDesignation(String designation);
    @Override
    Optional<Provider> findById(Long id);
}
