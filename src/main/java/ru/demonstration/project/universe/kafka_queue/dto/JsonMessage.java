package ru.demonstration.project.universe.kafka_queue.dto;

import lombok.Getter;

@Getter
public class JsonMessage {
    private long number;
    private String message;
}
