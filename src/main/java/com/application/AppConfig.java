package com.application;

import com.application.entities.BTCInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BTCInfo btcInfo() {
        return new BTCInfo();
    }



}
