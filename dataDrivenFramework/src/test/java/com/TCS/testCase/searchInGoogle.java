package com.TCS.testCase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TCS.base.*;
public class searchInGoogle extends testBase {
	
	@Test
	public void searchGoogle() {
		driver.findElement(By.xpath(OR.getProperty("searchBox"))).sendKeys("selenium");
		hardWait(2);
		applog.debug("Keyword printed");
		driver.findElement(By.xpath(OR.getProperty("logo"))).click();
		hardWait(2);
		applog.debug("Clicked on logo");
		driver.findElement(By.xpath(OR.getProperty("btnSearch"))).click();
		hardWait(2);
		applog.debug("Clicked on search button");
		Assert.assertTrue(isDisplay(By.xpath(OR.getProperty("expectedText"))));
		hardWait(2);
		applog.debug("Text Verified");
		
	}

	
}
