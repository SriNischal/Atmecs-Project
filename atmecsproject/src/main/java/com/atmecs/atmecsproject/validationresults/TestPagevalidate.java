package com.atmecs.atmecsproject.validationresults;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.atmecsproject.reports.LogReport;
import com.atmecs.atmecsproject.testsuite.TestBase;
import com.atmecs.atmecsproject.utils.AtmecsProperties;

public class TestPagevalidate extends TestBase{
	static String actualbreadcrumb;
	static String actualtitle;
	static String actualdate;
	static String actualdata;
	static String actualcontent;
	static AtmecsProperties atmprop;
	static String expectedbreadcrumb="Home › AI › Debunking Myths about AI";
	static String expectedtitle="Debunking Myths about AI";
	static String expecteddate="March 15, 2019";
	static String expectedcontent="Of all the cutting-edge technologies today, Artificial Intelligence is arguably the most important one, given its wide range of potential and prominence. However, AI too has been a victim of some myths and misconceptions which usually surround anything that is popular. Here’s an infographic to debunk the most common myths about AI.";
	public static void testPageValidate() {
		LogReport log=new LogReport();
		actualbreadcrumb=driver.findElement(By.xpath("//div[@class='breadcrumb-list']")).getText();
		Assert.assertEquals(actualbreadcrumb, "Home › AI › Debunking Myths about AI","Actual notequal expected");
		log.info("Successfully validated breadcrumb");
		
		actualtitle=driver.findElement(By.xpath("//h1[@class='entry-title post-title responsive']")).getText();
		Assert.assertEquals(actualtitle, "Debunking Myths about AI","Actual notequal expected");
		log.info("Successfully validated title");
		
		actualdate=driver.findElement(By.xpath("//time[@class='timestamp updated']")).getText();
		Assert.assertEquals(actualdate, "March 15, 2019","Actual notequal expected");
		log.info("Successfully validated date");
		
		actualcontent=driver.findElement(By.xpath("//p[text()='Of all the cutting-edge technologies today, Artificial Intelligence is arguably the most important one, given its wide range of potential and prominence. However, AI too has been a victim of some myths and misconceptions which usually surround anything that is popular. Here’s an infographic to debunk the most common myths about AI.']")).getText();
		Assert.assertEquals(actualcontent, "Of all the cutting-edge technologies today, Artificial Intelligence is arguably the most important one, given its wide range of potential and prominence. However, AI too has been a victim of some myths and misconceptions which usually surround anything that is popular. Here’s an infographic to debunk the most common myths about AI.","Actual notequal expected");
		log.info("Successfully validated content");
	}

}
