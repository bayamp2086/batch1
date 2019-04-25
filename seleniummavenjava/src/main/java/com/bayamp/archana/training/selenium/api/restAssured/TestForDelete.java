package com.bayamp.archana.training.selenium.api.restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Headers;

public class TestForDelete {
	@Test
	public void checkResponseBody() {
		String expectedResponse = "Successfully Deleted undefined details";
		String responseBody = RestAssuredDeleteApi.delete().asString();
		System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains(expectedResponse), true);
	}
	@Test
	public void checkStautusLine() {
		String statusLine= RestAssuredDeleteApi.StautusLine();
		System.out.println("StatusLine is =>  " + statusLine);
		String expectedHttpStatusLine = "HTTP/1.1 200 OK";
		Assert.assertEquals(statusLine, expectedHttpStatusLine);
	}
	@Test
	public void checkStautusCode() {
		int statusCode = RestAssuredDeleteApi.StautusCode();
		int expectedStatusCode = 200;
		System.out.println("StatusCode is =>  " + statusCode);
		Assert.assertEquals(statusCode, expectedStatusCode);
	}
	@Test
	public void checkHeader() {
		Headers header = RestAssuredDeleteApi.Header();
		System.out.println("Header is =>  " + header);
		Assert.assertEquals(header.toString().contains("utf-8"), true);
	}
	@Test
	public void negDelete() {
		String expectedResponse = "Application Error";
		int expectedStatusCode = 503;	
		String responseBody = RestAssuredDeleteApi.negDelete().asString();
		System.out.println(responseBody);
		int statusCode = RestAssuredDeleteApi.negDeleteStatusCode();
		Assert.assertEquals(responseBody.contains(expectedResponse), true);
		Assert.assertEquals(statusCode, expectedStatusCode);
		
	}
	
}
