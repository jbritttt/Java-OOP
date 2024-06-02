package com.nwrc.GeneralTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nwrc.customers.General;

public class GeneralTests {
	
	
	

	
	General objPositive;
	General objNegative;

	@BeforeTest

	public void setupPositiveTest() {

		objPositive = new General('G', "10 bank street", "07779699509", 'S', 4.0, 4.0, "John Doe");

		// custObj1.setCustomerType('G');

	}

	@BeforeTest
	
public void setupNegativeTest() {
		
		objNegative = new General(' ', "", "", ' ', 0.0, 0.0, " ");
		
		
		
		
	}



//********************************************************************************************************************




	@Test

	// 1.1
	// Positive test
	// Method to test customer type

	public void getCustomerType1p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getCustomerType(), 'G');

	}

	
	
	@Test

	// 1.2
	// Negative test
	// Method to test customer type

	public void getCustomerType1p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getCustomerType(), ' ');

	}

	
	
	@Test

	// 2.1
	// Positive test
	// Method to test customer address

	public void getCustomerAddress2p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getCustomerAddress(), "10 bank street");

	}
	
	
	
	@Test

	// 2.2
	// Negative test
	// Method to test customer address

	public void getCustomerAddress2p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getCustomerAddress(), "");

	}
	
	
	@Test

	// 3.1
	// Positive test
	// Method to test customer telephone no

	public void getCustomerTelNo3p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getCustomerTelNo(), "07779699509");

	}
	
	
	
	@Test

	// 3.2
	// Negative test
	// Method to test customer telephone no

	public void getCustomerTelNo3p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getCustomerTelNo(), "");

	}
	
	
	
	@Test

	// 4.1
	// Positive test
	// Method to test customer room shape

	public void getRoomShape4p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getRoomShape(), 'S');

	}
	
	
	
	@Test

	// 4.2
	// Negative test
	// Method to test customer room shape

	public void getRoomShape4p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getRoomShape(), ' ');

	}
	
	
	

	@Test

	// 5.1
	// Positive test
	// Method to test customer height

	public void getHeight5p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getHeight(), 4.0);

	}
	
	
	
	@Test

	// 5.2
	// Negative test
	// Method to test customer height

	public void getHeight5p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getHeight(), 0.0);

	}
	
	
	
	@Test

	// 6.1
	// Positive test
	// Method to test customer width

	public void getWidth6p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getWidth(), 4.0);

	}
	
	
	
	@Test

	// 6.2
	// Negative test
	// Method to test customer width

	public void getWidth6p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getWidth(), 0.0);

	}
	
	
	
	@Test

	// 7.1
	// Positive test
	// Method to test customer name

	public void getCustomerName7p1() {

		// Actual Expected
		Assert.assertEquals(objPositive.getCustomerName(), "John Doe");

	}
	
	
	
	@Test

	// 7.2
	// Negative test
	// Method to test customer name

	public void getCustomerName7p2() {

		// Actual Expected
		Assert.assertNotEquals(objNegative.getCustomerName(), " ");

	}
	
	
}

	
	



