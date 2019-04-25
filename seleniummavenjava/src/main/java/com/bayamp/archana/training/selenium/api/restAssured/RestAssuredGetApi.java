package com.bayamp.archana.training.selenium.api.restAssured;

import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGetApi {
	public static String baseURl = "https://bayamprestapp.herokuapp.com/";
	public static String getEndPoint = "/bayamp/engineers";

	public static Response get() {
		String Url = baseURl+ getEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		Response response =httpRequest.request(Method.GET, Url);
		return response;
	}

	public static String StautusLine() {
		String statusLine = RestAssuredGetApi.get().getStatusLine();
		return statusLine;
	}
	public static int StautusCode() {
		int statusCode = RestAssuredGetApi.get().getStatusCode();
		return statusCode;
	}

	public static String ResponseBody() {
		String responseBody = RestAssuredGetApi.get().getBody().asString();   
		//System.out.println(responseBody);
		return responseBody;
	}
	
	public static Headers Header() {
		Headers headers = RestAssuredGetApi.get().getHeaders();   
		//System.out.println(headers);
		return headers;
	}
	//@Test
	public static void fullResponsecontent() {
		String Url = baseURl+ getEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		Response response =httpRequest.request(Method.GET, Url);
		System.out.println("Response String ===>" + response.asString());
		//converting json string to json array 
		JSONArray jsonArray = new JSONArray(response.asString()); 

		//iterating the JSON Arrya and coverting each Json array values to JSON Object and printing the name.
		for(int jsonIndex =0; jsonIndex < jsonArray.length() ; jsonIndex++ ) {
			JSONObject Jsonobj = jsonArray.getJSONObject(jsonIndex);
			System.out.println("id: "+Jsonobj.getString("id"));
			try {
				System.out.println("name : "+Jsonobj.getString("name"));
			}
			catch (Exception e){
				System.out.println("Ignoring the Parameter");
			}

		}
	}
	//@Test
	public static void keyAndValue() {
		String Url = baseURl+ getEndPoint;
		RequestSpecification httpRequest = RestAssured.given();
		Response response =httpRequest.request(Method.GET, Url);

		JSONArray jsonArray = new JSONArray(response.asString()); 

		//iterating the JSON Arrya and coverting each Json array values to JSON Object and printing the name.
		for(int jsonIndex =0; jsonIndex < jsonArray.length() ; jsonIndex++ ) {
			JSONObject Jsonobj = jsonArray.getJSONObject(jsonIndex);
			
			if (Jsonobj.getString("id") == "VJWSFpVt82" && Jsonobj.getString("name") == "Abc") {
				System.out.println("The id and name is present");
			}
		}
	}
}