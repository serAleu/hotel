package ru.demonstration.project.data.repositories;

import org.springframework.stereotype.Repository;
import ru.demonstration.project.data.entities.UserEntity;

@Repository
public interface UsersJpaRepository extends BaseJpaRepository<UserEntity> {}
