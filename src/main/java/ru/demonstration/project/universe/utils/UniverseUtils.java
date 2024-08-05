package ru.demonstration.project.universe.utils;

import ru.demonstration.project.universe.data.entities.UniverseAppRequestEntity;
import ru.demonstration.project.universe.data.entities.UserEntity;
import ru.demonstration.project.universe.utils.enums.Name;
import ru.demonstration.project.universe.utils.enums.Target;
import ru.demonstration.project.universe.utils.enums.UserStatus;

import java.time.LocalDateTime;
import java.util.Random;

import static ru.demonstration.project.universe.utils.enums.Name.NAMES;
import static ru.demonstration.project.universe.utils.enums.Name.NAMES_SIZE;
import static ru.demonstration.project.universe.utils.enums.Target.TARGETS_SIZE;
import static ru.demonstration.project.universe.utils.enums.Target.TARGETS;

public class UniverseUtils {

    private static final Random random = new Random();

    public static UniverseAppRequestEntity createRandomUniverseAppRequestEntity() {
        return new UniverseAppRequestEntity()
                .setAddedAt(LocalDateTime.now())
                .setName(getRandomName())
                .setTarget(getRandomTarget());
    }

    public static UserEntity createUserEntity(UniverseAppRequestEntity request) {
        return new UserEntity()
                .setName(request.getName())
                .setStatus(UserStatus.ALIVE.getStatus())
                .setLastUniverseAppRequestsId(request.getId());
    }

    private static Name getRandomName()  {
        return NAMES.get(random.nextInt(NAMES_SIZE));
    }

    private static Target getRandomTarget()  {
        return TARGETS.get(random.nextInt(TARGETS_SIZE));
    }
}
