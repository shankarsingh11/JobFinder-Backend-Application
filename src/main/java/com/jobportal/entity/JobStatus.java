package com.jobportal.entity;

public enum JobStatus {
    OPEN("Job is open for applications"),
    CLOSED("Job is closed"),
    DRAFT("Job is not published yet"),
    EXPIRED("Application deadline passed");

    private final String description;

    JobStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
