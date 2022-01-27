package org.testing.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileReader;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonVariable;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.Randomvalue;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1 
{
	static String idvalue;
	@Test
	
	public static void testCase1() throws IOException 
		
	{
		String bodydata= JsonFileReader.ReadJsonFile("../APIFRMWRK/src/test/java/org/testing/payloads/BodyData.json");
		String randomid=Randomvalue.Randomdata();
		bodydata= JsonVariable.JsonVariableReplacement(bodydata, "id", randomid);
		Properties pr=LoadPropertiesFile.ReadProperiesFile("../APIFRMWRK/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.PostMethod(bodydata,"QA_Env_EmployeeNames_URI");
		idvalue=JsonParsing.Jsonparse(res.asString(), "id");
		ResponseValidation.statusCodeValidation(201, res);
	}
}
