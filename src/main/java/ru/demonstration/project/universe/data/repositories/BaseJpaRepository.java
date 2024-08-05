package ru.demonstration.project.universe.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.demonstration.project.universe.data.entities.BaseJpaEntity;

public interface BaseJpaRepository<T extends BaseJpaEntity> extends JpaRepository<T, Long> {}
