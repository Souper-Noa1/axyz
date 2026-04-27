package org.axyz.domain.user;

import java.time.LocalDate;

public abstract class AppUser {
    private String userId;
    private String fullName;
    private String email;
    private String passwordHash;
    private LocalDate joinedAt;

    abstract String getRole();
    abstract boolean canCreateProject();
    abstract boolean canDeleteTask();


}
