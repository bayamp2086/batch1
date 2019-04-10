package com.bayamp.chaya.training.web.testng.tests;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HttpClientRequestTest {
	@Test
	public void getResponseByID() throws ClientProtocolException, IOException {
		String id = "NyeiFMrt8";
		HttpGet getRequest = new HttpGet("http://bayamprestapp.herokuapp.com/bayamp/engineers/" + id);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(getRequest);
		System.out.println(httpResponse);
		if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
			Assert.assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());
		else {
			System.out.println("No Content");
			Assert.assertEquals(HttpStatus.SC_NO_CONTENT, httpResponse.getStatusLine().getStatusCode());
		}
	}

	@Test(priority = 1)
	public void getResponseByCreate_postResponse() throws ClientProtocolException, IOException {
		HttpPost postrequest = new HttpPost("http://bayamprestapp.herokuapp.com/bayamp/create/");
		StringEntity params = new StringEntity("{\"name\":\"April\"} ");
		postrequest.addHeader("content-type", "application/json");
		postrequest.setEntity(params);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(postrequest);
		Assert.assertEquals(HttpStatus.SC_CREATED, httpResponse.getStatusLine().getStatusCode());
	}

	@Test
	public void getResponseByUpdate_putResponse() throws ClientProtocolException, IOException {
		String id = "E1xjtEvKL";
		HttpPut getRequest = new HttpPut("http://bayamprestapp.herokuapp.com/bayamp/update/" + id);
		StringEntity params = new StringEntity("{\"name\":\"chaya1212\"} ");
		getRequest.addHeader("content-type", "application/json");
		getRequest.setEntity(params);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(getRequest);
		System.out.println("putresponse " + httpResponse);
		Assert.assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());
	}

	@Test
	public void getResponseByDelete_deleteResponse() throws ClientProtocolException, IOException {
		String id = "E1xjtEvKL";
		HttpDelete getRequest = new HttpDelete("http://bayamprestapp.herokuapp.com/bayamp/delete/" + id);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(getRequest);
		System.out.println("putresponse " + httpResponse);
		Assert.assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());

	}

}
