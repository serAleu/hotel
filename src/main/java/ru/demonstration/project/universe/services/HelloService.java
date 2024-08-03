package ru.demonstration.project.universe.services;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.demonstration.project.universe.config.UniverseConfig;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final UniverseConfig config;

    @Scheduled(fixedDelay = 2000)
    public void dudeSayHello() {
        System.out.println("Hello," + config.getWhoShouldISayHelloTo() + "!");
    }
}
