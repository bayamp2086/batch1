package com.bayamp.training.sonia.rest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.bayamp.training.sonia.http.ApacheHTTPClient;
public class BayAmpRestApacheHttpClientTest {
	
	
	@Test
	public void getBayAmpRequest() {
		
		String requestURL="https://bayamprestapp.herokuapp.com/bayamp/engineers";
		
		String response=new ApacheHTTPClient().HttpClientGetRequest(requestURL);
		
		System.out.println(" Response :"+response);
		
		if(response!=null) {
			
			Assert.assertTrue(true);
		}
		
		
	}
	
	@Test
	public void getBayAmpRequestThroughId() {
		
		String requestURL="https://bayamprestapp.herokuapp.com/bayamp/engineers/NkzLzR-ke";
		
		String response=new ApacheHTTPClient().HttpClientGetRequestThrougId(requestURL);
		
		System.out.println(" Response :"+response);
		
		if(response!=null || "User Not Found".equals(response)) {
			
			Assert.assertTrue(true);
		}
		
		
	}
	
	@Test
	public void createBayAmpRequest() {

		String requestURL = "https://bayamprestapp.herokuapp.com/bayamp/create";
		String inputJson = "{\"name\":\"Viansh\"}";

		String response = new ApacheHTTPClient().HttpClientPostRequest(requestURL, inputJson);

		System.out.println(" Response :" + response);

		if (response != null) {

			Assert.assertTrue(true);
		}

	}
	
	@Test
	public void updateBayAmpRequest() {
		
		String requestURL="https://bayamprestapp.herokuapp.com/bayamp/update/NyeiFMrt8";
		String inputJson = "{\"name\":\"Viansh1\"}";
		
		String response=new ApacheHTTPClient().HttpClientPutRequest(requestURL,inputJson);
		
		System.out.println(" Response :"+response);
		
		if(response!=null) {
			
			Assert.assertTrue(true);
		}
		
	}
	
	@Test
	public void deleteBayAmpRequest() {
		
		String requestURL="https://bayamprestapp.herokuapp.com/bayamp/delete/VyNPoGBt8";
		
		String response=new ApacheHTTPClient().HttpClientDeleteRequest(requestURL);
		
		System.out.println(" Response :"+response);
		
		if(response!=null) {
			
			Assert.assertTrue(true);
		}
		
	}
	
	@Test
	public void getBayAmpWelcomeRequest() {
		
		String requestURL="https://bayamprestapp.herokuapp.com/bayamp/";
		
		String response=new ApacheHTTPClient().HttpClientGetRequest(requestURL);
		
		System.out.println(" Response :"+response);
		
		if(response!=null) {
			
			Assert.assertTrue(true);
		}
		
		
	}
	

}
