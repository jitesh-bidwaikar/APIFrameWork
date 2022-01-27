package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr) 
	{
		this.pr=pr;
	}
	public Response PostMethod(String bodydata, String URIKey) 
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(URIKey));
		System.out.println("*******************TC1***********************");
		System.out.println("Satus code is : "+res.statusCode());
		return res;
	}
	public Response GetMethod(String URIKey, String id) 
	{
		String uri= pr.getProperty(URIKey)+"/"+id;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.get(uri);
		return res;		
	}
	public Response GetAllRecords(String UriKey) 
	{
		Response res=
		given ()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(UriKey));
		return res;
	}
	public Response UpdateRecords(String bodydata, String UriKey, String id)
	{
		String uri = pr.getProperty(UriKey)+"/"+id;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.put(uri);
		return res;
	}
	public Response DeleteMethod(String UriKey, String id) 
	{
		String uri=pr.getProperty(UriKey)+"/"+id;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		return res;
	}
}
