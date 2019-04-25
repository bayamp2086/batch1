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

public class RestAssuredPostApi {
	public static String baseURl = "https://bayamprestapp.herokuapp.com/";
	public static String postEndPoint = "/bayamp/create";
	
	public static Response post() {
		String Url = baseURl+ postEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject json = new JSONObject();
		json.put("name", "arr");
		String bodyForRequestInString = json.toString();
		httpRequest.header("content-type",  "application/json");
		httpRequest.body(bodyForRequestInString);
		Response response =httpRequest.request(Method.POST, Url);
		return response;
		}
	
	public static String StautusLine() {
		String statusLine = RestAssuredPostApi.post().getStatusLine();
		return statusLine;
	}
	public static int StautusCode() {
		int statusCode = RestAssuredPostApi.post().getStatusCode();
		return statusCode;
	}
	
	public static String ResponseBody() {
		String responseBody = RestAssuredPostApi.post().getBody().asString();   
		//System.out.println(responseBody);
	    return responseBody;
	}
	public static Headers Header() {
		Headers headers = RestAssuredPostApi.post().getHeaders();   
		//System.out.println(headers);
	    return headers;
	}
	public static Response postScenario1() {
		String Url = baseURl+ postEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject json = new JSONObject();
		json.put("name", "5655");
		String bodyForRequestInString = json.toString();
		httpRequest.header("content-type",  "application/json");
		httpRequest.body(bodyForRequestInString);
		Response response =httpRequest.request(Method.POST, Url);
		return response;
		}
	public static Response postScenario2() {
		String Url = baseURl+ postEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject json = new JSONObject();
		json.put("name", "5655dsd");
		String bodyForRequestInString = json.toString();
		httpRequest.header("content-type",  "application/json");
		httpRequest.body(bodyForRequestInString);
		Response response =httpRequest.request(Method.POST, Url);
		return response;
		}
	public static Response postScenario3() {
		String Url = baseURl+ postEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject json = new JSONObject();
		json.put("name", "5655,dsd");
		String bodyForRequestInString = json.toString();
		httpRequest.header("content-type",  "application/json");
		httpRequest.body(bodyForRequestInString);
		Response response =httpRequest.request(Method.POST, Url);
		return response;
		}
	public static Response postScenario4() {
		String Url = baseURl+ postEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject json = new JSONObject();
		json.put("name", "sarc,dsd");
		String bodyForRequestInString = json.toString();
		httpRequest.header("content-type",  "application/json");
		httpRequest.body(bodyForRequestInString);
		Response response =httpRequest.request(Method.POST, Url);
		return response;
		}
}