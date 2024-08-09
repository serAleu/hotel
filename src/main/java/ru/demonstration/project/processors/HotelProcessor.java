package ru.demonstration.project.processors;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.demonstration.project.data.entities.UserEntity;
import ru.demonstration.project.data.entities.HotelAppRequestEntity;
import ru.demonstration.project.data.services.HotelJpaService;
import ru.demonstration.project.utils.HotelAppUtils;
import ru.demonstration.project.utils.enums.UserStatus;
import ru.demonstration.project.web.client.HotelFeignClient;
import ru.demonstration.project.web.client.dto.WebClientHotelGuestDto;

@Component
@RequiredArgsConstructor
public class HotelProcessor {

    private final HotelFeignClient hotelFeignClient;
    private final HotelJpaService hotelJpaService;

    @Scheduled(fixedDelay = 10000)
    public void addNewGuest() {
        HotelAppRequestEntity request = hotelJpaService.save(HotelAppUtils.createRandomHotelAppRequestEntity());
        UserEntity user = hotelJpaService.save(HotelAppUtils.createUserEntity(request));
        hotelFeignClient.addGuest(new WebClientHotelGuestDto()
                .setId((long)(Math.random() * 50 + 1))
                .setName(user.getName())
                .setTarget(request.getTarget())
                .setStatus(UserStatus.ALIVE));
    }
}
