package com.bayamp.sonia.training.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;

import com.bayamp.sonia.training.annotation.DataFile;

public class DataProviderUtility {
	
	
	
	@DataProvider(name="SoniaData")
	private static Object[][] getDataFromMap(){
		

		Map <String,Integer> dataMap=new HashMap<String,Integer> ();
		
		dataMap.put("numb1", 5);
		dataMap.put("numb2", 5);
		
		Map <String,Integer> dataMap1=new HashMap<String,Integer> ();
		
		dataMap1.put("numb1", 3);
		dataMap1.put("numb2", 4);
		
		
		Map <String,Integer> dataMap2=new HashMap<String,Integer> ();
		
		dataMap2.put("numb1", 1);
		dataMap2.put("numb2", 2);
		
		Object[][]data= {{dataMap},{dataMap1},{dataMap2}};
		
		return data;
	}
	@DataProvider(name="getDatafromCSV")
	private static Object[][] getDatafromCSV(Method method) throws IOException{
		

		
		DataFile dataAnnotation =method.getAnnotation(DataFile.class);
		String fileName=dataAnnotation.file();
		List<CSVRecord> csvRows=getCSVParser(fileName);
		CSVRecord header=csvRows.get(0);
		int counter=0;
		Object outArr[][]=new Object[csvRows.size()][1];
		//System.out.println(csvRows.size());
		for(int i=1;i<csvRows.size();i++) {
			CSVRecord csv=csvRows.get(i);
			Map<String, String> listMap=new HashMap<String,String>();
			listMap.put(header.get(0), csv.get(0));
			listMap.put(header.get(1), csv.get(1));
			listMap.put(header.get(2), csv.get(2));
			outArr[counter][0]= listMap;
			counter++;
		}
		
		
		
		return outArr;
	}
	
	public static List<CSVRecord> getCSVParser(String filepath) throws IOException {
		
		FileReader reader=new FileReader(filepath);
		CSVParser parser=new CSVParser(reader,CSVFormat.EXCEL);
		List<CSVRecord> csvRows=parser.getRecords();
		return csvRows;
		
	}

}
