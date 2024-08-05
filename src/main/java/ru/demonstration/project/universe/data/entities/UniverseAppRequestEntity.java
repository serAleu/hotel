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
@Table(name = "universe_app_requests")
public class UniverseAppRequestEntity extends BaseJpaEntity {

    @Column(name = "added_at")
    private LocalDateTime addedAt;
    @Column(name = "name")
    private String name;
    @Column(name = "request_type")
    private String requestType;

    @Override
    public String repositoryName() {
        return null;
    }
}
