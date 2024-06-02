package com.nwrc.HelperTest;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nwrc.fileaccess.Helper;

public class HelperTests {

	int num;
	@BeforeTest
	
	public void setupPositiveTest() {

		
		String directory = "C:\\Users\\Dell\\Desktop\\";
		String filename = "customerFile.csv";
		String fileComplete = directory + filename;
		List<String> allMyRecords = Helper.readFileIntoList(fileComplete);
		num = allMyRecords.size();
		
	}
	
	
	@Test

	// 17.1
	// Positive test
	// Method to test for the correct number of records

	public void getCustomerType1p1() {

		// Actual Expected
		Assert.assertEquals(num, 10);

	}
	
	
	
	
}
