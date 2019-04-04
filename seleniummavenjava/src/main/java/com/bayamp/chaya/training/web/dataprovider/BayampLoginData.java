package com.bayamp.chaya.training.web.dataprovider;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;

public class BayampLoginData {
	@DataProvider(name = "getMyNegativeDataFromCSV")
	public static Object[][] negativeLoginData() throws IOException{
		FileReader reader = new FileReader("src/main/resources/CSV/BayAmpLoginNegativeData.csv");

		CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
		List<CSVRecord> csvRows = parser.getRecords();
		CSVRecord header = csvRows.get(0);
		Object[][] data = new Object[csvRows.size() - 1][1];
		int counter = 0;
		for (int i = 1; i < csvRows.size(); i++) {
			CSVRecord row = csvRows.get(i);
			Map<String, String> myData = new HashMap<String, String>();
			myData.put(header.get(0).trim(), row.get(0).trim());
			myData.put(header.get(1).trim(), row.get(1).trim());
			data[counter][0] = myData;
			counter++;
		}
		return data;
	}

}
