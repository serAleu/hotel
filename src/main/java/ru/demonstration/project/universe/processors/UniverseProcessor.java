package ru.demonstration.project.universe.processors;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.demonstration.project.universe.data.entities.UniverseAppRequestEntity;
import ru.demonstration.project.universe.data.entities.UserEntity;
import ru.demonstration.project.universe.data.services.UniverseJpaService;
import ru.demonstration.project.universe.web.client.UniverseFeignClient;
import ru.demonstration.project.universe.web.client.dto.WebClientUniverseDto;

@Component
@RequiredArgsConstructor
public class UniverseProcessor {

    private final UniverseFeignClient universeFeignClient;
    private final UniverseJpaService universeJpaService;

    @Scheduled(fixedDelay = 10000)
    public void runTheUniverse() {
        UniverseAppRequestEntity request = universeJpaService.save(createRandomUniverseAppRequestEntity());
        UserEntity user = createUserEntity(request);
        universeJpaService.save(user);
        universeFeignClient.runTheUniverse(new WebClientUniverseDto().setGreeting("hello").toString());
    }

    private UniverseAppRequestEntity createRandomUniverseAppRequestEntity() {
        return new UniverseAppRequestEntity()
                .setName("Ivan")
                .setRequestType("REQUEST");
    }

    private UserEntity createUserEntity(UniverseAppRequestEntity request) {
        return new UserEntity()
                .setName(request.getName())
                .setStatus(314)
                .setLastUniverseAppRequestsId(request.getId());
    }
}
