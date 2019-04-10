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
	@Test(priority=0)
	public void getResponseByID() throws ClientProtocolException, IOException {
		String id = "NyeiFMrt8";
		HttpGet request = new HttpGet("http://bayamprestapp.herokuapp.com/bayamp/engineers/" + id);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
		System.out.println(httpResponse);
		int responseCode = httpResponse.getStatusLine().getStatusCode();
		if (responseCode == 200)
			Assert.assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());
		else {
			System.out.println(responseCode);
			Assert.assertEquals(HttpStatus.SC_NO_CONTENT, httpResponse.getStatusLine().getStatusCode());
		}
	}

	@Test(priority = 1)
	public void postStatusCode() throws ClientProtocolException, IOException {
		HttpPost postrequest = new HttpPost("http://bayamprestapp.herokuapp.com/bayamp/create/");
		StringEntity params = new StringEntity("{\"name\":\"chaya222\"} ");
		postrequest.addHeader("content-type", "application/json");
		postrequest.setEntity(params);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(postrequest);
		Assert.assertEquals(HttpStatus.SC_CREATED, httpResponse.getStatusLine().getStatusCode());

	}

	@Test(priority = 2)
	public void getResponseByUpdate_putResponse() throws ClientProtocolException, IOException {
		HttpPut putRequest = new HttpPut("http://bayamprestapp.herokuapp.com/bayamp/update/416ZqIwFL");
		StringEntity params = new StringEntity("{\"name\":\"chaya221\"} ");
		putRequest.addHeader("content-type", "application/json");
		putRequest.setEntity(params);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(putRequest);
		Assert.assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());

	}

	@Test(priority = 4)
	public void getResponseByDelete_deleteResponse() throws ClientProtocolException, IOException {
		HttpDelete deleteRequest = new HttpDelete("http://bayamprestapp.herokuapp.com/bayamp/delete/NyeiFMrt8");
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(deleteRequest);
		Assert.assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());

	}
}
