package com.bayamp.chaya.training.dataproviderutility;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgramTest {
	@DataProvider(name = "getMyData")
	public static Object[][] getData() {

		int[] dataSet1 = { 5, 5 };
		int[] dataSet2 = { 6, 6 };
		int[] dataSet3 = { 7, 7 };
		Object[][] data = { { dataSet1 }, { dataSet2 }, { dataSet3 } };

		/*
		 * Object[][] data = new Object[3][2];
		 * 
		 * Object[] dataSet1 = { 5, 5 }; Object[] dataSet2 = { 6, 6 }; Object[]
		 * dataSet3 = { 7, 7 };
		 * 
		 * data[0] = dataSet1; data[1] = dataSet2; data[2] = dataSet3;
		 */
		return data;

	}

	@DataProvider(name = "getMyDatafromhashMap")
	public static Object[][] getDatahashMap() {
		Map<String, Integer> data1 = new HashMap<String, Integer>();
		data1.put("num1", 5);
		data1.put("num2", 5);
		data1.put("expected", 10);
		Map<String, Integer> data2 = new HashMap<String, Integer>();
		data2.put("num1", 6);
		data2.put("num2", 6);
		data2.put("expected", 12);
		Map<String, Integer> data3 = new HashMap<String, Integer>();
		data3.put("num1", 7);
		data3.put("num2", 7);
		data3.put("expected", 14);
		Object[][] data = { { data1 }, { data2 }, { data3 } };
		return data;

	}

	@DataProvider(name = "getMyDatafromCSV")
	private static Object[][] getDataFromCsv() throws Exception {
		FileReader reader = new FileReader("src/main/resources/testFile.csv");

		CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
		List<CSVRecord> csvRows = parser.getRecords();
		CSVRecord header = csvRows.get(0);

		Object[][] data = new Object[csvRows.size() - 1][1];
		int counter = 0;
		for (int i = 1; i < csvRows.size(); i++) {
			CSVRecord row = csvRows.get(i);
			Map<String, Integer> myData = new HashMap<String, Integer>();
			myData.put(header.get(0).trim(), Integer.parseInt(row.get(0).trim()));
			myData.put(header.get(1).trim(), Integer.parseInt(row.get(1).trim()));
			myData.put(header.get(2).trim(), Integer.parseInt(row.get(2).trim()));

			data[counter][0] = myData;
			counter++;
		}

		return data;

	}
	@DataProvider(name="isprime")
	public static Object[][] isPrime(){
		Object[][] myData ={{2,true},{6,false},{17,true}};
		return myData;
		
		
		
	}


}
