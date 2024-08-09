package ru.demonstration.project.utils.enums;

import lombok.Getter;

@Getter
public enum UserStatus {
    ALIVE(1),
    DEAD(0);

    private final int status;

    UserStatus(int status) {
        this.status = status;
    }
}
