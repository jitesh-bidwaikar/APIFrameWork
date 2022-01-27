package org.testing.utilities;

import java.util.Random;

public class Randomvalue 
{
	public static String Randomdata() 
	{
		Random r = new Random();
		Integer i=r.nextInt();
		return i.toString();
	}
}
