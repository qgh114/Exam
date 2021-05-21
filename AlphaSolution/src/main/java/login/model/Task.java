package login.model;

public class Task {
    private String name;
    private int time;



    private int projectId;
    private int price;
    private int taskId;

    public Task(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Task(String name, int time, int price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public Task(String name, int time, int projectId, int price) {
        this.name = name;
        this.time = time;
        this.projectId = projectId;
        this.price = price;
    }


    public Task(int projectId) {
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

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public String toString(){

        return " "+ name + price + " : " + time;
    }

}
