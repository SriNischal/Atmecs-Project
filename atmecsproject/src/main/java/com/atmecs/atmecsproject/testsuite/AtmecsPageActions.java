package com.atmecs.atmecsproject.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.atmecsproject.reports.LogReport;
public class AtmecsPageActions extends TestBase {
	public static void selectDropdown(String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);
	}

	public static boolean clickOnElement(WebDriver driver,String locator, String locatorValue) {
		LogReport log = new LogReport();

		WebDriverWait wait = new WebDriverWait(driver, 15);
		boolean isClicked = true;

		try {
		switch (locator) {
		case "CLASSNAME":
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		driver.findElement(By.className(locatorValue)).click();
		break;
		case "CSSSELECTOR":
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		driver.findElement(By.cssSelector(locatorValue)).click();
		break;
		case "ID":
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		driver.findElement(By.id(locatorValue)).click();
		break;
		case "LINKTEXT":
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		driver.findElement(By.linkText(locatorValue)).click();
		break;
		case "NAME":
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		driver.findElement(By.name(locatorValue)).click();
		break;
		case "PARTIALLINKTEXT":
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		driver.findElement(By.partialLinkText(locatorValue)).click();
		break;
		case "TAGNAME":
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		driver.findElement(By.tagName(locatorValue)).click();
		break;
		case "XPATH":
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		driver.findElement(By.xpath(locatorValue)).click();
		break;
		default:
		break;
		}
		} catch (IllegalArgumentException illegalArgumentException) {
		isClicked = false;
		log.info("Locator type doesn't exist" + illegalArgumentException.getCause());
		} catch (NullPointerException nullPointerException) {
		isClicked = false;
		log.info("Locator type doesn't exist " + nullPointerException.getCause());
		} catch (Exception e) {
		isClicked = false;
		}

		return isClicked;

		}

		
		
		public static boolean sendKeys(WebDriver driver,String locator, String locatorValue, String string) {
			LogReport log = new LogReport();

			WebDriverWait wait = new WebDriverWait(driver, 15);
			boolean isClicked = true;

			try {
			switch (locator) {
			case "CLASSNAME":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
			driver.findElement(By.className(locatorValue)).sendKeys();
			break;
			case "CSSSELECTOR":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
			driver.findElement(By.cssSelector(locatorValue)).sendKeys();
			break;
			case "ID":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
			driver.findElement(By.id(locatorValue)).sendKeys();
			break;
			case "LINKTEXT":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
			driver.findElement(By.linkText(locatorValue)).sendKeys();
			break;
			case "NAME":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
			driver.findElement(By.name(locatorValue)).sendKeys();
			break;
			case "PARTIALLINKTEXT":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys();
			break;
			case "TAGNAME":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
			driver.findElement(By.tagName(locatorValue)).sendKeys();
			break;
			case "XPATH":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
			driver.findElement(By.xpath(locatorValue)).sendKeys();
			break;
			default:
			break;
			}
			} catch (IllegalArgumentException illegalArgumentException) {
			isClicked = false;
			log.info("Locator type doesn't exist" + illegalArgumentException.getCause());
			} catch (NullPointerException nullPointerException) {
			isClicked = false;
			log.info("Locator type doesn't exist " + nullPointerException.getCause());
			} catch (Exception e) {
			isClicked = false;
			}

			return isClicked;

			}
		
		public static boolean sendKeys(WebDriver driver,Keys enter,String locator, String locatorvalue) {
			LogReport log = new LogReport();

			WebDriverWait wait = new WebDriverWait(driver, 15);
			boolean isClicked = true;

			try {
			switch (locator) {
			case "CLASSNAME":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
			driver.findElement(By.className(locatorvalue)).sendKeys(Keys.ENTER);
			break;
			case "CSSSELECTOR":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(Keys.ENTER);
			break;
			case "ID":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
			driver.findElement(By.id(locatorvalue)).sendKeys(Keys.ENTER);
			break;
			case "LINKTEXT":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
			driver.findElement(By.linkText(locatorvalue)).sendKeys(Keys.ENTER);
			break;
			case "NAME":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
			driver.findElement(By.name(locatorvalue)).sendKeys(Keys.ENTER);
			break;
			case "PARTIALLINKTEXT":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
			driver.findElement(By.partialLinkText(locatorvalue)).sendKeys(Keys.ENTER);
			break;
			case "TAGNAME":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
			driver.findElement(By.tagName(locatorvalue)).sendKeys(Keys.ENTER);
			break;
			case "XPATH":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorvalue)));
			driver.findElement(By.xpath(locatorvalue)).sendKeys(Keys.ENTER);
			break;
			default:
			break;
			}
			} catch (IllegalArgumentException illegalArgumentException) {
			isClicked = false;
			log.info("Locator type doesn't exist" + illegalArgumentException.getCause());
			} catch (NullPointerException nullPointerException) {
			isClicked = false;
			log.info("Locator type doesn't exist " + nullPointerException.getCause());
			} catch (Exception e) {
			isClicked = false;
			}

			return isClicked;

			}
	}
