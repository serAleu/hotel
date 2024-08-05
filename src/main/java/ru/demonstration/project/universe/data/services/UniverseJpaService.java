package ru.demonstration.project.universe.data.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.demonstration.project.universe.data.entities.UniverseAppRequestEntity;
import ru.demonstration.project.universe.data.entities.UserEntity;
import ru.demonstration.project.universe.data.repositories.UniverseAppRequestJpaRepository;
import ru.demonstration.project.universe.data.repositories.UsersJpaRepository;

@Service
@RequiredArgsConstructor
public class UniverseJpaService {

    private final UniverseAppRequestJpaRepository universeAppRequestJpaRepository;
    private final UsersJpaRepository usersJpaRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public UniverseAppRequestEntity save(UniverseAppRequestEntity request) {
        return universeAppRequestJpaRepository.save(request);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public UserEntity save(UserEntity user) {
        return usersJpaRepository.save(user);
    }

}
