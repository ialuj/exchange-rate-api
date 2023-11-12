package mz.co.emose.exchangerateapi.controller;

import mz.co.emose.exchangerateapi.dto.ExchangeRateDTO;
import mz.co.emose.exchangerateapi.dto.RateDTO;
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

    @GetMapping(path = "/all/rates")
    public List<RateDTO> getAll() {
        List<RateDTO> allExchangeRates = exchangeRateService.getAllExchangeRates();
        return allExchangeRates;
    }

    @GetMapping("/{provider}/rates")
    public RateDTO getExchangeRatesByCurrencyCodeAndProviderDesignation(@PathVariable String provider) {
        RateDTO exchangeRateDTO = exchangeRateService.getExchangeRatesByProvider(provider);
        return exchangeRateDTO;
    }


}
