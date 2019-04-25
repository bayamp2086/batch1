package com.bayamp.archana.training.selenium.api.restAssured;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDeleteApi {
	public static String baseURl = "https://bayamprestapp.herokuapp.com/";
	public static String deleteEndPoint = "/bayamp/delete/N12cBtElG";
	public static String negDeleteEndPoint = "/bayamp/delete/4yb3";
	
	public static Response delete() {
		String Url = baseURl+ deleteEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		Response response =httpRequest.request(Method.DELETE, Url);
		return response;
		}
	
	public static String StautusLine() {
		String statusLine = RestAssuredDeleteApi.delete().getStatusLine();
		return statusLine;
	}
	public static int StautusCode() {
		int statusCode = RestAssuredDeleteApi.delete().getStatusCode();
		return statusCode;
	}
	
	public static String ResponseBody() {
		String responseBody = RestAssuredDeleteApi.delete().getBody().asString();   
		//System.out.println(responseBody);
	    return responseBody;
	}
	public static Headers Header() {
		Headers headers = RestAssuredDeleteApi.delete().getHeaders();   
		//System.out.println(headers);
	    return headers;
	}
	public static Response negDelete() {
		String Url = baseURl+ negDeleteEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		Response response =httpRequest.request(Method.DELETE, Url);
		return response;
		}
	public static int negDeleteStatusCode() {
		int negStatusCode = RestAssuredDeleteApi.negDelete().getStatusCode();
		return negStatusCode;
		}
}