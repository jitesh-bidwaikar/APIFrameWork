package org.testing.ResponseValidation;

import org.testing.utilities.JsonParsing;

import io.restassured.response.Response;

public class ResponseValidation 
{
	public static void statusCodeValidation(int expectedResponseCode, Response res) 
	{
		if (res.statusCode()==expectedResponseCode) 
		{
			System.out.println("Status code is correct "+ res.statusCode());
		}
		else 
		{
			System.out.println("Status code does not macth "+res.statusCode());
		}
	}
	public static void dataValidatoin(String expectedData, Response res, String jsonPath ) 
	{
		String actualdata=JsonParsing.JsonParsingUsingJsonPath(res, jsonPath);
		if (actualdata.equals(expectedData)) 
		{
			System.out.println("Data is matching");
		}
		else 
		{
			System.out.println("Data does not match");
		}
	}
}
