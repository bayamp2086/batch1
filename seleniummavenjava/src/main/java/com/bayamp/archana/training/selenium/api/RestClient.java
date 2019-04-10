package com.bayamp.archana.training.selenium.api;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;

public class RestClient {
	int expectedStatusCode = 200;
	String Url = "https://bayamprestapp.herokuapp.com/bayamp/engineers";
	JSONObject responseJson;

	//Get Method 
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
	
	
}	
	
	/*@Test
	public void get() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(EngUrl);

		CloseableHttpResponse closableHttpresponse =  httpClient.execute(httpGet);
		//a status code 
		int statusCode = closableHttpresponse.getStatusLine().getStatusCode();
		System.out.println("The statusCode ---->" +statusCode);
		Assert.assertEquals(statusCode, expectedStatusCode);

		//b. json String
		String responseString = EntityUtils.toString(closableHttpresponse.getEntity());
		responseJson = new JSONObject(responseString.substring(1));
		System.out.println("The response in Json ---->"+responseString);

		//single value assertion
		//String NameValue = TestUtil.getValueByJPath(responseJson, "/name");
		String NameValue = responseJson.getString("name");
		System.out.println(NameValue);
		Assert.assertEquals(NameValue, "Mahesh");

		responseJson.keySet().forEach(keyStr ->
		{
			Object keyvalue = responseJson.get(keyStr);
			System.out.println("key: "+ keyStr + " value: " + keyvalue);

			//for nested objects iteration if required
			if (keyvalue instanceof JSONObject)
			    printJsonObject((JSONObject)keyvalue);
		});
		
		JSONArray allkeys = responseJson.names();
		System.out.println(allkeys.length());
		for (int i = 0; i < allkeys.length(); ++i) {
			String key = allkeys.getString (i); // Here's your key
			String value = responseJson.getString (key); // Here's your value
			System.out.println("key: "+ key + " value: " + value);
		}
		
		JSONObject ob = new JSONObject(responseString.toCharArray()); 
		JSONArray arr = ob.toJSONArray(ob.names());
		
//		JSONObject Object = responseString.getJSONObject("songs");
//		JSONArray songsArray = songsObject.toJSONArray(songsObject.names());

for(int i=0; i<arr.length(); i++){   
arr.getJSONObject(i);  
  System.out.println(arr.getJSONObject(i));  
}
		
	}

	//@Test
	public void getTest() throws ClientProtocolException, IOException {
		RestClient restclient = new RestClient();
		//restclient.getTest(EngUrl);
	}
	
	//@Test
	public void printJsonObject(JSONObject responseJson) {
		responseJson.keySet().forEach(keyStr ->
		{
			Object keyvalue = responseJson.get(keyStr);
			System.out.println("key: "+ keyStr + " value: " + keyvalue);

			//for nested objects iteration if required
			//if (keyvalue instanceof JSONObject)
			//    printJsonObject((JSONObject)keyvalue);
		});
	}*/

