package org.axyz.domain;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Project
{
    private String projectId;
    private String projectName;
    private String projectDescription;
    private String ownerId;
    private final List<String> memberIds;
    private LocalDateTime createdAt;

    public Project(String projectId, String projectName, String projectDescription, String ownerId, List<String> memberIds, LocalDateTime createdAt) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.ownerId = ownerId;
        this.memberIds = memberIds;
        this.createdAt = createdAt;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public List<String> getMemberIds() {
        return Collections.unmodifiableList(memberIds);
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
        Project project = (Project) o;
        return Objects.equals(projectId, project.projectId) && Objects.equals(projectName, project.projectName) && Objects.equals(projectDescription, project.projectDescription) && Objects.equals(ownerId, project.ownerId) && Objects.equals(memberIds, project.memberIds) && Objects.equals(createdAt, project.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, projectDescription, ownerId, memberIds, createdAt);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", memberIds=" + memberIds +
                ", createdAt=" + createdAt +
                '}';
    }
}