package org.testing.testScripts;

import java.io.IOException;

import org.testing.utilities.XMLDataRead;

public class TCxmlRead 
{
	public static void main(String[] args) throws IOException 
	{
		XMLDataRead.xmlReadData("../APIFRMWRK/src/test/java/org/testing/payloads/xmldata.xml");
	}

}
