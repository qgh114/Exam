package login.model;


public class User {

    private String email;
    private String password;
    private int profileId;

    /**
     * @param email
     * @param password
     */
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    /**
     * @return int profileId
     */

    public int getProfileId() {
        return profileId;
    }

    /**
     * @param profileId
     */
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    /**
     * @return String email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @return String password
     */
    public String getPassword() {
        return password;
    }




}

