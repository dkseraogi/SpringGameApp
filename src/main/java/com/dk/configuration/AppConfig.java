package com.dk.configuration;

import com.dk.beans.Game;
import com.dk.beans.KolkataNightRiders;
import com.dk.beans.RajasthanRoyals;
import com.dk.interfaces.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dk")
public class AppConfig {

    @Autowired @Qualifier("rajasthanRoyals")
    private Team rr;

    @Autowired @Qualifier("kolkataNightRiders")
    private Team kn;

    @Bean
    public Game games(){

        return new Game(rr,kn);
    }
}
