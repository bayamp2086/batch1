package com.bayamp.archana.training.api;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {
	Properties prop;
	FileInputStream input;

	public BaseTest() {
		try{
			prop = new Properties();
			File fl = new File("/Users/mohanakarthikeyan/github-workspace/newbatch1/seleniummavenjava/src/main/java/com/bayamp/archana/training/selenium/api/apiConfig.properties");
			input = new FileInputStream(fl);
			prop.load(input);
			System.out.println();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
