package com.bayamp.training.sonia.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.bayamp.web.selenium.common.BaseTest;

public class ApacheHTTPClient {

	public String HttpClientHttpURLConnectionGetRequest(String url, String Method) {

		StringBuffer buff = new StringBuffer();
		String response;
		try {
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
			httpConnection.setRequestMethod(Method);
			httpConnection.setRequestProperty("Accept", "application/json");

			int responseCode = httpConnection.getResponseCode();
			int repsonseCode_prop = Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"));

			if (responseCode != repsonseCode_prop) {
				throw new RuntimeException("Request is Failed" + responseCode);
			}

			InputStream inputStream = httpConnection.getInputStream();
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			BufferedReader bufferReader = new BufferedReader(inputReader);

			while ((response = bufferReader.readLine()) != null) {

				buff.append(response);
			}

			httpConnection.disconnect();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return buff.toString();
	}

	public String HttpClientGetRequest(String url) {

		StringBuffer buff = new StringBuffer();
		String response;
		try {

			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet httpGet = new HttpGet(url);
			httpGet.addHeader("accept", "application/json");

			HttpResponse httpResponse = httpClient.execute(httpGet);

			int responseCode = httpResponse.getStatusLine().getStatusCode();
			int repsonseCode_prop = Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"));

			if (responseCode != repsonseCode_prop) {
				throw new RuntimeException("Request is Failed" + responseCode);
			}

			InputStream inputStream = httpResponse.getEntity().getContent();
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			BufferedReader bufferReader = new BufferedReader(inputReader);

			while ((response = bufferReader.readLine()) != null) {

				buff.append(response);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return buff.toString();
	}

	public String HttpClientGetRequestThrougId(String url) {

		StringBuffer buff = new StringBuffer();
		String response;
		try {

			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet httpGet = new HttpGet(url);
			httpGet.addHeader("accept", "application/json");

			HttpResponse httpResponse = httpClient.execute(httpGet);

			int responseCode = httpResponse.getStatusLine().getStatusCode();
			int repsonseCode_prop = Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"));
			int repsonseCode_prop1 = Integer.parseInt(new BaseTest().getProperty().getProperty("http.user.not.found"));

			System.out.println("responseCode :" + responseCode);

			if (responseCode == repsonseCode_prop1) {
				return "User Not Found";
			} else if (responseCode != repsonseCode_prop) {
				throw new RuntimeException("Request is Failed" + responseCode);
			}
			InputStream inputStream = httpResponse.getEntity().getContent();
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			BufferedReader bufferReader = new BufferedReader(inputReader);

			while ((response = bufferReader.readLine()) != null) {

				buff.append(response);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return buff.toString();
	}

	public String HttpClientPostRequest(String url, String content) {

		StringBuffer buff = new StringBuffer();
		String response;
		try {

			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost httpPost = new HttpPost(url);
			StringEntity input = new StringEntity(content);
			input.setContentType("application/json");
			httpPost.setEntity(input);

			HttpResponse httpResponse = httpClient.execute(httpPost);

			int responseCode = httpResponse.getStatusLine().getStatusCode();
			int repsonseCode_prop = Integer.parseInt(new BaseTest().getProperty().getProperty("http.created"));

			if (responseCode != repsonseCode_prop) {
				throw new RuntimeException("Request is Failed" + responseCode);
			}

			InputStream inputStream = httpResponse.getEntity().getContent();
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			BufferedReader bufferReader = new BufferedReader(inputReader);

			while ((response = bufferReader.readLine()) != null) {

				buff.append(response);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return buff.toString();
	}

	public String HttpClientPutRequest(String url, String content) {

		StringBuffer buff = new StringBuffer();
		String response;
		try {

			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPut httpPut = new HttpPut(url);
			httpPut.addHeader("accept", "application/json");
			StringEntity input = new StringEntity(content);
			input.setContentType("application/json");
			httpPut.setEntity(input);

			HttpResponse httpResponse = httpClient.execute(httpPut);

			int responseCode = httpResponse.getStatusLine().getStatusCode();
			int repsonseCode_prop = Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"));

			if (responseCode != repsonseCode_prop) {
				throw new RuntimeException("Request is Failed" + responseCode);
			}

			InputStream inputStream = httpResponse.getEntity().getContent();
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			BufferedReader bufferReader = new BufferedReader(inputReader);

			while ((response = bufferReader.readLine()) != null) {

				buff.append(response);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return buff.toString();
	}

	public String HttpClientDeleteRequest(String url) {

		StringBuffer buff = new StringBuffer();
		String response;
		try {

			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpDelete httpDelete = new HttpDelete(url);
			httpDelete.addHeader("accept", "application/json");

			HttpResponse httpResponse = httpClient.execute(httpDelete);

			int responseCode = httpResponse.getStatusLine().getStatusCode();
			int repsonseCode_prop = Integer.parseInt(new BaseTest().getProperty().getProperty("http.success.code"));

			if (responseCode != repsonseCode_prop) {
				throw new RuntimeException("Request is Failed" + responseCode);
			}

			InputStream inputStream = httpResponse.getEntity().getContent();
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			BufferedReader bufferReader = new BufferedReader(inputReader);

			while ((response = bufferReader.readLine()) != null) {

				buff.append(response);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return buff.toString();
	}

}
