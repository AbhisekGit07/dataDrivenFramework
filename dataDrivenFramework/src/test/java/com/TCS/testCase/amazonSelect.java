package com.TCS.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TCS.base.testBase;

public class amazonSelect extends testBase {

	@Test(dataProvider="getData")
	public void amazonSelected(String fedvalue) {
		
		Select drSelect = new Select(driver.findElement(By.xpath(OR.getProperty("amdrpdwn"))));
			
			List<WebElement> drList = drSelect.getOptions();
		
				int drSize = drList.size();
					
					System.out.println(drSize);
					
					for(int i=0; i<drSize; i++) {
						
						String drValue = drSelect.getOptions().get(i).getText();
						
						System.out.println(drValue);
							
							if(drValue.equals(fedvalue)) {
								
								//drSelect.selectByValue("search-alias=watches");
								
								drSelect.selectByVisibleText(fedvalue);
								
									hardWait(5);
									
										Actions action = new Actions(driver);
								
											action.sendKeys(Keys.ENTER).build().perform();
											
												hardWait(5);
							}
					}
					
			}
	@DataProvider
	public Object[][] getData(){
		String sheetName = "Sheet2";
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
