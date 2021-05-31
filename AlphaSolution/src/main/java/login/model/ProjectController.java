package login.model;

import login.dataAccess.DataFacade;

import java.sql.SQLException;
import java.util.ArrayList;


public class ProjectController {
    private DataFacade facade = null;

    /**
     * @param facade
     */
    public ProjectController(DataFacade facade) {
        this.facade = facade;
    }

    /**
     * The createProject method receives information from FrontController and parses it through to the Datafacade Class
     * @param name
     * @param user
     * @throws SQLException
     */
    public void createProject(String name, User user) throws SQLException {
        facade.createProject(name, user);
    }

    /**
     * The showProjectList method receives information from FrontController and parses it through to the Datafacade Class
     * @param user
     * @return ArrayList of projects
     * @throws SQLException
     */

    public ArrayList<Project> showProjectList(User user) throws SQLException {

        return facade.showProjectList(user);
    }

    /**
     * The delete method receives information from FrontController and parses it through to the Datafacade Class
     * @param projectId
     * @throws SQLException
     */
    public void deleteProject(int projectId) throws SQLException{
        facade.deleteProject(projectId);
    }

    /**
     * The editProject method receives information from FrontController and parses it through to the Datafacade Class
     * @param name
     * @param projectId
     * @throws SQLException
     */
    public void editProject(String name, int projectId) throws SQLException{
        facade.editProject(name,projectId);
    }

    /**
     * The findProject method receives information from FrontController and parses it through to the Datafacade Class
     * @param projectId
     * @return String
     * @throws SQLException
     */
    public String findProject(int projectId) throws SQLException{
        return facade.findProject(projectId);
    }
}
