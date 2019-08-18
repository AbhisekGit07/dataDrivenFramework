package com.TCS.testCase;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import com.TCS.base.*;

import org.openqa.selenium.support.ui.*;
public class facebookReg extends testBase{
	
	@Test
	public void fbReg(){
		
		driver.findElement(By.xpath(OR.getProperty("Firstname"))).sendKeys("Biltu");
		hardWait(2);
		applog.debug("first name provided");
		driver.findElement(By.xpath(OR.getProperty("Lastname"))).sendKeys("Ghosh");
		hardWait(2);
		applog.debug("last name provided");
		driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("9051777503");
		hardWait(2);
		applog.debug("phone number provided");
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("9051@biltu");
		hardWait(2);
		applog.debug("password provided");
		
		Select yr = new Select(driver.findElement(By.xpath("year")));
			
			yr.selectByVisibleText("1991");
			
			
		driver.findElement(By.xpath(OR.getProperty("Sex"))).click();
		hardWait(1);
		applog.debug("gender selection completed");
		driver.findElement(By.xpath(OR.getProperty("Submit"))).click();
		hardWait(1);
		applog.debug(" Submitted ");
		//hardWait(2);
		//driver.switchTo().alert().dismiss();
	}

}
