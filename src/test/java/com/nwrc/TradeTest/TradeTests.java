package com.nwrc.TradeTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nwrc.customers.Trade;

public class TradeTests {

	
	Trade objPositive;
	Trade objNegative;

	@BeforeTest

	public void setupPositiveTest() {

		objPositive = new Trade('T', "33 Royal Avenue Derry", "02871954321",360, "Learning Pool" );

		// custObj1.setCustomerType('G');

	}

	
	@BeforeTest
public void setupNegativeTest() {
		
		objNegative = new Trade(' ', "", " ", 0.0, " ");
		
		
		
		
		
	}



//********************************************************************************************************************



	@Test

	// 8.1
	// Positive test
	// Method to test customer type

	public void getCustomerType8p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getCustomerType(), 'T');

	}

	
	
	@Test

	// 8.2
	// Negative test
	// Method to test customer type

	public void getCustomerType8p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getCustomerType(), ' ');

	}

	
	
	@Test

	// 9.1
	// Positive test
	// Method to test customer address

	public void getCustomerAddress9p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getCustomerAddress(), "33 Royal Avenue Derry");

	}
	
	
	
	@Test

	// 9.2
	// Negative test
	// Method to test customer address

	public void getCustomerAddress9p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getCustomerAddress(), "");

	}
	
	
	@Test

	// 10.1
	// Positive test
	// Method to test customer telephone no

	public void getCustomerTelNo10p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getCustomerTelNo(), "02871954321");

	}
	
	
	
	@Test

	// 10.2
	// Negative test
	// Method to test customer telephone no

	public void getCustomerTelNo10p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getCustomerTelNo(), " ");

	}
	
	
	
	@Test

	// 11.1
	// Positive test
	// Method to test customer surface area

	public void getSurfaceArea11p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getSurfaceArea(), 360);

	}
	
	
	
	@Test

	// 11.2
	// Negative test
	// Method to test customer surface area

	public void getSurfaceArea11p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getSurfaceArea(), 0.0);

	}
	
	
	
	@Test

	// 12.1
	// Positive test
	// Method to test customer trade name

	public void getTradeName12p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getTradeName(), "Learning Pool");

	}
	
	
	
	@Test

	// 12.2
	// Negative test
	// Method to test customer trade name

	public void getTradeName12p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getTradeName(), " ");

	}
	
	

	
	
	
	
}
