package com.atmecs.atmecsproject.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.atmecs.atmecsproject.testsuite.AtmecsPageActions;
import com.atmecs.atmecsproject.testsuite.TestBase;
import com.atmecs.atmecsproject.utils.AtmecsProperties;
import com.atmecs.atmecsproject.validationresults.ValidationResult;

public class HomePage extends TestBase{
	@Test
	public void home() throws Exception {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		AtmecsProperties atmprop=new AtmecsProperties();
		//driver.findElement(By.xpath( atmprop.readHomePagePropertiesFile("homepage.home.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("homepage.home.btn"));
		scroll.executeScript("window.scrollBy(0,25000)");
		ValidationResult.homePageValidate();
		//driver.findElement(By.xpath(atmprop.readHomePagePropertiesFile("homepage.about.btn"))).click();;
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("homepage.about.btn"));
		ValidationResult.homePageValidate();
		//driver.findElement(By.xpath(atmprop.readHomePagePropertiesFile("homepage.services.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("homepage.services.btn"));
		scroll.executeScript("window.scrollBy(0,1200)");
		ValidationResult.homePageValidate();
		//driver.findElement(By.xpath(atmprop.readHomePagePropertiesFile("homepage.partners.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("homepage.partners.btn"));
		scroll.executeScript("window.scrollBy(0,500)");
		ValidationResult.homePageValidate();
		//driver.findElement(By.xpath(atmprop.readHomePagePropertiesFile("homepage.media.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("homepage.media.btn"));
		//driver.findElement(By.xpath(atmprop.readHomePagePropertiesFile("homepage.news.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("homepage.news.btn"));
		ValidationResult.homePageValidate();
		//driver.findElement(By.xpath(atmprop.readHomePagePropertiesFile("homepage.insights.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("homepage.insights.btn"));
		//driver.findElement(By.xpath(atmprop.readHomePagePropertiesFile("homepage.casestudies.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("homepage.casestudies.btn"));
		scroll.executeScript("window.scrollBy(0,2500)");
		ValidationResult.homePageValidate();
		//driver.findElement(By.xpath(atmprop.readHomePagePropertiesFile("homepage.careers.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath",atmprop.readHomePagePropertiesFile("homepage.career.btn"));
		scroll.executeScript("window.scrollBy(0,1000)");
		ValidationResult.homePageValidate();
		//driver.findElement(By.xpath( atmprop.readHomePagePropertiesFile("homepage.contact.btn"))).click();
		AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readHomePagePropertiesFile("(homepage.contact.btn"));
		scroll.executeScript("window.scrollBy(0,1500)");
		ValidationResult.homePageValidate();
		driver.quit();
	}

}
