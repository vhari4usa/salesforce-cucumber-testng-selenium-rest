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

public class Home extends UIUtils {

	org.apache.log4j.Logger log = LoggerClass.getThreadLogger("Thread" + Thread.currentThread().getName(), VariableManager.getInstance().getVariables().getVar("testCaseID").toString());

	WebDriver driver = null;
	String pageName = "Home Page";
	@FindBy(how = How.XPATH, using = "//*[@id='459:82;a']/div")
	WebElement Applaunch;
	@FindBy(how = How.XPATH, using = "//*[@id='07p5e000000xN5OAAU']/div/lightning-formatted-rich-text/span/p")
	WebElement ServiceApp;

	public Home(){
		this.driver = (WebDriver) VariableManager.getInstance().getVariables().getVar("driver");
		PageFactory.initElements(this.driver, this);
	}

	public void AppLaunch() throws InterruptedException {
		Thread.sleep(5000);
		clickElement(Applaunch, "Applaunch", this.pageName);
		Thread.sleep(5000);
		clickElement(ServiceApp, "ServiceApp", this.pageName);
		Thread.sleep(5000);
	}
}