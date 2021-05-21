package login.model;

import login.dataAccess.DataFacade;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProjectController {
    private DataFacade facade = null;


    public ProjectController(DataFacade facade) {
        this.facade = facade;
    }

    public void createProject(String name, User user) throws SQLException {
        facade.createProject(name, user);
    }

    public ArrayList<Project> showProjectList(User user) throws SQLException {

        return facade.showProjectList(user);
    }

    public void deleteProject(int projectId) throws SQLException{
        facade.deleteProject(projectId);
    }
}
