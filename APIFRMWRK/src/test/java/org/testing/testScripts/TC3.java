package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3 
{
	@Test
	public void TestCase3() throws IOException 
	{
		Properties pr= LoadPropertiesFile.ReadProperiesFile("../APIFRMWRK/URI.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res=http.GetAllRecords("QA_Env_EmployeeNames_URI");
		System.out.println("*********************TC3*****************");
		System.out.println("Status code is "+ res.statusCode());
		JsonParsing.JsonparseAllkeys(res.asString(),"id");
	}
}
