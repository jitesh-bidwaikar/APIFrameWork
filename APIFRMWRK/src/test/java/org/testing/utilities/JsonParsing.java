package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;

public class JsonParsing 
{
	public static String Jsonparse(String response, String UriKey) 
	{
		JSONObject obj=new JSONObject(response);
		return obj.get(UriKey).toString();
	}
	public static void JsonparseAllkeys(String response, String keyvalue) 
	{
		JSONArray ar= new JSONArray(response);
		int L=ar.length();
		for (int i=0;i<L;i++) 
		{
			JSONObject obj=ar.getJSONObject(i);
			System.out.println(obj.get(keyvalue));
		}
	}
	public static String JsonParsingUsingJsonPath( Response res, String JsonPath ) 
	{
		return res.jsonPath().get(JsonPath);
	}
}
