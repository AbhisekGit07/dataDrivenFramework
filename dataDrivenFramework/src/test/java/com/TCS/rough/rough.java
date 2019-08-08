package com.TCS.rough;

import java.io.FileInputStream;
import java.util.Properties;

public class rough {

	public static void main(String[] args)throws Exception {
		
		Properties config= new Properties();
		
			FileInputStream fis= new FileInputStream("E:\\My Workspace\\dataDrivenFramework\\src\\test\\resources\\properties\\config.properties");
		
				System.out.println(System.getProperty("user.dir"));
		
					config.load(fis);
		
						System.out.println(config.getProperty("implicitely.wait"));
		
		Properties OR= new Properties();
		
			FileInputStream orfis= new FileInputStream((System.getProperty("user.dir"))+"\\src\\test\\resources\\properties\\OR.properties");
		
				OR.load(orfis);
		
					System.out.println(OR.getProperty("implicitely.wait"));

	}

}
