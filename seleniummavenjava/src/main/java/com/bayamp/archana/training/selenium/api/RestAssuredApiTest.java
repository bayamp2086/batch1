package com.bayamp.archana.training.selenium.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredApiTest {
	int expectedStatusCode = 200;
	int expectedStatusCodeforCreate = 201;
	String baseURl = "https://bayamprestapp.herokuapp.com/";
	String getEndPoint = "/bayamp/engineers";
	String postEndPoint = "/bayamp/create";
	String putEndPoint = "/bayamp/update/NyKdsv6il";
	String deleteEndPoint = "/bayamp/delete/NyXCkNDYI";
	String expectedHttpStatusLine = "HTTP/1.1 200 OK";
	//String expectedHeaders ="{Server=Cowboy, Etag=W/"8eb-oCtR3G3H/sFxm3/uvNp9bQ", Connection=keep-alive, Content-Length=2283, Date=Wed, 10 Apr 2019 20:09:26 GMT, X-Powered-By=Express, Content-Type=application/json; charset=utf-8, Via=1.1 vegur}"
	
	@Test
	public void TestForApi() throws ClientProtocolException, IOException {
		RestAssuredApiTest restassured = new RestAssuredApiTest();
		//restassured.Get();
		//restassured.Post();
		restassured.Delete();
		//restassured.Put();
	}

	public void Get() {
		String Url = baseURl+ getEndPoint;

		//RestAssured.baseURI= "https://bayamprestapp.herokuapp.com/";

		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, Url);

		int statusCode = response.getStatusCode();
		String responseBody = response.getBody().asString();
		String statusLine = response.getStatusLine();
		Headers headersArray =  response.getHeaders();

		System.out.println("StatusCode is =>  " + statusCode);
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("StatusLine is =>  " + statusLine);
		//System.out.println("Header is =>  " + headersArray);

		Assert.assertEquals(statusCode, expectedStatusCode);
		Assert.assertEquals(statusLine, expectedHttpStatusLine );
		Assert.assertEquals(headersArray.toString().contains("utf-8"), true);
		Assert.assertEquals(responseBody.contains("John5"), true);
		
				HashMap<String, String> allHeaders = new HashMap<String, String>();	
		for(io.restassured.http.Header header : headersArray){
			allHeaders.put(header.getName(), header.getValue());
		}	
		System.out.println("Headers Array=>"+allHeaders);
		
	}


	public void Post() throws UnsupportedEncodingException {
		String Url = baseURl+ postEndPoint;

		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject json = new JSONObject();
		json.put("name", "Arya");
		String bodyForRequest = json.toString();
		httpRequest.header("content-type",  "application/json");
		httpRequest.body(bodyForRequest);
		Response response = httpRequest.request(Method.POST, Url);
		

		int statusCode = response.getStatusCode();
		String responseBody = response.getBody().asString();
		String statusLine = response.getStatusLine();

		System.out.println("StatusCode is =>  " + statusCode);
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("StatusLine is =>  " + statusLine);

		Assert.assertEquals(statusCode, expectedStatusCodeforCreate);
		Assert.assertEquals(responseBody.contains("Successfully Created,Your Unique ID"), true);
	}

	public void Put() throws UnsupportedEncodingException {
		String Url = baseURl+ putEndPoint;

		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject json = new JSONObject();
		json.put("name", "Arya");
		String bodyForRequest = json.toString();
		httpRequest.header("content-type",  "application/json");
		httpRequest.body(bodyForRequest);
		Response response = httpRequest.request(Method.PUT, Url);

		int statusCode = response.getStatusCode();
		String responseBody = response.getBody().asString();
		String statusLine = response.getStatusLine();

		System.out.println("StatusCode is =>  " + statusCode);
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("StatusLine is =>  " + statusLine);

		Assert.assertEquals(statusCode, expectedStatusCode);
		Assert.assertEquals(responseBody.contains("Successfully Updated"), true);
	}
	
	public void Delete() throws UnsupportedEncodingException {
		String Url = baseURl+ deleteEndPoint;

		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.DELETE, Url);

		int statusCode = response.getStatusCode();
		String responseBody = response.getBody().asString();
		String statusLine = response.getStatusLine();

		System.out.println("StatusCode is =>  " + statusCode);
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("StatusLine is =>  " + statusLine);

		Assert.assertEquals(statusCode, expectedStatusCode);
		Assert.assertEquals(responseBody.contains("Successfully Deleted undefined details"), true);
	}
}
