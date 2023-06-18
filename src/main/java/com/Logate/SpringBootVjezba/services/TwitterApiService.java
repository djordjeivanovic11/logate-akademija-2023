package com.Logate.SpringBootVjezba.services;

import com.Logate.SpringBootVjezba.configurations.TwitterApiConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class TwitterApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TwitterApiService.class);
    /*INJECTOVANJE NA NIVOU POLJA UZ POMOC VALUE
    @Value("{twitter-api.url}")
    private String url;
    @Value("{twitter-api.username}")
    private String username;
    @Value("{twitter-api.port}")
    private String port;
    @Value("{twitter-api.token}")
    private String token;*/


    @Autowired
    private TwitterApiConfiguration twitterApiConfiguration;

    @Autowired
    Environment environment;

    public void ispisPoljaIzTwitterConfig(){
        LOGGER.info("Ovo su polja iz twitter.config klase {}", twitterApiConfiguration.toString());
    }

    public void ispisPoljaizEnvironKlase() {
        environment.getProperty("twitter-api.url");
    }



}
