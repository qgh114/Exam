package login.dataAccess;


import login.model.Project;
import login.model.User;

import java.sql.*;
import java.util.ArrayList;

public class ProjectMapper {

    /**
     * The method searches for the correct profile_id using object User and inserts the string input in the name column in the database.
     * @param name
     * @param user
     * @throws SQLException
     */
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

    /**
     * The method searches for all projects related to the specific user and then shows a list of all the user's projects.
     * @param user
     * @return ArrayList of projects
     * @throws SQLException
     */
    public ArrayList<Project> showProjectList(User user) throws SQLException {
        ArrayList<Project> allProjects = new ArrayList<>();
        try {
        Connection con = DBManager.getConnection();
        String query = "SELECT name,project_id FROM Project WHERE profile_id = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, user.getProfileId());
        ResultSet rs = ps.executeQuery();

        //if condition is true retrieve values from the database and adds values into allprojects's array.
        while(rs.next()){
            Project projects = new Project(rs.getString(1),rs.getInt(2));
            allProjects.add(projects);

        }

        } catch (SQLException ex){
            throw new SQLException(ex.getMessage());
        }
        return allProjects;
    }

    /**
     * the method deletes a project using project_id
     * @param projectId
     * @throws SQLException
     */
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

    /**
     * the method updates a project name using project_id
     * @param name
     * @param projectId
     * @throws SQLException
     */
    public void editProject(String name, int projectId) throws SQLException {
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

    /**
     * the method finds a project name using project_id
     * @param projectId
     * @return String project name
     * @throws SQLException
     */
    public String findProject(int projectId) throws SQLException{
        try {
            Connection con = DBManager.getConnection();
            String SQL = "SELECT name FROM Project WHERE project_id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, projectId);
            ResultSet rs = ps.executeQuery();
            String projectname = null;

            if(rs.next()){
                projectname = rs.getString(1);
            }
            return projectname;

        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
    }
















}
