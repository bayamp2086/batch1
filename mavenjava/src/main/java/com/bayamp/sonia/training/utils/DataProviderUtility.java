package com.bayamp.sonia.training.utils;

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

import com.bayamp.sonia.training.annotation.File;

public class DataProviderUtility {

	@DataProvider(name = "SoniaData")
	private static Object[][] getDataFromMap() {

		Map<String, Integer> dataMap = new HashMap<String, Integer>();

		dataMap.put("numb1", 5);
		dataMap.put("numb2", 5);

		Map<String, Integer> dataMap1 = new HashMap<String, Integer>();

		dataMap1.put("numb1", 3);
		dataMap1.put("numb2", 4);

		Map<String, Integer> dataMap2 = new HashMap<String, Integer>();

		dataMap2.put("numb1", 1);
		dataMap2.put("numb2", 2);

		Object[][] data = { { dataMap }, { dataMap1 }, { dataMap2 } };

		return data;
	}

	@DataProvider(name = "getDatafromCSV")
	private static Object[][] getDatafromCSV(Method method) throws IOException {

		String fileName=getFileNamefromAnnotation(method);
		List<CSVRecord> csvRows = getCSVParser(fileName);
		CSVRecord header = csvRows.get(0);
		int counter = 0;
		Object outArr[][] = new Object[csvRows.size()-1][1];
		// System.out.println(csvRows.size());
		for (int i = 1; i < csvRows.size(); i++) {
			CSVRecord csv = csvRows.get(i);
			Map<String, String> listMap = new HashMap<String, String>();
			listMap.put(header.get(0), csv.get(0));
			listMap.put(header.get(1), csv.get(1));
			listMap.put(header.get(2), csv.get(2));
			outArr[counter][0] = listMap;
			counter++;
		}

		return outArr;
	}
	
	public static String getFileNamefromAnnotation(Method method) {
		
		File dataAnnotation = method.getAnnotation(File.class);
		String fileName = dataAnnotation.file();
		return fileName;
	}

	public static List<CSVRecord> getCSVParser(String filepath) throws IOException {

		FileReader reader = new FileReader(filepath);
		CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL);
		List<CSVRecord> csvRows = parser.getRecords();
		return csvRows;

	}
	
	@DataProvider(name="getDataforReverseString")
	private static Object[][] getDatafromCSVforReverseString(Method method) throws IOException{
		
		String fileName=getFileNamefromAnnotation(method);
		List<CSVRecord> csvRows=getCSVParser(fileName);
		
		CSVRecord header=csvRows.get(0);
		Object outArr[][] = new Object[csvRows.size()-1][1];
		int counter=0;
		for(int i=1;i<csvRows.size();i++) {
			
			CSVRecord value=csvRows.get(i);
			Map<String,String> reverseStrMap=new HashMap<String,String>();
			reverseStrMap.put(header.get(0), value.get(0));
			reverseStrMap.put(header.get(1), value.get(1));
			outArr[counter][0]=reverseStrMap;
			counter++;
		}
		return outArr;
		
	}	
		
		@DataProvider(name="getDataforPassword")
		private static Object[][] getDatafromCSVforPasswordMatching(Method method) throws IOException{
			
			String fileName=getFileNamefromAnnotation(method);
			List<CSVRecord> csvRows=getCSVParser(fileName);
			
			CSVRecord header=csvRows.get(0);
			Object outArr[][] = new Object[csvRows.size()-1][1];
			int counter=0;
			for(int i=1;i<csvRows.size();i++) {
				
				CSVRecord value=csvRows.get(i);
				Map<String,String> passwordMap=new HashMap<String,String>();
				passwordMap.put(header.get(0), value.get(0));
				passwordMap.put(header.get(1), value.get(1));
				outArr[counter][0]=passwordMap;
				counter++;
			}
			return outArr;
			
	}
		

		@DataProvider(name="checkPasswordLength")
		private static Object[][] getDatafromCSVforPasswordLength(Method method) throws IOException{
			
			String fileName=getFileNamefromAnnotation(method);
			List<CSVRecord> csvRows=getCSVParser(fileName);
			
			CSVRecord header=csvRows.get(0);
			Object outArr[][] = new Object[csvRows.size()-1][1];
			int counter=0;
			for(int i=1;i<csvRows.size();i++) {
				
				CSVRecord value=csvRows.get(i);
				outArr[counter][0]=value.get(0);
				counter++;
			}
			return outArr;
			
	}

}
