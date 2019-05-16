
package com.bayamp.archana.training.api;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiHTTPClientTest {
	int expectedStatusCode = 200;
	int expectedStatusCodeforCreate = 201;
	String baseURl = "https://bayamprestapp.herokuapp.com/";
	String getEndPoint = "/bayamp/engineers";
	String postEndPoint = "/bayamp/create";
	String putEndPoint = "/bayamp/update/NJLiaEIK8";
	String deleteEndPoint = "/bayamp/delete/Vy0SiNLt8";



	@Test
	public void TestForApi() throws ClientProtocolException, IOException {
		ApiHTTPClientTest restclient = new ApiHTTPClientTest();
		restclient.generalGet();
		//restclient.generalPost();
		//restclient.generalDelete();
		//restclient.generalPut();
	}

	public void generalGet() throws ClientProtocolException, IOException {
		String getUrl = baseURl+ getEndPoint;

		//Creating Client, creating url object and executing
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(getUrl);
		CloseableHttpResponse closableHttpresponse =  httpClient.execute(httpGet);


		// Trigger the request;
		int statusCode = closableHttpresponse.getStatusLine().getStatusCode();
		String responseString = EntityUtils.toString(closableHttpresponse.getEntity());	
		Header[] headersArray =  closableHttpresponse.getAllHeaders();

		// Assert the results for Status code
		Assert.assertEquals(statusCode, expectedStatusCode );
		System.out.println("The statusCode ---->" +statusCode);
		System.out.println("The response in Json ---->"+responseString);

		HashMap<String, String> allHeaders = new HashMap<String, String>();	
		for(Header header : headersArray){
			allHeaders.put(header.getName(), header.getValue());
		}	
		System.out.println("Headers Array-->"+allHeaders);
	}


	public void generalPost() throws ClientProtocolException, IOException {
		String url = baseURl+ postEndPoint;

		//Creating Client, creating url object and executing
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPostRequest = new HttpPost(url);

		JSONObject json = new JSONObject();

		/*json.append("name", "abc1");

		StringEntity params = new StringEntity("{\n" + 
				" \"name\" :\"John3\"\n" + 
				"}\n" + 
				"");
		String json = "{\n" + 
				" \"name\" :\"John3\"\n" + 
				"}";*/

		json.put("name", "play");
		StringEntity params = new StringEntity(json.toString());
		httpPostRequest.addHeader("content-type", "application/json");
		httpPostRequest.setEntity(params);
		CloseableHttpResponse closableHttpresponse =  httpClient.execute(httpPostRequest);
		
		// Trigger the request;
		int statusCode = closableHttpresponse.getStatusLine().getStatusCode();
		String responseString = EntityUtils.toString(closableHttpresponse.getEntity());	
		Header[] headersArray =  closableHttpresponse.getAllHeaders();

		// Assert the results for Status code
		Assert.assertEquals(statusCode, expectedStatusCodeforCreate );
		System.out.println("The statusCode ---->" +statusCode);

		System.out.println("The response in Json ---->"+responseString);

		HashMap<String, String> allHeaders = new HashMap<String, String>();	
		for(Header header : headersArray){
			allHeaders.put(header.getName(), header.getValue());
		}	
		System.out.println("Headers Array-->"+allHeaders);
	}
	
	public void generalDelete() throws ClientProtocolException, IOException {
		
		String url = baseURl+ deleteEndPoint;

		//Creating Client, creating url object and executing
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpDelete httpDeleteRequest = new HttpDelete(url);

		CloseableHttpResponse closableHttpresponse =  httpClient.execute(httpDeleteRequest);
		
		// Trigger the request;
		int statusCode = closableHttpresponse.getStatusLine().getStatusCode();
		String responseString = EntityUtils.toString(closableHttpresponse.getEntity());	
		Header[] headersArray =  closableHttpresponse.getAllHeaders();

		// Assert the results for Status code
		Assert.assertEquals(statusCode, expectedStatusCode );
		System.out.println("The statusCode ---->" +statusCode);
		System.out.println("The response in Json ---->"+responseString);
		HashMap<String, String> allHeaders = new HashMap<String, String>();	
		for(Header header : headersArray){
			allHeaders.put(header.getName(), header.getValue());
		}	
		System.out.println("Headers Array-->"+allHeaders);
		}


	
public void generalPut() throws ClientProtocolException, IOException {
		
	String url = baseURl+ putEndPoint;

	//Creating Client, creating url object and executing
	CloseableHttpClient httpClient = HttpClients.createDefault();
	HttpPut httpPutRequest = new HttpPut(url);

	JSONObject json = new JSONObject();
	json.put("name", "play3");
	StringEntity params = new StringEntity(json.toString());
	httpPutRequest.addHeader("content-type", "application/json");
	httpPutRequest.setEntity(params);
	CloseableHttpResponse closableHttpresponse =  httpClient.execute(httpPutRequest);
	
	// Trigger the request;
	int statusCode = closableHttpresponse.getStatusLine().getStatusCode();
	String responseString = EntityUtils.toString(closableHttpresponse.getEntity());	
	Header[] headersArray =  closableHttpresponse.getAllHeaders();

	// Assert the results for Status code
	Assert.assertEquals(statusCode, expectedStatusCode );
	System.out.println("The statusCode ---->" +statusCode);
	System.out.println("The response in Json ---->"+responseString);

	HashMap<String, String> allHeaders = new HashMap<String, String>();	
	for(Header header : headersArray){
		allHeaders.put(header.getName(), header.getValue());
	}	
	System.out.println("Headers Array-->"+allHeaders);
	}


}
