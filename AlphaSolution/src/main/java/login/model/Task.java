package login.model;

public class Task {
    private String name;
    private int time;
    private int projectId;
    private int price;


    /**
     * @param name
     * @param time
     * @param price
     */
    public Task(String name, int time, int price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }


    /**
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return int projectId
     */
    public int getProjectId() {
        return projectId;
    }

    public int getTime() { return time; }

    public int getPrice() { return price; }

    /**
     * @param projectId
     */
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    /**
     * @return String
     */
    public String toString(){

        return " "+ name + price + " : " + time;
    }

}
