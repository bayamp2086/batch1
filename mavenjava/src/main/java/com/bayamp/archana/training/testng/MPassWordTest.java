package com.bayamp.archana.training.testng;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class MPassWordTest {	

	private static CSVParser passwdParser;

	@DataProvider(name = "passwordFromCSVProvider")
	private static Object[][] passWordTestProvider() throws IOException {
		String filePath = "/Users/mohanakarthikeyan/github-workspace/newbatch1/mavenjava/src/main/resources/Testcase/passWordTestcase.csv";
		FileReader passwdReader = new FileReader (filePath);
		passwdParser = new CSVParser(passwdReader, CSVFormat.DEFAULT);
		List<CSVRecord> csvRows = passwdParser.getRecords();
		CSVRecord header = csvRows.get(0);
		Object[][] data = new Object[csvRows.size()-1][1];
		int counter = 0;
		for (int i =1; i<csvRows.size();i++) {
			CSVRecord row = csvRows.get(i);
			Map<String,String> mapData = new HashMap<String,String>();
			mapData.put(header.get(0), row.get(0));
			mapData.put(header.get(1), row.get(1));

			data[counter][0] = mapData;
			counter++;
		}
		System.out.println(csvRows.size());
		return data;
	}

	@Test(dataProvider = "passwordFromCSVProvider")
	public void testPassword(Map<String,String> data) {
		String expectedStringResultFromDataProvided = data.get("EXPECTED");
		String patternCheckedResult = MPasswordUtility.isCorrectPassword1(data.get("TESTVALUES"));
		Assert.assertTrue(expectedStringResultFromDataProvided.trim().equalsIgnoreCase(patternCheckedResult.trim()), 
				"failed for the comparison");
	}	
}


