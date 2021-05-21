package login.model;


public class User {

    private String email;
    private String password;
    private int profileId;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, int profileId) {
        this.email = email;
        this.password = password;
        this.profileId = profileId;
    }
    public User() {
    }

    public User(int profileId) {
        this.profileId=profileId;
    }

    public User(String email) {
        this.email = email;

    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }



}

