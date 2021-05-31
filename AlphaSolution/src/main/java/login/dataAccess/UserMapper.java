package login.dataAccess;

import login.model.DuplicateException;
import login.model.LoginSampleException;
import login.model.User;

import java.sql.*;


public class UserMapper {


    /**
     * the method uses the information from the User Class and inserts them into the database which creates a Profile.
     * @param user
     * @throws LoginSampleException
     */
    public void createUser(User user) throws LoginSampleException {
        try {
            Connection con = DBManager.getConnection();
            String SQL = "INSERT INTO Profile (email, password) VALUES (?, (?))";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            user.setProfileId(id);
        } catch (SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     * the method uses email and password from the user and compares it to the information in the database.
     * If the information is validated then it returns user or else it throws an exception
     * @param email
     * @param password
     * @return user
     * @throws LoginSampleException
     */
    public User login(String email, String password) throws LoginSampleException {
        try {
            Connection con = DBManager.getConnection();
            String SQL = "SELECT profile_id FROM Profile "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                User user = new User(email, password);
                user.setProfileId(id);
                return user;
            } else {
                throw new LoginSampleException("Could not validate user");
            }
        } catch (SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     * the method checks if the email already exist in the database.
     * @param email
     * @throws DuplicateException
     */
    public void duplicateEmail(String email) throws DuplicateException {
        try {
            Connection con = DBManager.getConnection();
            String SQL = "SELECT email FROM Profile "
                    + "WHERE email=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                throw new DuplicateException("Email already exists");
            }
        } catch (SQLException ex) {
            throw new DuplicateException(ex.getMessage());
        }
    }




}
