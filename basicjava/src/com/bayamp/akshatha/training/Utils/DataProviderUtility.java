package com.bayamp.akshatha.training.Utils;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUtility {

	@DataProvider(name = "getMyDataFromArray")
	private static Object[][] getDataFromArray() {

		Object[] dataSet1 = { 5, 5 };
		Object[] dataSet2 = { 6, 6 };
		Object[] dataSet3 = { 7, 7 };
		Object[][] data = { { dataSet1 }, { dataSet2 }, { dataSet3 } };

		return data;
	}

	@DataProvider(name = "getMyDataFromCSV")
	private static Object[][] getDataFromCSV(Method m) throws IOException {

		// FileReader reader = new FileReader("main/resources/Data/addition.csv");
		System.out.println(m.getName());

		Data dataAnnotation = m.getAnnotation(Data.class);
		System.out.println(dataAnnotation);
		if (dataAnnotation != null) {
			String file = dataAnnotation.file();

			FileReader reader = new FileReader(file);

			CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
			List<CSVRecord> csvRows = parser.getRecords();

			CSVRecord header = csvRows.get(0);

			Object[][] data = new Object[csvRows.size() - 1][1];

			int counter = 0;

			for (int i = 1; i < csvRows.size(); i++) {
				CSVRecord row = csvRows.get(i);
				Map<String, Integer> mapData = new HashMap<String, Integer>();

				mapData.put(header.get(0), Integer.parseInt(row.get(0)));
				mapData.put(header.get(1), Integer.parseInt(row.get(1)));
				mapData.put(header.get(2), Integer.parseInt(row.get(2)));

				data[counter][0] = mapData;

				counter++;

			}
			return data;
			
		} else {
			return null;
		}

	}
}