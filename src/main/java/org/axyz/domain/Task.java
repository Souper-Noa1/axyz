package org.axyz.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
    private String taskId;
    private String title;
    private String description;
    private String assgneeId;
    private String projectId;
    private String sprintId;
    private int storyPoints;
    private LocalDate dueDate;
    private LocalDateTime createdAt;

    public Task(String taskId, String title, String description, String assgneeId, String projectId, String sprintId, int storyPoints, LocalDate dueDate, LocalDateTime createdAt) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.assgneeId = assgneeId;
        this.projectId = projectId;
        this.sprintId = sprintId;
        this.storyPoints = storyPoints;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
    }


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssgneeId() {
        return assgneeId;
    }

    public void setAssgneeId(String assgneeId) {
        this.assgneeId = assgneeId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    public int getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(int storyPoints) {
        this.storyPoints = storyPoints;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return storyPoints == task.storyPoints && Objects.equals(taskId, task.taskId) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(assgneeId, task.assgneeId) && Objects.equals(projectId, task.projectId) && Objects.equals(sprintId, task.sprintId) && Objects.equals(dueDate, task.dueDate) && Objects.equals(createdAt, task.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, title, description, assgneeId, projectId, sprintId, storyPoints, dueDate, createdAt);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assgneeId='" + assgneeId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", sprintId='" + sprintId + '\'' +
                ", storyPoints=" + storyPoints +
                ", dueDate=" + dueDate +
                ", createdAt=" + createdAt +
                '}';
    }
}