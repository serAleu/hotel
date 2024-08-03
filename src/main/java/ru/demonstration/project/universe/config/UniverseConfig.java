package ru.demonstration.project.universe.config;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@Getter
public class UniverseConfig {

    @Value("${say-hello.to}")
    private String whoShouldISayHelloTo;
}
