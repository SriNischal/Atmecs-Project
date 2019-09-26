package com.atmecs.atmecsproject.testsuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import com.atmecs.atmecsproject.constants.ProjectBaseConstantPaths;
import com.atmecs.atmecsproject.reports.LogReport;
import com.atmecs.atmecsproject.utils.AtmecsProperties;

public class TestBase {

	public static WebDriver driver;
	LogReport log = new LogReport();
	String url;

	@BeforeTest
	public void invokeBrowser() throws IOException {

		String base = AtmecsProperties.readConfig("Browser");
		url = AtmecsProperties.readConfig("Url");
//to load chrome browser run it
		if (base.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ProjectBaseConstantPaths.CHROME_FILE);
			driver = new ChromeDriver();
			log.info("Chrome browser started...");

		}
//to load firefox browser and run it
		else if (base.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ProjectBaseConstantPaths.FIREFOX_FILE);
			driver = new FirefoxDriver();
			log.info("Firefox browser started...");

		}
//to load ie browser and run it
		else if (base.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ProjectBaseConstantPaths.IE_FILE);
			driver = new InternetExplorerDriver();
			log.info("IE browser started...");
		}
//to open the given url and maximize the window
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("Application is open...");
	}
}
