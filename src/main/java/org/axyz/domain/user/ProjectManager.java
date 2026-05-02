package org.axyz.domain.user;

public class ProjectManager extends AppUser {
    public ProjectManager() {
        super();
    }

    @Override
    String getRole() {
        return "ProjectManager";
    }

    @Override
    boolean canCreateProject() {
        return true;
    }

    @Override
    boolean canDeleteTask() {
        return false;
    }

    boolean canCreateSprint(){
        return true;
    }


}
