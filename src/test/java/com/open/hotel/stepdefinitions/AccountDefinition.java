package com.open.hotel.stepdefinitions;

import com.open.hotel.config.Config;
import com.open.hotel.pages.Account;
import com.open.hotel.pages.Home;
import com.open.hotel.pages.Login;
import com.open.hotel.threadVariables.VariableManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AccountDefinition {

    Account account = null;

    @Then("Click Account Menu")
    public void Click_Account_Menu() throws Exception {
        account = new Account();
        account.ClickAccountMenu();
    }

    @Then("Create New Account")
    public void Create_New_Account() throws Exception {
        account.CreatAccount();
    }
}