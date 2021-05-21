package login.dataAccess;

import login.model.Project;
import login.model.Task;
import login.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaskMapper {

    public void createTask(String name, int time, int price, int projectId) throws SQLException {
        try {
            Connection con = DBManager.getConnection();
            String SQL = "INSERT INTO Task (name, time, price, project_id) VALUES (?, ?,?, (SELECT project_id FROM Project WHERE project_id = ?))";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, name);
            ps.setInt(2, time);
            ps.setInt(3, price);
            ps.setInt(4, projectId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
    }

    public ArrayList<Task> showAll(int projectId) throws SQLException {
        Connection con = DBManager.getConnection();
        String query = "SELECT name, time, price FROM Task WHERE Task.project_id = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, projectId);
        ResultSet rs = ps.executeQuery();

        ArrayList<Task> allDetails = new ArrayList<>();
        while(rs.next()){
            Task tasks = new Task(rs.getString(1),rs.getInt(2),rs.getInt(3));
            allDetails.add(tasks);

        }
        return allDetails;

    }


    public int calcTime(int projectId) throws SQLException {
        Connection con = DBManager.getConnection();
        String query = "SELECT time FROM Task WHERE Task.project_id = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, projectId);
        ResultSet rs = ps.executeQuery();

        ArrayList<Integer> calculate = new ArrayList<>();
        int sum = 0;
        while(rs.next()){
             int calc = (rs.getInt(1));
            calculate.add(calc);
        }
        for (int numbers:calculate)
        {
            sum+=numbers;
        }

        return sum;

    }

    public int calcPrice(int projectId) throws SQLException {
        Connection con = DBManager.getConnection();
        String query = "SELECT price FROM Task WHERE Task.project_id = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, projectId);
        ResultSet rs = ps.executeQuery();

        ArrayList<Integer> calculate = new ArrayList<>();
        int sum = 0;
        while(rs.next()){
            int calc = (rs.getInt(1));
            calculate.add(calc);
        }
        for (int numbers:calculate)
        {
            sum+=numbers;
        }

        return sum;

    }


    public void deleteTask(int projectId) throws SQLException{
        try {
            Connection con = DBManager.getConnection();
            String SQL = "DELETE FROM Task WHERE project_id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, projectId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
    }


}
