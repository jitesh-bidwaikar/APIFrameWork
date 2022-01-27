package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class XMLDataRead 
{
	public static void xmlReadData(String path) throws IOException 
	{
		File f= new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader b= new BufferedReader(fr);
		String s;
		while ((s=b.readLine())!=null)
				{
					System.out.println(s);
				}
	}
}
