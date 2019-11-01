package com.TCS.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.TCS.base.testBase;

public class amazonSelect extends testBase {

	@Test
	public void amazonSelect() {
		
		Select drSelect = new Select(driver.findElement(By.xpath(OR.getProperty("amdrpdwn"))));
			
			List<WebElement> drList = drSelect.getOptions();
		
				int drSize = drList.size();
					
					System.out.println(drSize);
					
					for(int i=0; i<drSize; i++) {
						
						String drValue = drSelect.getOptions().get(i).getText();
						
						System.out.println(drValue);
							
							if(drValue.equals("Watches")) {
								
								//drSelect.selectByValue("search-alias=watches");
								
								drSelect.selectByVisibleText("Watches");
							}
					}
					
			}
	
	}
