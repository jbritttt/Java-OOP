package com.nwrc.testdataaccess;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nwrc.dataaccess.Constants;

public class ConstantsTest {

	
	// 13.1
	@Test
	public void testCoverage13p1() {
		
		Assert.assertEquals(Constants.COVERAGE, 350);
	}
	 
	
	
	// 14.1
	@Test
	public void testWindowSize14p1() {
		
		Assert.assertEquals(Constants.WINDOWSIZE, 24);
	}
	
	
	
	// 15.1
	@Test
	public void testDoorSize15p1() {
		
		Assert.assertEquals(Constants.DOORSIZE, 21);
	}
	
	
	// 16.1
	@Test
	public void testGallons16p1() {
		
		Assert.assertEquals(Constants.GALLONS, 4.541);
	}
	
	
}
