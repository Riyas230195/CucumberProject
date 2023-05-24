package org.apibaseclass;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ApiBaseClass {
	//to use this in multiple methods we are declaring instance variable with return "RequestSpecification"
	public static RequestSpecification requestSpecification;
	
	//1. To create the request object
	
	public static void requestObject(String uri) {
		RestAssured.baseURI = uri;
		 requestSpecification = RestAssured.given();

	}
	
	//2. To add the headers
	
	public static void addHeaders(String headerName , String headerValue) {
		requestSpecification = requestSpecification.header( headerName , headerValue);
           	
	}
	
	//3. To add the query parameter
	
	public static void addQueryParam(String queryParamName, String queryParamValue) {
		requestSpecification = requestSpecification.queryParam(queryParamName, queryParamValue);
		
	}
	
	//4. To add the path paramter
	
	public static void addPathParam(String pathParamName,String pathParamValue) {
		requestSpecification = requestSpecification.pathParam(pathParamName, pathParamValue);
	}
	
	//5. To get the response object
	
	public static Response responseObject(String requestType, String resource) {

		switch (requestType) {
		case "GET":{return requestSpecification.request(Method.GET,resource);}
		case "PUT":{return requestSpecification.request(Method.PUT,resource);}
		case "POST":{return requestSpecification.request(Method.POST,resource);}
			

		default:{return requestSpecification.request(Method.DELETE,resource);}
		}
	}
	
	//6. To get the response body
	
	public static void responseBody(Response response) {
          String asPrettyString = response.getBody().asPrettyString();
		  System.out.println(asPrettyString);
	}
	
	//7. Validation point
	
	public static void assertCheck(Response response, int expected) {
        int statusCode = response.getStatusCode();
        Assert.assertEquals(expected, statusCode);
        System.out.println("Assert check completed:"+"Response Code:"+statusCode);
	}
    //8. JSON object for Post Request
	
	public static void jsonObject(String string , String string1, String s, String s1) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(s, string);
		jsonObject.put(s1, string1);
		
		requestSpecification.body(jsonObject.toString());
	}
	
	
	
	

}
