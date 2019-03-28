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

	@DataProvider(name = "getMyDataFromPassWordCSV")
	private static Object[][] getMyDataFromPassWordCSV() throws IOException {
	String filePath = "/Users/mohanakarthikeyan/github-workspace/newbatch1/mavenjava/src/main/resources/Testcase/passWTestcase.csv";
	FileReader reader = new FileReader (filePath);
	CSVParser parse = new CSVParser(reader, CSVFormat.DEFAULT);
	List<CSVRecord> csvRows = parse.getRecords();
	CSVRecord header = csvRows.get(0);
	Object[][] data = new Object[csvRows.size()-1][1];
	int counter = 0;
	for (int i =1; i<csvRows.size();i++) {
		CSVRecord row = csvRows.get(i);
		Map<String,String> mapData = new HashMap<String,String>();
		mapData.put(header.get(0), row.get(0));
		mapData.put(header.get(1), row.get(1));
		//mapData.put(header.get(2), row.get(2));
		data[counter][0] = mapData;
		counter++;
	}
	System.out.println(csvRows.size());
	
	return data;
	}
	
	@Test(dataProvider = "getMyDataFromPassWordCSV")
	public void positiveValues(Map<String,String> data) {
		boolean actual = MPasswordUtility.isCorrectPassword(data.get("TESTVALUES"));
		String expected = data.get("EXPECTED");
		//String expected1= expected.replaceAll("\\s+","");
		Assert.assertEquals(actual, expected);
	}
	
	
}
	/*@Test(expectedExceptions = {RuntimeException.class })
	public static void exceptionThrownWithNegativeValues() throws Exception  {
		String inputData = null;
		boolean expected = MPasswordUtility.isCorrectPassword(inputData);
		//throw new ArithmeticException();
	}*/
	

	/*@Test(expectedExceptions = {RuntimeException.class })
	public static void exceptionThrownWithNegativeValues() throws Exception  {
		String inputData = null;
		boolean expected = MPasswordUtility.isCorrectPassword(inputData);
		//throw new ArithmeticException();
	}
	@ Test()
	public static void positiveValues() {
		String input ="Archu19@";
		boolean actual = true;
		boolean expected = MPasswordUtility.isCorrectPassword(input);
		Assert.assertEquals(actual, expected); 
	}
	@DataProvider(name = "splCharcDataProvider")
	public static Object[][]splCharcDataProvider(){
		return new Object[][] {{"Archu19!"},{"Archu19@"},{"Archu19$"},{"Archu19%"},{"Archu19#"}};	
	}
	@ Test(dataProvider = "splCharcDataProvider")
	public static void splCharc(String data) {
		boolean actual = true;
		boolean expected = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected);
	}
	@DataProvider(name = "SplCharcNegativeDataProvider")
	public static Object[][]splCharcDataNegativeProvider1(){
		return new Object[][] {{"Archu@19"},{"@@#@#@"},{"Archu19@$"},{"Archu19&"} };	
	}
	@Test(dataProvider = "SplCharcNegativeDataProvider")
	public static void splCharcNeg(String data) {
		boolean actual = false;
		boolean expected = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected); 
	}

	@DataProvider(name = "aplhaNumDataProvider")
	public static Object[][]aplhaNumDataProvider(){
		return new Object[][] {{"archu19@"},{"ArChu19@"},{"Archanaa@"},{"12345678@"}};	
	}
	@ Test(dataProvider = "aplhaNumDataProvider")
	public static void pwContainsAlphaNum(String data) {
		boolean actual = false;
		boolean expected = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected); 
	}

	@DataProvider(name = "lengthDataProvider")
	public static Object[][]lengthDataProvider1(){
		return new Object[][] {{"Ar19@"},{"Arc19@"},{"Archu819@"},{"Arch19@"}};	
	}
	@ Test(dataProvider = "lengthDataProvider")
	public static void pwContainsLength(String data) {
		boolean actual = false;
		boolean expected = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected); 
	}

	@DataProvider(name = "SpaceDataProvider")
	public static Object[][]spaceDataProvider1(){
		return new Object[][] {{"Arch 19@"},{" rchu19#"},{"Arch19#"} };	
	}
	@Test(dataProvider = "SpaceDataProvider")
	public static void space(String data) {
		boolean actual = false;
		boolean expected = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected); */
	

