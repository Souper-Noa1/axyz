package org.axyz.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comment{
    private String commentId;
    private String taskId;
   private String authorId;
   private String content;
   private LocalDateTime createdAt;

    public Comment(String commentId, String taskId, String authorId, String content, LocalDateTime createdAt) {
        this.commentId = commentId;
        this.taskId = taskId;
        this.authorId = authorId;
        this.content = content;
        this.createdAt = createdAt;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        Comment comment = (Comment) o;
        return Objects.equals(commentId, comment.commentId) && Objects.equals(taskId, comment.taskId) && Objects.equals(authorId, comment.authorId) && Objects.equals(content, comment.content) && Objects.equals(createdAt, comment.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, taskId, authorId, content, createdAt);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId='" + commentId + '\'' +
                ", taskId='" + taskId + '\'' +
                ", authorId='" + authorId + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}