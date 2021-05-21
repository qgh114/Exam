package login.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;

    public Project(String name, int projectId) {
        this.name = name;
        this.projectId = projectId;
    }

    private int projectId;
    private User user;




    public Project(String name, User user) {
        this.name = name;
        this.user=user;
    }
    public Project(String name) {this.name = name;}


    public Project(User user) {
        this.user = user;
    }

    public Project() {

    }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public String getName() { return name; }


   // public void setName(String name) {this.name = name;}

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override

    public String toString(){

        return ""+ name;
    }
}
