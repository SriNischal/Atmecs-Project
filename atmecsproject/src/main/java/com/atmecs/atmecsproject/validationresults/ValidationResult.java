package com.atmecs.atmecsproject.validationresults;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.atmecsproject.reports.LogReport;
import com.atmecs.atmecsproject.testsuite.TestBase;
import com.atmecs.atmecsproject.utils.AtmecsProperties;

public class ValidationResult extends TestBase {
	static String actualname;
	static String actualservices;
	static String actualcareers;
	static String actualcontact;
	static String actuallife;
	static String actualinfrastructure;
	static AtmecsProperties atmprop;
	static String expectedname = "Sitemap";
    static String expectedservices="Serivices";
    static String expectedcareers="Careers";
    static String expectedcontact="Contact Us";
    static String expectedlife="Digital Life";
    static String expectedinfrastructure="Infrastructure Services";
    public static void homePageValidate() throws Exception {
        LogReport log=new LogReport();
		actualname = driver.findElement(By.xpath("(//div[@class='widget-title'])[1]")).getText();
	    Assert.assertEquals(actualname, "Sitemap","Actual notequal expected");
	    log.info("Successfully validated sitemap");
	    actualservices=driver.findElement(By.xpath("(//div[@class='widget-title'])[2]")).getText();
	    Assert.assertEquals(actualservices,"Services","Actual notequal expected");
	    log.info("Successfully validated services");
	    actualcareers=driver.findElement(By.xpath("(//div[@class='widget-title'])[3]")).getText();
	    Assert.assertEquals(actualcareers,"Careers","Actual notequal expected");
	    log.info("Successfully validated careers");
	    actualcontact=driver.findElement(By.xpath("(//div[@class='widget-title'])[4]")).getText();
	    Assert.assertEquals(actualcontact,"Contact Us","Actual notequal expected");
	    log.info("Successfully validated contact us");
		
		  actuallife=driver.findElement(By.xpath("//a[text()='Digital Life']")).getText(); 
		  Assert.assertEquals(actuallife,"Digital Life","Actual notequal expected");
		  
		  actualinfrastructure=driver.findElement(By.xpath("//a[text()='Infrastructure Services']")).getText();
		  Assert.assertEquals(actualinfrastructure,"Infrastructure Services","Actual notequal expected");
		 
	    
	    
    }
}
