package com.Logate.SpringBootVjezba.services;

import com.Logate.SpringBootVjezba.Application;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes= Application.class)
class TwitterApiServiceTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(TwitterApiServiceTest.class);
    @Autowired
    private TwitterApiService twitterApiService;

    @Test
    public void ispisPoljaIzTwittera() {
       LOGGER.info("Ovo su detalji sa twittera {}",twitterApiService.toString());
    }

    /*@Test
    public void ispisPoljaIzTwitterConfig() {
        LOGGER.info("Ovo su detalji sa twittera {}",twitterApiService.toString());
    }*/
}