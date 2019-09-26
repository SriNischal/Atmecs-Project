package com.atmecs.atmecsproject.testscripts;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.atmecs.atmecsproject.testsuite.AtmecsPageActions;
import com.atmecs.atmecsproject.testsuite.TestBase;
import com.atmecs.atmecsproject.utils.AtmecsProperties;
import com.atmecs.atmecsproject.validationresults.TestPagevalidate;

public class TestingPage extends TestBase{
	@Test
	public void test() throws IOException, InterruptedException, ParseException{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		AtmecsProperties atmprop=new AtmecsProperties();
		driver.findElement(By.xpath(atmprop.readtestPagePropertiesFile("testpage.insights.btn"))).click();
		//AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readtestPagePropertiesFile("testpage.insights.btn"));
		driver.findElement(By.xpath(atmprop.readtestPagePropertiesFile("testpage.blogs.btn"))).click();
		//AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readtestPagePropertiesFile("testpage.blogs.btn"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(atmprop.readtestPagePropertiesFile("testpage.title.btn"))).click();
		//AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readtestPagePropertiesFile("testpage.title.btn"));
		scroll.executeScript("window.scrollBy(0,2500)");
		driver.findElement(By.xpath(atmprop.readtestPagePropertiesFile("testpage.submit.btn"))).click();
		//AtmecsPageActions.clickOnElement(driver, "xpath", atmprop.readtestPagePropertiesFile("testpage.submit.btn"));
		TestPagevalidate.testPageValidate();
		//driver.quit();
	}
		

}
