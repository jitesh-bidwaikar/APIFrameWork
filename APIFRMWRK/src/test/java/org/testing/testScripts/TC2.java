package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2 
{
	@Test
	public void TestCase2() throws IOException 
	{
		Properties pr= LoadPropertiesFile.ReadProperiesFile("../APIFRMWRK/URI.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response res=http.GetMethod("QA_Env_EmployeeNames_URI", TC1.idvalue);
		System.out.println("*****************TC2***************");
		System.out.println("Status code is : ");
		System.out.println(res.statusCode());
		System.out.println("Response is : ");
		System.out.println(res.asString());
		ResponseValidation.statusCodeValidation(200, res);
		ResponseValidation.dataValidatoin("Jitesh", res, "Firstname");
	}
}
