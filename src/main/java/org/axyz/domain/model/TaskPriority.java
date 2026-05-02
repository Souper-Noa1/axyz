package org.axyz.domain.model;

public enum TaskPriority {
    LOW(1), MEDIUM(2), HIGH(3), CRITICAL(4);

    private final int urgencyScore;

    TaskPriority(int urgencyScore) {
        this.urgencyScore = urgencyScore;

    }
    public int getUrgencyScore() {
        return urgencyScore;
    }
}
