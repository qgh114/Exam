package login.model;

import login.dataAccess.DataFacade;

public class LoginController {

    // facade to datasource layer
    private DataFacade facade = null;

    public LoginController(DataFacade facade) {
        this.facade = facade;
    }

    public User login(String email, String password) throws LoginSampleException {
        return facade.login(email, password);
    }

    public User createUser(String email, String password) throws LoginSampleException {

        User user = new User(email, password);
        return facade.createUser(user);
    }

    public void duplicateEmail(String email) throws DuplicateException {
        facade.duplicateEmail(email);
    }


}
