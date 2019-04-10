package com.bayamp.chaya.training.web.testng.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HttpClientRequestTest {
	@Test
	public void getStatusCodeCheck_with200_Response() throws ClientProtocolException, IOException {
		String id = "NyeiFMrt8";
		String request = "http://bayamprestapp.herokuapp.com/bayamp/engineers/";

		ApacheHttpClient response=new ApacheHttpClient().HttpClientGetRequest(request);


		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
		System.out.println(httpResponse);
		Assert.assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());
	}

	@Test(priority = 1)
	public void postStatusCode() throws ClientProtocolException, IOException {
		HttpPost postrequest = new HttpPost("http://bayamprestapp.herokuapp.com/bayamp/create/");
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("chayab", ""));
		postrequest.setEntity(new UrlEncodedFormEntity(urlParameters));
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(postrequest);
		Assert.assertEquals(HttpStatus.SC_CREATED, httpResponse.getStatusLine().getStatusCode());

	}
}
