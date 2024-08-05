package ru.demonstration.project.universe.data.repositories;

import org.springframework.stereotype.Repository;
import ru.demonstration.project.universe.data.entities.UserEntity;

@Repository
public interface UsersJpaRepository extends BaseJpaRepository<UserEntity> {}
