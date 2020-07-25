package com.mycompany.app;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{
	public static void main(String args[])
	{
		final Logger LOGGER=LogManager.getLogger(App.class);
		LOGGER.info("Enter a string:");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		string=string.toUpperCase();
		
		boolean check=true;
		for(int l=0;l<string.length();l++)
		{
		    char character=string.charAt(l);
		    if(!(character>='A' && character<='Z'))
		    {
                	check=false;
		        break;
		    }
		}
		if(check==true)
		{
		  	if(string.length()>=2)
		  	{
		    		String string1=""; //string1 is a substring of string that contains first two characters of string
		    		for(int i=0;i<=1;i++)
		    		{
		        		string1=string1+string.charAt(i);
		    		}
		    		String string2=""; //string2 is the other substring of string that contains remaining characters of string
		    		for(int i=2;i<string.length();i++)
		    		{
		        		string2=string2+string.charAt(i);
		    		}
				if(string1.contains("A"))
					string1=string1.replace("A","");
				LOGGER.info("\""+(string1+string2)+"\"");
		  	}
		  	else if(string.length()<=1)
		  	{
				if(string.charAt(0)=='A')
				{	
					String string_single_char=""; //string_single_char is the substring of string when string has only one character
					string_single_char=string_single_char.replace("A","");
					LOGGER.info("\""+string_single_char+"\"");
				}
				else
					LOGGER.info(string);
			}
		}
		else
			LOGGER.info("Enter a valid string");
	}
}