package com.bayamp.archana.training.selenium.api.restAssured;

import org.json.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPutApi {
	public static String baseURl = "https://bayamprestapp.herokuapp.com/";
	public static String putEndPoint = "/bayamp/update/NkW4oW6lZ";

	public static Response put() {
		String Url = baseURl+ putEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject json = new JSONObject();
		json.put("name", "xxx");
		String bodyForRequestInString = json.toString();
		httpRequest.header("content-type",  "application/json");
		httpRequest.body(bodyForRequestInString);
		Response response =httpRequest.request(Method.PUT, Url);
		return response;
		}
	
	public static String StautusLine() {
		String statusLine = RestAssuredPutApi.put().getStatusLine();
		return statusLine;
	}
	public static int StautusCode() {
		int statusCode = RestAssuredPutApi.put().getStatusCode();
		return statusCode;
	}
	
	public static String ResponseBody() {
		String responseBody = RestAssuredPutApi.put().getBody().asString();   
		//System.out.println(responseBody);
	    return responseBody;
	}
	public static Headers Header() {
		Headers headers = RestAssuredPutApi.put().getHeaders();   
		//System.out.println(headers);
	    return headers;
	}
}