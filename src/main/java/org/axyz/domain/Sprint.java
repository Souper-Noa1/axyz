package org.axyz.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Sprint {
    private String sprintId;
    private String name;
    private String projectId;
    private LocalDate startDate;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sprint sprint = (Sprint) o;
        return Objects.equals(sprintId, sprint.sprintId) && Objects.equals(name, sprint.name) && Objects.equals(projectId, sprint.projectId) && Objects.equals(startDate, sprint.startDate) && Objects.equals(endDate, sprint.endDate) && Objects.equals(goal, sprint.goal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sprintId, name, projectId, startDate, endDate, goal);
    }

    @Override
    public String toString() {
        return "Sprint{" +
                "sprintId='" + sprintId + '\'' +
                ", name='" + name + '\'' +
                ", projectId='" + projectId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", goal='" + goal + '\'' +
                '}';
    }

    private LocalDate endDate;
    private String goal;
    private enum sprintStatus{
        PLANNED, ACTIVE, COMPLETED
    };
}
