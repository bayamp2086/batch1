package com.bayamp.training.sonia.javaprogram;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;

import com.bayamp.training.sonia.javaprogram.DataFile;

public class DataProviderUtility {

	@DataProvider(name = "SubStringData1")
	private static Object[][] getDataFromMap() {

		Map<String, Boolean> dataMap = new HashMap<String, Boolean>();

		dataMap.put("ery", true);
		dataMap.put("vood", false);
		dataMap.put("day", true);
		dataMap.put("a", true);
		dataMap.put("Its", true);
		dataMap.put("hari", false);
		dataMap.put("Its a very good day", true);

		Object[][] data = { { dataMap } };

		return data;
	}

	@DataProvider(name = "SubStringData")
	private static Object[][] getDatafromCSVforReverseString(Method method) throws IOException {

		String fileName = getFileNamefromAnnotation(method);
		List<CSVRecord> csvRows = getCSVParser(fileName);

		CSVRecord header = csvRows.get(0);
		Object outArr[][] = new Object[csvRows.size() - 1][1];
		int counter = 0;
		for (int i = 1; i < csvRows.size(); i++) {

			CSVRecord value = csvRows.get(i);
			Map<String, String> reverseStrMap = new HashMap<String, String>();
			reverseStrMap.put(header.get(0), value.get(0));
			reverseStrMap.put(header.get(1), value.get(1));
			outArr[counter][0] = reverseStrMap;
			counter++;
		}
		return outArr;

	}

	public static String getFileNamefromAnnotation(Method method) {

		DataFile dataAnnotation = method.getAnnotation(DataFile.class);
		String fileName = dataAnnotation.file();
		return fileName;
	}

	public static List<CSVRecord> getCSVParser(String filepath) throws IOException {

		FileReader reader = new FileReader(filepath);
		CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL);
		List<CSVRecord> csvRows = parser.getRecords();
		return csvRows;

	}

}
