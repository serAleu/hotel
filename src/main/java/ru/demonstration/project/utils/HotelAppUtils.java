package ru.demonstration.project.utils;

import ru.demonstration.project.data.entities.HotelAppRequestEntity;
import ru.demonstration.project.data.entities.UserEntity;
import ru.demonstration.project.utils.enums.Name;
import ru.demonstration.project.utils.enums.Target;
import ru.demonstration.project.utils.enums.UserStatus;

import java.time.LocalDateTime;
import java.util.Random;

public class HotelAppUtils {

    private static final Random random = new Random();

    public static HotelAppRequestEntity createRandomHotelAppRequestEntity() {
        return new HotelAppRequestEntity()
                .setAddedAt(LocalDateTime.now())
                .setName(getRandomName())
                .setTarget(getRandomTarget());
    }

    public static UserEntity createUserEntity(HotelAppRequestEntity request) {
        return new UserEntity()
                .setName(request.getName())
                .setStatus(UserStatus.ALIVE.getStatus())
                .setLastHotelAppRequestsId(request.getId());
    }

    private static Name getRandomName()  {
        return Name.NAMES.get(random.nextInt(Name.NAMES_SIZE));
    }

    private static Target getRandomTarget()  {
        return Target.TARGETS.get(random.nextInt(Target.TARGETS_SIZE));
    }
}
