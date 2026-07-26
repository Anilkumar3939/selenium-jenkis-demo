package com.anil.tests;

import org.testng.annotations.Test;
import com.anil.pages.LoginPage;

public class LoginTest extends BaseTest{
    
    @Test
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
    }
    
}
