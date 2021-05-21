package login.dataAccess;

import login.model.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class DataFacade {
   private UserMapper userMapper = new UserMapper();
   private ProjectMapper projectMapper = new ProjectMapper();
   private TaskMapper taskMapper = new TaskMapper();

    public User login(String email, String password) throws LoginSampleException {
        return userMapper.login(email, password);
    }

    public User createUser(User user) throws LoginSampleException {
        userMapper.createUser(user);
        return user;
    }

    public void duplicateEmail(String email) throws DuplicateException {
         userMapper.duplicateEmail(email);
    }

    public void createProject(String name, User user) throws SQLException {
        projectMapper.createProject(name, user);
    }

    public ArrayList<Project> showProjectList(User user) throws SQLException{
        return projectMapper.showProjectList(user);
    }


    public void createTask(String name, int time, int price, int projectId) throws SQLException{
        taskMapper.createTask(name,time, price, projectId);
    }


    public ArrayList<Task> showAll(int projectId) throws SQLException{
        return taskMapper.showAll(projectId);
    }


    public int calcTime(int projectId) throws SQLException{
        return taskMapper.calcTime(projectId);
    }
    public int calcPrice(int projectId) throws SQLException {
        return taskMapper.calcPrice(projectId);
    }

    public void deleteTask(int projectId) throws SQLException{
        taskMapper.deleteTask(projectId);
    }

    public void deleteProject(int projectId) throws SQLException{
        projectMapper.deleteProject(projectId);
    }

    public void editProject(String name, int projectId) throws SQLException{
        projectMapper.editProject(name,projectId);
    }

    public String findProject(int projectId) throws SQLException{
        return projectMapper.findProject(projectId);
    }

}
