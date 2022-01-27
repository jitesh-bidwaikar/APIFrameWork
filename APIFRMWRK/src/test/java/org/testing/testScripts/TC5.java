package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5 
{
	@Test
	public void TestCase5() throws IOException 
	{
		Properties pr= LoadPropertiesFile.ReadProperiesFile("../APIFRMWRK/URI.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res=http.DeleteMethod("QA_Env_EmployeeNames_URI", TC1.idvalue);
		System.out.println("*****************TC5***************");
		System.out.println("Status code is : ");
		System.out.println(res.statusCode());
		System.out.println("Response is : ");
		System.out.println(res.asString());
	}
}
