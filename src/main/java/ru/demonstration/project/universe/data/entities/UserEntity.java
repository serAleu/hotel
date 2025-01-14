package ru.demonstration.project.universe.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.demonstration.project.universe.utils.enums.Name;

@Getter
@Setter
@Accessors(chain = true)
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity extends BaseJpaEntity {

    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private Name name;
    @Column(name = "status")
    private Integer status;
    @Column(name = "last_universe_app_requests_id")
    private Long lastUniverseAppRequestsId;
}
