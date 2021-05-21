package login.dataAccess;

import login.model.LoginSampleException;
import login.model.Project;
import login.model.User;

import java.sql.*;
import java.util.ArrayList;

public class ProjectMapper {


    public void createProject(String name, User user) throws SQLException{
        try {
            Connection con = DBManager.getConnection();
            String SQL = "INSERT INTO Project (name, profile_id) VALUES (?, (SELECT profile_id FROM Profile WHERE profile_id = ?))";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, name);
            ps.setInt(2, user.getProfileId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
    }


    public ArrayList<Project> showProjectList(User user) throws SQLException {
        ArrayList<Project> allProjects = new ArrayList<>();
        try {
        Connection con = DBManager.getConnection();
        String query = "SELECT name,project_id FROM Project WHERE profile_id = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, user.getProfileId());
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            Project projects = new Project(rs.getString(1),rs.getInt(2));
            allProjects.add(projects);

        }

        } catch (SQLException ex){
            throw new SQLException(ex.getMessage());
        }
        return allProjects;
    }

    public void deleteProject(int projectId) throws SQLException{
        try {
            Connection con = DBManager.getConnection();
            String SQL = "DELETE FROM Project WHERE project_id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, projectId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
    }

    public void editProject(String name, int projectId) throws SQLException{
        try {
            Connection con = DBManager.getConnection();
            String SQL = "UPDATE Project SET name = ? WHERE project_id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, name);
            ps.setInt(2, projectId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
    }


















}
