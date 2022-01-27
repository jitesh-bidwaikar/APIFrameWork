package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class FileConversion 
{
	public String xmltoJson(String XMLdata)
	{
		JSONObject js=XML.toJSONObject(XMLdata);
		return js.toString();
	}
	public String Jsontoxml(String Jsondata)
	{
		JSONObject obj=new JSONObject(Jsondata);
		String xml_data=XML.toString(obj);
		return xml_data;
		
	}
}
