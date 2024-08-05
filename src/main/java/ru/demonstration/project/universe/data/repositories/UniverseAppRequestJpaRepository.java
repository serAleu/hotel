package ru.demonstration.project.universe.data.repositories;

import org.springframework.stereotype.Repository;
import ru.demonstration.project.universe.data.entities.UniverseAppRequestEntity;

@Repository
public interface UniverseAppRequestJpaRepository extends BaseJpaRepository<UniverseAppRequestEntity> {}
