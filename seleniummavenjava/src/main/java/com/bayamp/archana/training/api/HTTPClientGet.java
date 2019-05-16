package com.bayamp.archana.training.api;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HTTPClientGet {
	int expectedStatusCode = 200;
	String Url = "https://bayamprestapp.herokuapp.com/bayamp/engineers";
	JSONObject responseJson;

	/*//Get Method 
	public void generalGet(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(Url);

		CloseableHttpResponse closableHttpresponse =  httpClient.execute(httpGet);
		//a status code 
		int statusCode = closableHttpresponse.getStatusLine().getStatusCode();
		System.out.println("The statusCode ---->" +statusCode);
		Assert.assertEquals(statusCode, expectedStatusCode);

		//b. json String
		String responseString = EntityUtils.toString(closableHttpresponse.getEntity());		
		JSONObject responseJson = new JSONObject(responseString.substring(1));
		System.out.println("The response in Json ---->"+responseString);

		//headers
		Header[] headersArray =  closableHttpresponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();	
		for(Header header : headersArray){
			allHeaders.put(header.getName(), header.getValue());
		}	
		System.out.println("Headers Array-->"+allHeaders);
	}
	
	
}	*/
	
	@Test
	public void get() throws ClientProtocolException, IOException {
		
		//create a client
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(Url);

		//executing the request
		CloseableHttpResponse closableHttpresponse =  httpClient.execute(httpGet);
		//a status code 
		//getting the respose status code
		int statusCode = closableHttpresponse.getStatusLine().getStatusCode();
		System.out.println("The statusCode ---->" +statusCode);
		Assert.assertEquals(statusCode, expectedStatusCode);

		
		// EntityUtils is class with a static method to string which takes parameter of type HttpEntity.
		// httpEntity type is returned by  closableHttpresponse.getEntity()
		// this Entity Utils .to string returnd a response json String.
		
		//Entity reponseEntity = closableHttpresponse.getEntity();
		String responseString = EntityUtils.toString(closableHttpresponse.getEntity());
		System.out.println("Response String from Entity Utils:" + responseString);
		//converting json string to json array 
		JSONArray jsonArray = new JSONArray(responseString); 
		
		//iterating the JSON Arrya and coverting each Json array values to JSON Object and printing the name.
		for(int jsonIndex =0; jsonIndex < jsonArray.length() ; jsonIndex++ ) {
			JSONObject Jsonobj = jsonArray.getJSONObject(jsonIndex);;
			System.out.println("id: "+Jsonobj.getString("id"));
			try {
				System.out.println("name : "+Jsonobj.getString("name"));
			}
			catch (Exception e){
				System.out.println("Ignoring the Parameter");
			}
			
		}
		
		
		//converting json string to json object directly without changing to json array  
		//JSONObject engineerJSONRes = new JSONObject(responseString.substring(1));
//		responseJson = new JSONObject(responseString.substring(1));
		

		//single value assertion
		//String NameValue = TestUtil.getValueByJPath(responseJson, "/name");
//		String NameValue = engineerJSONRes.getString("name");
//		System.out.println(NameValue);
//		Assert.assertEquals(NameValue, "Mahesh");
//
//		responseJson.keySet().forEach(keyStr ->
//		{
//			Object keyvalue = responseJson.get(keyStr);
//			System.out.println("key: "+ keyStr + " value: " + keyvalue);
//
//			//for nested objects iteration if required
//			if (keyvalue instanceof JSONObject)
//			    printJsonObject((JSONObject)keyvalue);
//		});
//		
//		JSONArray allkeys = responseJson.names();
//		System.out.println(allkeys.length());
//		for (int i = 0; i < allkeys.length(); ++i) {
//			String key = allkeys.getString (i); // Here's your key
//			String value = responseJson.getString (key); // Here's your value
//			System.out.println("key: "+ key + " value: " + value);
//		}
//		
//		JSONObject ob = new JSONObject(responseString.toCharArray()); 
//		JSONArray arr = ob.toJSONArray(ob.names());
//		
////		JSONObject Object = responseString.getJSONObject("songs");
////		JSONArray songsArray = songsObject.toJSONArray(songsObject.names());
//
//for(int i=0; i<arr.length(); i++){   
//arr.getJSONObject(i);  
//  System.out.println(arr.getJSONObject(i));  
//}
//		
	}

	//@Test
	public void getTest() throws ClientProtocolException, IOException {
		HTTPClientGet restclient = new HTTPClientGet();
		//restclient.getTest(EngUrl);
	}
	
	@Test
	public void printJsonObject(JSONObject responseJson) {
		responseJson.keySet().forEach(keyStr ->
		{
			Object keyvalue = responseJson.get(keyStr);
			System.out.println("key: "+ keyStr + " value: " + keyvalue);

			//for nested objects iteration if required
			//if (keyvalue instanceof JSONObject)
			//    printJsonObject((JSONObject)keyvalue);
		});
	}
}

