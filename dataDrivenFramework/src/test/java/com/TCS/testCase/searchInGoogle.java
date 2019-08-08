package com.TCS.testCase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.TCS.base.*;
public class searchInGoogle extends testBase {
	
	@Test
	public void searchGoogle() {
		driver.findElement(By.xpath(OR.getProperty("searchBox"))).sendKeys("selenium");
		
	}

	
}
