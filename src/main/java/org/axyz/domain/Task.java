package org.axyz.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
    private String taskId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return storyPoints == task.storyPoints && Objects.equals(taskId, task.taskId) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(assigneeId, task.assigneeId) && Objects.equals(projectId, task.projectId) && Objects.equals(dueDate, task.dueDate) && Objects.equals(createdAt, task.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, title, description, assigneeId, projectId, storyPoints, dueDate, createdAt);
    }

    private String title;
    private String description;
    private String assigneeId;
    private String projectId;
    private int storyPoints;
    private LocalDate dueDate;
    private LocalDate createdAt;

    @Override
    public String toString() {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assigneeId='" + assigneeId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", storyPoints=" + storyPoints +
                ", dueDate=" + dueDate +
                ", createdAt=" + createdAt +
                '}';
    }

    private enum status{
        TODO, IN_PROGRESS, IN_REVIEW, DONE, CANCELLED
    };
    private enum priority{
        LOW, MEDIUM, HIGH, CRITICAL;
    }
}
