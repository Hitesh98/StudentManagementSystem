package com.flipkart.business;

import com.flipkart.constants.USERTYPE;
import com.flipkart.dao.AuthDAO;
import com.flipkart.dao.AuthDAOImpl;
import com.flipkart.exception.UserNotFoundException;
import org.apache.log4j.Logger;

public class AuthServiceImpl implements AuthService {

    private static Logger logger = Logger.getLogger(AuthServiceImpl.class);
    private static AuthDAO authDao = new AuthDAOImpl();

    /**
     * Login user (student, professor and admin)
     * @param username  username
     * @param password  respective password
     * @return type of user if login was successful, else null
     */
    @Override
    public USERTYPE login(String username, String password) {
        try {
            return authDao.login(username, password);
        } catch (UserNotFoundException ex) {
            logger.error("User does not exist" + ex.getMessage());
            return null;
        }
    }

    /**
     * logout user (student, professor and admin)
     * @param username username of the user
     * @return true if logout was successful, else false.
     * @throws UserNotFoundException if no such user exists
     */
    @Override
    public boolean logout(String username) throws UserNotFoundException {
        try {
            authDao.logout(username);
            return true;
        } catch (UserNotFoundException ex) {
            logger.error(ex);
            return false;
        }
    }
}
