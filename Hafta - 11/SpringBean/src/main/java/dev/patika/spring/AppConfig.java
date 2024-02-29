package dev.patika.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CurrencyService currencyService(){
        return new CurrencyService();
    }
}
