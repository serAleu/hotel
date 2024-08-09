package ru.demonstration.project.config;

import feign.Feign;
import feign.Request;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.demonstration.project.web.client.HotelFeignClient;

import java.util.concurrent.TimeUnit;

import static feign.Logger.Level.FULL;
import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
@EnableScheduling
@Getter
public class HotelConfig {

    @Value("${web.client.feign.options.connect-timeout-millis}")
    private Integer webClientFeignOptionsConnectTimeoutMillis;
    @Value("${web.client.feign.options.follow-redirects}")
    private Boolean webClientFeignOptionsFollowRedirects;
    @Value("${web.client.feign.options.read-timeout-millis}")
    private Integer webClientFeignOptionsReadTimeoutMillis;
    @Value("${web.client.feign.retryer.period}")
    private Integer webClientFeignRetryerPeriod;
    @Value("${web.client.feign.retryer.duration}")
    private Integer webClientFeignRetryerDuration;
    @Value("${web.client.feign.retryer.max-attempts}")
    private Integer webClientFeignRetryerMaxAttempts;
    @Value("${web.client.base-url}")
    private String webClientBaseUrl;

    @Bean
    public HotelFeignClient hotelFeignClient() {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .options(new Request.Options((long) webClientFeignOptionsReadTimeoutMillis,
                        TimeUnit.MILLISECONDS, (long) webClientFeignOptionsConnectTimeoutMillis, TimeUnit.MILLISECONDS,
                        webClientFeignOptionsFollowRedirects))
                .retryer(new Retryer.Default(webClientFeignRetryerPeriod,
                        SECONDS.toMillis(webClientFeignRetryerDuration), webClientFeignRetryerMaxAttempts))
                .logLevel(FULL)
                .target(HotelFeignClient.class, webClientBaseUrl);
    }
}
