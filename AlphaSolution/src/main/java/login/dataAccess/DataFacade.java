package login.dataAccess;

import login.model.*;

import java.sql.SQLException;
import java.util.ArrayList;


public class DataFacade {
   private UserMapper userMapper = new UserMapper();
   private ProjectMapper projectMapper = new ProjectMapper();
   private TaskMapper taskMapper = new TaskMapper();

    /**
     * The login method receives information from LoginController and parses it through to the UserMapper Class
     * @param email
     * @param password
     * @return User
     * @throws LoginSampleException
     */
    public User login(String email, String password) throws LoginSampleException {
        return userMapper.login(email, password);
    }


    /**
     * The createUser method receives information from LoginController and parses it through to the UserMapper Class.
     * @param user
     * @return User
     * @throws LoginSampleException
     */
    public User createUser(User user) throws LoginSampleException {
       userMapper.createUser(user);
        return user;
    }

    /**
     * The duplicateEmail method receives information from LoginController and parses it through to the UserMapper Class
     * @param email
     * @throws DuplicateException
     */
    public void duplicateEmail(String email) throws DuplicateException {
         userMapper.duplicateEmail(email);
    }

    /**
     * The createProject method receives information from ProjectController and parses it through to the ProjectMapper Class
     * @param name
     * @param user
     * @throws SQLException
     */
    public void createProject(String name, User user) throws SQLException {
        projectMapper.createProject(name, user);
    }

    /**
     * The showProjectList method receives information from ProjectController and parses it through to the ProjectMapper Class
     * @param user
     * @return ArrayList of Projects
     * @throws SQLException
     */
    public ArrayList<Project> showProjectList(User user) throws SQLException{
        return projectMapper.showProjectList(user);
    }

    /**
     * The createTask method receives information from TaskController and parses it through to the TaskMapper Class
     * @param name
     * @param time
     * @param price
     * @param projectId
     * @throws SQLException
     */
    public void createTask(String name, int time, int price, int projectId) throws SQLException{
        taskMapper.createTask(name,time, price, projectId);
    }

    /**
     * The showAll method receives information from TaskController and parses it through to the TaskMapper Class
     * @param projectId
     * @return ArrayList of Tasks
     * @throws SQLException
     */
    public ArrayList<Task> showAll(int projectId) throws SQLException{
        return taskMapper.showAll(projectId);
    }

    /**
     * The calcTime method receives information from TaskController and parses it through to the TaskMapper Class
     * @param projectId
     * @return int time
     * @throws SQLException
     */
    public int calcTime(int projectId) throws SQLException{
        return taskMapper.calcTime(projectId);
    }

    /**
     * The calcPrice method receives information from TaskController and parses it through to the TaskMapper Class
     * @param projectId
     * @return int price
     * @throws SQLException
     */
    public int calcPrice(int projectId) throws SQLException {
        return taskMapper.calcPrice(projectId);
    }

    /**
     * The createTask method receives information from TaskController and parses it through to the TaskMapper Class
     * @param projectId
     * @throws SQLException
     */
    public void deleteTask(int projectId) throws SQLException{
        taskMapper.deleteTask(projectId);
    }

    /**
     * The deleteProject method receives information from ProjectController and parses it through to the ProjectMapper Class
     * @param projectId
     * @throws SQLException
     */
    public void deleteProject(int projectId) throws SQLException{
        projectMapper.deleteProject(projectId);
    }

    /**
     * The editProject method receives information from ProjectController and parses it through to the ProjectMapper Class
     * @param name
     * @param projectId
     * @throws SQLException
     */
    public void editProject(String name, int projectId) throws SQLException{
        projectMapper.editProject(name,projectId);
    }

    /**
     * The findProject method receives information from ProjectController and parses it through to the ProjectMapper Class
     * @param projectId
     * @return String project-name
     * @throws SQLException
     */
    public String findProject(int projectId) throws SQLException{
        return projectMapper.findProject(projectId);
    }

}
