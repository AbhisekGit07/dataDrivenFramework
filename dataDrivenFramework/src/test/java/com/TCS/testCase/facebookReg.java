package com.TCS.testCase;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.TCS.base.*;

import org.openqa.selenium.support.ui.*;
public class facebookReg extends testBase{
	
	@Test(dataProvider="getData")
	public void fbReg(String frstName, String lastName, String emailOrPh, String pssWd ){
		
		driver.findElement(By.xpath(OR.getProperty("Firstname"))).sendKeys(frstName);
		hardWait(2);
		applog.debug("first name provided");
		driver.findElement(By.xpath(OR.getProperty("Lastname"))).sendKeys(lastName);
		hardWait(2);
		applog.debug("last name provided");
		driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys(emailOrPh);
		hardWait(2);
		applog.debug("phone number provided");
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys(pssWd);
		hardWait(2);
		applog.debug("password provided");
		
		//Select yr = new Select(driver.findElement(By.xpath(OR.getProperty("year"))));
			
		//	yr.selectByVisibleText("1991");
			
			
		driver.findElement(By.xpath(OR.getProperty("Sex"))).click();
		hardWait(1);
		applog.debug("gender selection completed");
	
		driver.findElement(By.xpath(OR.getProperty("Submit"))).click();
		hardWait(1);
		applog.debug(" Submitted ");
		hardWait(2);
		//driver.switchTo().alert().dismiss();
		String parentWindow= driver.getWindowHandle();
		Set<String> childWindows= driver.getWindowHandles();
		for(String handle:childWindows)
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath(OR.getProperty("okbtn"))).click();
		}
		driver.switchTo().window(parentWindow);
	}
		@DataProvider
		public Object[][] getData(){
			String sheetName = "Sheet1";
			int rows = excel.getRowCount(sheetName);
			int cols = excel.getColumnCount(sheetName);
			
			Object[][] data = new Object[rows-1][cols];
			
			for(int rowNum = 2; rowNum<=rows;rowNum++) {
				for(int colNum=0;colNum<cols; colNum++) {
					data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
				}
			}
			return data;
		}
		
	}


