package com.bayamp.archana.training.selenium.api;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetApiTestByPassingUrlinConfig extends BaseTest{
	String defautUrl;
	String apiUrl;
	String Url;
	RestClient restclient;
	String bayampUrl = "https://bayamprestapp.herokuapp.com/bayamp/";
	String bayampEngIdUrl = "https://bayamprestapp.herokuapp.com/bayamp/engineers/id";
	@BeforeMethod
	public void setup(){
		BaseTest base = new BaseTest();
		defautUrl = prop.getProperty("URL") ;
		apiUrl = prop.getProperty("serviceURL");
		Url = defautUrl+apiUrl;
	}
	@Test
	public void getTestforDefaultUrl() throws ClientProtocolException, IOException {
		RestClient restclient = new RestClient();
		restclient.generalGet(defautUrl);
	}
}
