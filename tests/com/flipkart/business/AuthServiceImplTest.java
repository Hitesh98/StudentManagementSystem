package com.flipkart.business;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;
import com.flipkart.constants.GENDER;
import com.flipkart.constants.USERTYPE;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthServiceImplTest {

    private AuthServiceImpl authService;
    private AdminService adminService;
    private DummyConstants dummyConstants;


    @Before
    public void setUp() throws Exception {
        authService = new AuthServiceImpl();
        adminService = new AdminServiceImpl();
        dummyConstants = new DummyConstants();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void loginStudent() {
        adminService.addNewUser(dummyConstants.dummyStudent, DummyConstants.password);
        USERTYPE usertype = authService.login(DummyConstants.username, DummyConstants.password);
        assertEquals(USERTYPE.Student, usertype);
        adminService.deleteUser(DummyConstants.userid);
    }

    @Test
    public void loginProfessor() {
        adminService.addNewUser(dummyConstants.dummyProfessor, DummyConstants.password);
        USERTYPE usertype = authService.login(DummyConstants.username, DummyConstants.password);
        assertEquals(USERTYPE.Professor, usertype);
        adminService.deleteUser(DummyConstants.userid);
    }

    @Test
    public void loginAdmin() {
        adminService.addNewUser(dummyConstants.dummyAdmin, DummyConstants.password);
        USERTYPE usertype = authService.login(DummyConstants.username, DummyConstants.password);
        assertEquals(USERTYPE.Admin, usertype);
        adminService.deleteUser(DummyConstants.userid);
    }

    @Test
    public void loginInvalidUser() {
        USERTYPE usertype = authService.login("anyrandomusername", "randompassword");
        assertNull(usertype);
    }
}