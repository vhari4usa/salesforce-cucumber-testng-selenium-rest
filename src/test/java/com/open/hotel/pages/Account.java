package com.open.hotel.pages;

import com.open.hotel.config.Config;
import com.open.hotel.logger.LoggerClass;
import com.open.hotel.security.Security;
import com.open.hotel.threadVariables.VariableManager;
import com.open.hotel.uiUtils.UIUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Account extends UIUtils {

	org.apache.log4j.Logger log = LoggerClass.getThreadLogger("Thread" + Thread.currentThread().getName(), VariableManager.getInstance().getVariables().getVar("testCaseID").toString());

	WebDriver driver = null;
	String pageName = "Account Page";

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/a/span")
	WebElement Account;

	@FindBy(how = How.XPATH, using = "//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div")
	WebElement CreateAccountNew;


	public Account(){
		this.driver = (WebDriver) VariableManager.getInstance().getVariables().getVar("driver");
		PageFactory.initElements(this.driver, this);
	}

	public void ClickAccountMenu(){
		clickElement(Account, "Account", this.pageName);
	}

	public void CreatAccount(){
		clickElement(CreateAccountNew, "CreateAccountNew", this.pageName);
	}
}