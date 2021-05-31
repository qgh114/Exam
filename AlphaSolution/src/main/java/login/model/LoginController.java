package login.model;

import login.dataAccess.DataFacade;


public class LoginController {

    // facade to datasource layer
    private DataFacade facade = null;

    /**
     * @param facade
     */
    public LoginController(DataFacade facade) {
        this.facade = facade;
    }

    /**
     * The login method receives information from FrontController and parses it through to the Datafacade Class
     * @param email
     * @param password
     * @return User
     * @throws LoginSampleException
     */
    public User login(String email, String password) throws LoginSampleException {
        return facade.login(email, password);
    }

    /**
     * The createUser method receives information from FrontController and makes a new instance of User whereas it
     * parses it through to the Datafacade Class
     * @param email
     * @param password
     * @return User
     * @throws LoginSampleException
     */
    public User createUser(String email, String password) throws LoginSampleException {

        User user = new User(email, password);
        return facade.createUser(user);
    }

    /**
     * The duplicateEmail method receives information from FrontController and parses it through to the Datafacade Class
     * @param email
     * @throws DuplicateException
     */
    public void duplicateEmail(String email) throws DuplicateException {
        facade.duplicateEmail(email);
    }


}
