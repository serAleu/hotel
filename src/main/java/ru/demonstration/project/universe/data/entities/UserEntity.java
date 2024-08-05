package ru.demonstration.project.universe.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity extends BaseJpaEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Integer status;
    @Column(name = "last_universe_app_requests_id")
    private Long lastUniverseAppRequestsId;

    @Override
    public String repositoryName() {
        return null;
    }
}
