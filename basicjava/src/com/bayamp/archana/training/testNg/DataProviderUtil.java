package com.bayamp.archana.training.testNg;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;

public class DataProviderUtil {
	@DataProvider(name = "getMyDataFromCSV")
	private static Object[][] getDataFromCSV() throws IOException {
		
		FileReader reader = new FileReader ("main/resources/Data/addition.csv");
		CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
		List<CSVRecord> csvRows = parser.getRecords();
		CSVRecord header = csvRows.get(0);
		
		Object[][] data = new Object[csvRows.size()-1][1];
		int counter = 0;
		for (int i =1; i<csvRows.size();i++) {
			CSVRecord row = csvRows.get(i);
			Map<String,Integer> mapData = new HashMap<String,Integer>();
			mapData.put(header.get(0), Integer.parseInt(row.get(0)));
			mapData.put(header.get(1), Integer.parseInt(row.get(1)));
			mapData.put(header.get(2), Integer.parseInt(row.get(2)));
			
			data[counter][0] = mapData;
			counter++;
		}
		System.out.println(csvRows.size());
		
		return data;
	}

}
