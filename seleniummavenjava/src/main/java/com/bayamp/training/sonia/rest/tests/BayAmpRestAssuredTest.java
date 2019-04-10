package com.bayamp.training.sonia.rest.tests;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.bayamp.web.selenium.common.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BayAmpRestAssuredTest {

	@Test
	public void getBayAmpRequest() {

		String ROOT_URI = "https://bayamprestapp.herokuapp.com/bayamp/engineers";

		Response response = get(ROOT_URI);
		int responseCode = response.getStatusCode();
		System.out.println("Response Code" + responseCode);
		if (responseCode == Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"))) {

			String responseString = response.getBody().asString();
			System.out.println("Response of Get " + responseString);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void getBayAmpRequestbyId() {

		String ROOT_URI = "https://bayamprestapp.herokuapp.com/bayamp/engineers/NkzLzR-ke1";

		Response response = get(ROOT_URI);
		int responseCode = response.getStatusCode();
		System.out.println("Response Code :" + responseCode);
		if (responseCode == Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"))
				||
		responseCode == Integer.parseInt(new BaseTest().getProperty().getProperty("http.user.not.found"))) {

			String responseString = response.getBody().asString();
			System.out.println("Response of Get :" + responseString);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
	
	@Test
	public void createBayampRequest() {
		
		RestAssured.baseURI = "https://bayamprestapp.herokuapp.com/bayamp/create";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        
        String inputJson = "{\"name\":\"Shivansh\"}";
        httpRequest.body(inputJson);
        Response response = httpRequest.post();
        int responseCode = response.getStatusCode();
		System.out.println("Response Code :" + responseCode);
		if (responseCode == Integer.parseInt(new BaseTest().getProperty().getProperty("http.created"))) {

			String responseString = response.getBody().asString();
			System.out.println("Response of Post :" + responseString);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void updateBayAmpRequest() {
		
		RestAssured.baseURI="https://bayamprestapp.herokuapp.com/bayamp/update/VJ9cG_UFI";
		RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        
        String inputJson = "{\"name\":\"Shivansh\"}";
        httpRequest.body(inputJson);
        Response response = httpRequest.put();
        int responseCode = response.getStatusCode();
		System.out.println("Response Code :" + responseCode);
		if (responseCode == Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"))) {

			String responseString = response.getBody().asString();
			System.out.println("Response of Put :" + responseString);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
	}
	
	@Test
	public void deleteBayAmpRequest() {
		
		RestAssured.baseURI="https://bayamprestapp.herokuapp.com/bayamp/delete/N1-u4dUFU";
		RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        String inputJson = "{\"name\":\"Shivansh\"}";
        httpRequest.body(inputJson);
        Response response = httpRequest.delete();
        int responseCode = response.getStatusCode();
		System.out.println("Response Code :" + responseCode);
		if (responseCode == Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"))) {

			String responseString = response.getBody().asString();
			System.out.println("Response of Delete :" + responseString);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
	}
	
	@Test
	public void getBayAmpWelcomeRequest() {

		String ROOT_URI = "https://bayamprestapp.herokuapp.com/bayamp/";

		Response response = get(ROOT_URI);
		int responseCode = response.getStatusCode();
		System.out.println("Response Code" + responseCode);
		if (responseCode == Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"))) {

			String responseString = response.getBody().asString();
			System.out.println("Response of Get " + responseString);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
