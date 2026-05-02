package org.axyz.domain.user;

import java.time.LocalDate;

public class Admin extends AppUser {
    public Admin() {
        super();
    }

    @Override
    String getRole() {
        return "Admin";
    }

    @Override
    boolean canCreateProject() {
        return true;
    }

    @Override
    boolean canDeleteTask() {
        return true;
    }
}
