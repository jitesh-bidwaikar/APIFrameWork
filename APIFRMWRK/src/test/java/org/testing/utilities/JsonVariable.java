package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariable 
{
	public static String JsonVariableReplacement (String bodydata, String keyname, String keyvalue) 
	{
		bodydata = bodydata.replaceAll(Pattern.quote("{{"+keyname+"}}"),keyvalue);
		return bodydata;
	}
}
