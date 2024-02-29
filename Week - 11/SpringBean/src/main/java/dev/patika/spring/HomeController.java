package dev.patika.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private CurrencyService currencyService;

    public HomeController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }
    @GetMapping("")
    public String showCurrency(){
        return this.currencyService.getCurrency();
    }
}
