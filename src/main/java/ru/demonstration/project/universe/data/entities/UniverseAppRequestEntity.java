package ru.demonstration.project.universe.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.demonstration.project.universe.utils.enums.Name;
import ru.demonstration.project.universe.utils.enums.Target;

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
    @Enumerated(EnumType.STRING)
    private Name name;
    @Column(name = "target_in_universe")
    @Enumerated(EnumType.STRING)
    private Target target;
}
