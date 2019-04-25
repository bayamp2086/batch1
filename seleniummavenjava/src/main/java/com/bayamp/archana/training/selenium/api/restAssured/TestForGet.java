package com.bayamp.archana.training.selenium.api.restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Headers;

public class TestForGet {
	@Test
	public void checkResponseBody() {
		String responseBody = RestAssuredGetApi.get().asString();
		System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains("Arya"), true);
	}
	@Test
	public void checkStautusLine() {
		String statusLine= RestAssuredGetApi.StautusLine();
		System.out.println("StatusLine is =>  " + statusLine);
		String expectedHttpStatusLine = "HTTP/1.1 200 OK";
		Assert.assertEquals(statusLine, expectedHttpStatusLine);
	}
	@Test
	public void checkStautusCode() {
		int statusCode = RestAssuredGetApi.StautusCode();
		int expectedStatusCode = 200;
		System.out.println("StatusCode is =>  " + statusCode);
		Assert.assertEquals(statusCode, expectedStatusCode);
	}
	@Test
	public void checkHeader() {
		Headers header = RestAssuredGetApi.Header();
		System.out.println("Header is =>  " + header);
		Assert.assertEquals(header.toString().contains("utf-8"), true);
	}
	
	@Test
	public void checkResponseKeyAndValue() {
		Headers header = RestAssuredGetApi.Header();
		System.out.println("Header is =>  " + header);
		Assert.assertEquals(header.toString().contains("utf-8"), true);
	}

}
