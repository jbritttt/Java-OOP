package com.nwrc.fileaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Helper {

	// Class Variables
	private static List<String> listOfRecords;
	
	// 
	public static List<String> readFileIntoList(String fileName)
	{
		try
		{
			listOfRecords = Files.readAllLines(Paths.get(fileName));
		
		}
		
		catch(FileNotFoundException fnfe) 
		{
			System.out.println("File not found");
			System.out.println("Info from Exception object" + fnfe.getMessage());
		}
		
		//Input Output Exception
		catch(IOException ioe) 
		{
			System.out.println("Other file issues - file corrupt or empty");
			System.out.println("Info from Exception object" + ioe.getMessage());
			//	e.printStackTrace();
		}
		
		catch(Exception e) 
		{
			System.out.println("Some other issue with file");
			System.out.println("Info from Exception object" + e.getMessage());
		}
		
		return listOfRecords;
		
	}

}
