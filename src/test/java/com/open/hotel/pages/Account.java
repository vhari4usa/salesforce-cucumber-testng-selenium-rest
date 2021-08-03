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

	@FindBy(how = How.XPATH, using = "//*[@id='Account_Tab']/a")
	WebElement Account;

	@FindBy(how = How.NAME, using = "new")
	WebElement CreateAccountNew;

	@FindBy(how = How.NAME, using = "acc2")
	WebElement AccountName;

	@FindBy(how = How.NAME, using = "save")
	WebElement SaveButton;

	public Account(){
		this.driver = (WebDriver) VariableManager.getInstance().getVariables().getVar("driver");
		PageFactory.initElements(this.driver, this);
	}

	public void ClickAccountMenu(){
		clickElement(Account, "Account", this.pageName);
	}

	public void CreateNewAccountMandatoryFirlds(){
		clickElement(CreateAccountNew, "CreateAccountNew", this.pageName);
		type(AccountName, "This From Selenium Test","AccountName", this.pageName);
		clickElement(SaveButton, "SaveButton", this.pageName);
	}

	public void CreateNewAccountAllFirlds(){
		clickElement(CreateAccountNew, "CreateAccountNew", this.pageName);
		type(AccountName, "This From Selenium Test","AccountName", this.pageName);
		clickElement(SaveButton, "SaveButton", this.pageName);
	}
}