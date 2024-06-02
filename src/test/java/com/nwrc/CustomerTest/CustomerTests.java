package com.nwrc.CustomerTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.nwrc.customers.General;
import com.nwrc.customers.Trade;

public class CustomerTests {
	
	General generalObj1;
	General generalObj2;
	General generalObj3;
	General generalObj4;
	General generalObj5;
	General generalObj6;
	
	Trade tradeObj1;
	Trade tradeObj2;
	Trade tradeObj3;
	Trade tradeObj4;
	
	
	
	
	@BeforeTest

	public void setupGeneralTests() {

		generalObj1 = new General('G', 'R', 13, 10);
		generalObj2 = new General('G', 'S', 11, 9);
		generalObj3 = new General('G', 'C', 11, 6);
		generalObj4 = new General('G', 'R', 17, 8);
		generalObj5 = new General('G', 'C', 16, 4);
		generalObj6 = new General('G', 'S', 7, 14);
	
	}
	
	
	
	@BeforeTest

	public void setupTradeTests() {

		tradeObj1 = new Trade('T', 350);
		tradeObj2 = new Trade('T', 360);
		tradeObj3 = new Trade('T', 355);
		tradeObj4 = new Trade('T', 340);
	
	}
	
	
	
	

	@Test

	// 18.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage18p1() {

		// Actual Expected
		Assert.assertEquals(generalObj1.getCoverage(), 4.476128571428572);

	}

	
	@Test

	// 19.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage19p1() {

		// Actual Expected
		Assert.assertEquals(generalObj2.getCoverage(), 4.553974285714286);

	}

	
	
	@Test

	// 20.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage20p1() {

		// Actual Expected
		Assert.assertEquals(generalObj3.getCoverage(), 4.796466673353044);

	}
	
	
	
	@Test

	// 21.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage21p1() {

		// Actual Expected
		Assert.assertEquals(generalObj4.getCoverage(), 4.709665714285714);

	}
	
	
	
	@Test

	// 22.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage22p1() {

		// Actual Expected
		Assert.assertEquals(generalObj5.getCoverage(), 4.633426990610743);

	}
	
	
	
	@Test

	// 23.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage23p1() {

		// Actual Expected
		Assert.assertEquals(generalObj6.getCoverage(), 4.502077142857143);

	}
	
	
	@Test

	// 24.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage24p1() {

		// Actual Expected
		Assert.assertEquals(tradeObj1.getCoverage(), 4.541);

	}
	
	
	
	@Test

	// 25.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage25p1() {

		// Actual Expected
		Assert.assertEquals(tradeObj2.getCoverage(), 4.670742857142857);

	}
	
	
	
	@Test

	// 26.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage26p1() {

		// Actual Expected
		Assert.assertEquals(tradeObj3.getCoverage(), 4.605871428571429);

	}
	
	
	
	@Test

	// 27.1
	// Positive test
	// Method to test customer coverage calculation

	public void getCoverage27p1() {

		// Actual Expected
		Assert.assertEquals(tradeObj4.getCoverage(), 4.411257142857143);

	}
	
	
	
	
	
	@AfterTest 
	public void disposeObject() {
		
		
		
		
	}
	
	
}




