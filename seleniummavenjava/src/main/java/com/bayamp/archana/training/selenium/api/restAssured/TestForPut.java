package com.bayamp.archana.training.selenium.api.restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Headers;

public class TestForPut {
	@Test
	public void checkResponseBody() {
		String name1 = "Successfully Updated";
		String responseBody = RestAssuredPutApi.put().asString();
		System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains(name1), true);
	}
	@Test
	public void checkStautusLine() {
		String statusLine= RestAssuredPutApi.StautusLine();
		System.out.println("StatusLine is =>  " + statusLine);
		String expectedHttpStatusLine = "HTTP/1.1 200 OK";
		Assert.assertEquals(statusLine, expectedHttpStatusLine);
	}
	@Test
	public void checkStautusCode() {
		int statusCode = RestAssuredPutApi.StautusCode();
		int expectedStatusCode = 200;
		System.out.println("StatusCode is =>  " + statusCode);
		Assert.assertEquals(statusCode, expectedStatusCode);
	}
	@Test
	public void checkHeader() {
		Headers header = RestAssuredPutApi.Header();
		System.out.println("Header is =>  " + header);
		Assert.assertEquals(header.toString().contains("utf-8"), true);
	}
	
}
