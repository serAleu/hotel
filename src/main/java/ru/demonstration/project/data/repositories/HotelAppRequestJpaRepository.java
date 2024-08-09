package ru.demonstration.project.data.repositories;

import org.springframework.stereotype.Repository;
import ru.demonstration.project.data.entities.HotelAppRequestEntity;

@Repository
public interface HotelAppRequestJpaRepository extends BaseJpaRepository<HotelAppRequestEntity> {}
