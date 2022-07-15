package com.example.backend.model;

import com.example.backend.enums.Status;

import java.util.Objects;
import java.util.UUID;

public class Kanban {
    String description;
    Status status;

    UUID id;


    public Kanban(String description, Status status) {
        this.description = description;
        this.status = status;
        this.id= UUID.randomUUID();
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Kanban{" +
                "description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
