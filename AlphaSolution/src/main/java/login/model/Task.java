package login.model;

public class Task {
    private String name;

    public Task(String name, int time) {
        this.name = name;
        this.time = time;
    }

    private int time;
    private int projectId;

    public Task(int projectId) {
        this.projectId = projectId;
    }

    private int taskId;

    public Task(String name, int time, int projectId) {
        this.name = name;
        this.time = time;
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String toString(){

        return "\nOpgavenavn: "+ name + "Tidsestimat: "+ time;
    }

}
