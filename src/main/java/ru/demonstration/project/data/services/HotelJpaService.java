package ru.demonstration.project.data.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.demonstration.project.data.entities.HotelAppRequestEntity;
import ru.demonstration.project.data.entities.UserEntity;
import ru.demonstration.project.data.repositories.HotelAppRequestJpaRepository;
import ru.demonstration.project.data.repositories.UsersJpaRepository;

@Service
@RequiredArgsConstructor
public class HotelJpaService {

    private final HotelAppRequestJpaRepository hotelAppRequestJpaRepository;
    private final UsersJpaRepository usersJpaRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public HotelAppRequestEntity save(HotelAppRequestEntity request) {
        return hotelAppRequestJpaRepository.save(request);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public UserEntity save(UserEntity user) {
        return usersJpaRepository.save(user);
    }

}
