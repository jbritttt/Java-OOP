package com.nwrc.demos;

import java.util.List;

import com.nwrc.customers.General;
import com.nwrc.customers.Trade;
import com.nwrc.fileaccess.Helper;

public class demo1 {

	public static void main(String[] args) {
		systemDescription();
		getData();

	}

	
	// Step 1
	// Gets the data from CSV file and passes data to displayData() function ********************************************
	
	public static void getData() {
		// File location + file name to read‪
		String directory = "C:\\Users\\Dell\\Desktop\\";
		String filename = "customerFile.csv";
		String fileComplete = directory + filename;

		// Save all the data from the file through Helper Class
		List<String> allMyRecords = Helper.readFileIntoList(fileComplete);

		System.out.println(" Customer details with paint required calculations \n\n" +
		" Total number of customer records = " + allMyRecords.size() + "\n\n");

		for (int index = 0; index < allMyRecords.size(); index++) {
			String customerRecord = allMyRecords.get(index);
			String[] individualFields = customerRecord.split(";");

			displayData(individualFields);
		}

	}

	// step 2
	// Stores data in variables by instantiating the classes and passing in the data. ************************************
	// Displays the data in the console
	
	public static void displayData(String[] individualFields) {

		if (individualFields[0].equals("T") && individualFields.length == 5) {
			Trade tradeObj = new Trade('T', individualFields[2], individualFields[3],
					Double.parseDouble(individualFields[4]), individualFields[1]);
			System.out.println(tradeObj.toString());

		} else if (individualFields[0].equals("G") && individualFields.length == 7) {
			char roomShape = individualFields[4].charAt(0);
			double height = Double.parseDouble(individualFields[5]);
			double width = Double.parseDouble(individualFields[6]);
			General generalObj = new General('G', individualFields[2], individualFields[3], roomShape, height, width,
					individualFields[1]);
			System.out.println(generalObj.toString());

		} else {

			throw new Error(" \n\n Possible problems: \n 1. Customer type fields are invalid. Should contain 'T' or 'G' \n "
							+ "2. Should contain 7 fields for General and 5 fields for trade \n\n ");
		}
	}
	
	
	// Description explaining the system and its purpose ******************************************************************
	public static void systemDescription() {
		
		System.out.println("\n \n System Description ********* \n\n\n The purpose of this system is to calculate the amount of paint needed for a trade customer or a general customer to paint a room by taking \n in user input and making a calculation based on this to work out the amount of paint required. \n\n It takes into account various factors, such as the room's dimensions or the typical size of doors and \n windows which gets deducted from the overall coverage calculation.\n\n\n\n"
				+ " How the program works: ********* \n\n"
				+ " Helper Class: ********* \n"
				+ " Reads and processes customer data from a CSV file and stores it in a list.\n\n\n\n"
				+ " Demo Class: ********* \n"
				+ " Loops through the data from the Helper class and instantiates the trade and general classes passing in the \n relevant data to their class constructors.\n\n\n\n"
				+ " Trade and General class: *********\n"
				+ " Stores the data in the class variables and the parent Customer class where they can be inherited by child classes.\n Then it calls other classes such as Constants, Circle, Square, and Rectangle which perform calculations on this data based on \n the shape of the room and measurements provided. The toString method when invoked from the demo class returns the customer data with \n the coverage amount of paint required to paint a room.\n\n\n\n"
				+ " Customer types: *********\n"
				+ " Trade customers: \n have provide there surface area meaning less calculations are needed to work out coverage amount.\r\n"
				+ " General customers:\n don't know their surface area and only provide the length and height of the room meaning \n more calculations are needed to work out coverage amount.\n\n\n");
	}

	
}
