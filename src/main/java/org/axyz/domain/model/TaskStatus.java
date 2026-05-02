package org.axyz.domain.model;

public enum TaskStatus {
    TO_DO("To do"),
    IN_PROGRESS("In Progress"),
    IN_REVIEW("In Review"),
    DONE("Done"),
    CANCELLED("Cancelled");

    private final String displayLabel;
     TaskStatus(String displayLabel) {
        this.displayLabel = displayLabel;
    }
    public String getDisplayLabel() {
        return displayLabel;
    }
    public boolean isTerminal() {
        return this == CANCELLED || this == DONE || this == IN_PROGRESS;
    }
}
