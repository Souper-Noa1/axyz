package org.axyz.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Project {
    private String projectId;
    private String name;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(projectId, project.projectId) && Objects.equals(name, project.name) && Objects.equals(description, project.description) && Objects.equals(ownerId, project.ownerId) && Objects.equals(memberIds, project.memberIds) && Objects.equals(createdAt, project.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, name, description, ownerId, memberIds, createdAt);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", memberIds='" + memberIds + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    private String ownerId;
    private String memberIds;
    private LocalDate createdAt;
}
