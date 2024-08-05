package ru.demonstration.project.universe.utils.enums;

import java.util.List;

public enum Target {
    CREATING,
    MURDERING,
    DEFENDING,
    RUNNING,
    SLEEPING,
    WALKING;

    public static final List<Target> TARGETS = List.of(values());
    public static final int TARGETS_SIZE = TARGETS.size();
}
