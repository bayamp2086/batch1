package com.bayamp.chaya.training.web.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredBayampTest {
	@Test
	public void getResponseByID() {
		RestAssured.baseURI = "http://bayamprestapp.herokuapp.com/bayamp/engineers";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/V1XB9VDKU");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	@Test
	public void getResponseByCreate_postResponse() {
		RestAssured.baseURI = "http://bayamprestapp.herokuapp.com/bayamp";
		RequestSpecification request = RestAssured.given();
		/*
		 * request.param("name: ", "Rahul").headers("Accept",
		 * ContentType.JSON.getAcceptHeader()).post("/create").then()
		 * .statusCode(201);
		 */
		/*
		 * JSONObject requestParams = new JSONObject();
		 * requestParams.put("name:","Rahul"); request.headers("Content-Type",
		 * "application/json"); request.body(requestParams.toJSONString());
		 */
		Response response = request.given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"name\": \"Rahul234\"}").when().post(RestAssured.baseURI + "/create");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
	}

	@Test
	public void getResponseByUpdate_putResponse() {
		RestAssured.baseURI = "http://bayamprestapp.herokuapp.com/bayamp";
		RequestSpecification request = RestAssured.given();
		Response response = request.given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\"name\": \"Rahul1\"}").when().put(RestAssured.baseURI + "/update/4yesWdwFU");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);

	}

	@Test
	public void getResponseByDelete_deleteResponse() {
		RestAssured.baseURI = "http://bayamprestapp.herokuapp.com/bayamp";
		RequestSpecification request = RestAssured.given();
		Response response = request.given().delete(RestAssured.baseURI + "/delete/4yesWdwFU");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);

	}
}
