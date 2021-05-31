package login.model;


public class Project {

    private String name;
    private int projectId;
    private User user;

    /**
     * @param name
     * @param projectId
     */
    public Project(String name, int projectId) {
        this.name = name;
        this.projectId = projectId;
    }

    /**
     * @param name
     * @param user
     */
    public Project(String name, User user) {
        this.name = name;
        this.user=user;
    }

    /**
     * @param name
     */
    public Project(String name) {this.name = name;}

    /**
     * @param user
     */
    public Project(User user) {
        this.user = user;
    }


    /**
     * @return User user
     */
    public User getUser() { return user; }


    /**
     * @param user
     */
    public void setUser(User user) { this.user = user; }

    /**
     * @return String name
     */

    public String getName() { return name; }


    /**
     * @return int projectId
     */
    public int getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


    /**
     * @return String
     */
    @Override

    public String toString(){

        return ""+ name;
    }
}
