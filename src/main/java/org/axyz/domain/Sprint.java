package org.axyz.domain;

import java.time.LocalDate;
import java.util.Objects;


public class Sprint{
    private String sprintId;
    private String sprintName;
    private String projectId;
    private LocalDate startDate;
    private LocalDate endDate;


    public Sprint(String sprintId, String sprintName, String projectId, LocalDate startDate, LocalDate endDate) {
        this.sprintId = sprintId;
        this.sprintName = sprintName;
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sprint sprint = (Sprint) o;
        return Objects.equals(sprintId, sprint.sprintId) && Objects.equals(sprintName, sprint.sprintName) && Objects.equals(projectId, sprint.projectId) && Objects.equals(startDate, sprint.startDate) && Objects.equals(endDate, sprint.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sprintId, sprintName, projectId, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Sprint{" +
                "sprintId='" + sprintId + '\'' +
                ", sprintName='" + sprintName + '\'' +
                ", projectId='" + projectId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}