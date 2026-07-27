package com.anil.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.anil.pages.LoginPage;

import io.qameta.allure.*;

@Epic("OrangeHRM")
@Feature("Login")
public class LoginTest extends BaseTest {

    @Test(description = "Verify valid login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify user can login with valid username and password")
    public void validLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("Admin", "admin123");

        Assert.assertTrue(loginPage.validCredentials());
    }

    @Test(description = "Verify invalid login")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify error message is displayed for invalid credentials")
    public void inValidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("anil", "1234");

        Assert.assertTrue(loginPage.invalidCredentials());
    }
}