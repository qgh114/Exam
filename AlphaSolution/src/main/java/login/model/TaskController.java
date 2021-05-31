package login.model;

import login.dataAccess.DataFacade;

import java.sql.SQLException;
import java.util.ArrayList;


public class TaskController {
    private DataFacade facade = null;

    /**
     * @param facade
     */
    public TaskController(DataFacade facade) {
        this.facade = facade;
    }

    /**
     * The createTask method receives information from FrontController and parses it through to the Datafacade Class
     * @param name
     * @param time
     * @param price
     * @param projectId
     * @throws SQLException
     */
    public void createTask(String name, int time, int price,int projectId) throws SQLException {
        facade.createTask(name,time, price, projectId);
    }

    /**
     * The showAll method receives information from FrontController and parses it through to the Datafacade Class
     * @param projectId
     * @return ArrayList of tasks
     * @throws SQLException
     */
    public ArrayList<Task> showAll(int projectId) throws SQLException{
        return facade.showAll(projectId);
    }

    /**
     * The calcTime method receives information from FrontController and parses it through to the Datafacade Class
     * @param projectId
     * @return int of total time
     * @throws SQLException
     */
    public int calcTime(int projectId) throws SQLException{
        return facade.calcTime(projectId);
    }

    /**
     * The calcPrice method receives information from FrontController and parses it through to the Datafacade Class
     * @param projectId
     * @return int of total price
     * @throws SQLException
     */
    public int calcPrice(int projectId) throws SQLException {
        return facade.calcPrice(projectId);
    }

    /**
     * The deleteTask method receives information from FrontController and parses it through to the Datafacade Class
     * @param projectId
     * @throws SQLException
     */
    public void deleteTask(int projectId) throws SQLException{
        facade.deleteTask(projectId);
    }

}
