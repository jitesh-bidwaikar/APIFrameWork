package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileReader 
{
	public static String ReadJsonFile(String path) throws FileNotFoundException 
	{
		File f= new File(path);
		FileInputStream fi= new FileInputStream(f);
		JSONTokener js=new JSONTokener(fi);
		JSONObject obj=new JSONObject(js);
		return obj.toString();
	}
	

	}
