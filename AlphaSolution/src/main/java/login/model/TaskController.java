package login.model;

import login.dataAccess.DataFacade;

import java.sql.SQLException;
import java.util.ArrayList;

public class TaskController {
    private DataFacade facade = null;

    public TaskController(DataFacade facade) {
        this.facade = facade;
    }

    public void createTask(String name, int time, int price,int projectId) throws SQLException {
        facade.createTask(name,time, price, projectId);
    }

    public ArrayList<Task> showAll(int projectId) throws SQLException{
        return facade.showAll(projectId);
    }

    public int calcTime(int projectId) throws SQLException{
        return facade.calcTime(projectId);
    }

    public int calcPrice(int projectId) throws SQLException {
        return facade.calcPrice(projectId);
    }

    public void deleteTask(int projectId) throws SQLException{
        facade.deleteTask(projectId);
    }

}
