package edu.uta.movietalk.client;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hxy
 */
@Configuration
public class TMDBConfig {

    @Value("${api.tmdb.url}")
    private String tmdbUrl;

    @Bean
    TMDBClient tmdbClient() {

        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(TMDBClient.class))
                .logLevel(Logger.Level.BASIC)
                .target(TMDBClient.class, tmdbUrl);
    }
}
