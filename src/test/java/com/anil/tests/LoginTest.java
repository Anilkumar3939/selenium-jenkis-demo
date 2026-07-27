package com.anil.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.anil.pages.LoginPage;

public class LoginTest extends BaseTest{
    
    @Test
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        Assert.assertTrue(loginPage.validCredentials());
    }

    @Test
    public void inValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("anil","1234");
        Assert.assertTrue(loginPage.invalidCredentials());
    }
    
}
