package org.axyz.domain.user;

public class Developer extends AppUser{
    public Developer() {
        super();
    }

    @Override
    String getRole() {
        return "Dev";
    }

    @Override
    boolean canCreateProject() {
        return false;
    }

    @Override
    boolean canDeleteTask() {
        return false;
    }

    boolean canCreateTask(){
        return true;
    }
}
