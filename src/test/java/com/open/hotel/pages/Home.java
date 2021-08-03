package com.open.hotel.pages;

import com.open.hotel.config.Config;
import com.open.hotel.logger.LoggerClass;
import com.open.hotel.security.Security;
import com.open.hotel.threadVariables.VariableManager;
import com.open.hotel.uiUtils.UIUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class Home extends UIUtils {

	org.apache.log4j.Logger log = LoggerClass.getThreadLogger("Thread" + Thread.currentThread().getName(), VariableManager.getInstance().getVariables().getVar("testCaseID").toString());

	WebDriver driver = null;
	String pageName = "Home Page";

	//@FindBy(how = How.XPATH, using = "//*[@id='459:82;a']/div")
	//WebElement Applaunch;

	@FindBy(how = How.ID, using = "tsidLabel")
	WebElement Applaunch;

	@FindBy(how = How.XPATH, using = "//*[@id='tsid-menuItems']/a[1]")
	WebElement ServiceApp;

	@FindBy(how = How.ID, using = "tryLexDialogX")
	WebElement LightingPopup;

	public Home(){
		this.driver = (WebDriver) VariableManager.getInstance().getVariables().getVar("driver");
		PageFactory.initElements(this.driver, this);
	}

	public void AppLaunch() throws InterruptedException {
		//Thread.sleep(2000);
		clickElement(Applaunch, "Applaunch", this.pageName);
		//Thread.sleep(2000);
		clickElement(ServiceApp, "ServiceApp", this.pageName);
		//Thread.sleep(2000);
		clickElement(LightingPopup, "LightingPopup", this.pageName);
	}
}