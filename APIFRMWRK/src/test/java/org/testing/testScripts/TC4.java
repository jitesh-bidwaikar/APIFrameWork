package org.testing.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileReader;
import org.testing.utilities.JsonVariable;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4 
{
	@Test
	public void testCase4() throws IOException 
	{
		String bodydata= JsonFileReader.ReadJsonFile("../APIFRMWRK/src/test/java/org/testing/payloads/UpdateFile.json");
		bodydata= JsonVariable.JsonVariableReplacement(bodydata, "id", TC1.idvalue);
		Properties pr=LoadPropertiesFile.ReadProperiesFile("../APIFRMWRK/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.UpdateRecords(bodydata, "QA_Env_EmployeeNames_URI", TC1.idvalue);
		System.out.println("****************TC4************");
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Resposne is "+res.asString());
		ResponseValidation.statusCodeValidation(200, res);
		ResponseValidation.dataValidatoin("bidwaikar", res, "Lastname");
	}
}
