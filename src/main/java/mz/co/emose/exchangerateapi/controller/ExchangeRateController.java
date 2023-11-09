package mz.co.emose.exchangerateapi.controller;

import mz.co.emose.exchangerateapi.dto.ExchangeRateDTO;
import mz.co.emose.exchangerateapi.model.ExchangeRate;
import mz.co.emose.exchangerateapi.service.ExchangeRateService;
import mz.co.emose.exchangerateapi.utils.UrlMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlMapping.URL)
@CrossOrigin(origins = { "*" })
public class ExchangeRateController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping(path = "/all")
    public List<ExchangeRate> getAll() {
        List<ExchangeRate> allExchangeRates = exchangeRateService.getAllExchangeRates();
        return allExchangeRates;
    }

    @GetMapping("/{provider}")
    public ExchangeRateDTO getExchangeRatesByCurrencyCodeAndProviderDesignation(@PathVariable String provider) {
        ExchangeRateDTO exchangeRateDTO = exchangeRateService.getExchangeRatesByProvider(provider);
        return exchangeRateDTO;
    }


}
