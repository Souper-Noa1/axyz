package org.axyz.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Comment {
    private String commentId;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId='" + commentId + '\'' +
                ", taskId='" + taskId + '\'' +
                ", authorID='" + authorID + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    private String taskId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(commentId, comment.commentId) && Objects.equals(taskId, comment.taskId) && Objects.equals(authorID, comment.authorID) && Objects.equals(content, comment.content) && Objects.equals(createdAt, comment.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, taskId, authorID, content, createdAt);
    }

    private String authorID;
    private String content;
    private LocalDate createdAt;
}
