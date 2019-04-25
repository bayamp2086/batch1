package com.bayamp.archana.training.selenium.api.restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Headers;

public class TestForPost {
	@Test
	public void checkResponseBody() {
		String responseBody = RestAssuredPostApi.post().asString();
		System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains("Successfully Created,Your Unique ID is"), true);
	}
	
	@Test
	public void checkStautusLine() {
		String statusLine= RestAssuredPostApi.StautusLine();
		System.out.println("StatusLine is =>  " + statusLine);
		String expectedHttpStatusLine = "HTTP/1.1 201 OK";
		Assert.assertEquals(statusLine, expectedHttpStatusLine);
	}
	@Test
	public void checkStautusCode() {
		int statusCode = RestAssuredPostApi.StautusCode();
		int expectedStatusCode = 201;
		System.out.println("StatusCode is =>  " + statusCode);
		Assert.assertEquals(statusCode, expectedStatusCode);
	}
	@Test				
	public void checkHeader() {
		Headers header = RestAssuredPostApi.Header();
		System.out.println("Header is =>  " + header);
		Assert.assertEquals(header.toString().contains("utf-8"), true);
	}
	@Test
	public void checkResponseBodyScenarios() {
		String responseBody = RestAssuredPostApi.postScenario1().asString();
		System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains("Successfully Created,Your Unique ID is"), true);
	}

}
