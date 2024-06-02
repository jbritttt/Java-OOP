package com.nwrc.customers;

import com.nwrc.dataaccess.Constants;
import com.nwrc.shapes.Circle;
import com.nwrc.shapes.Rectangle;
import com.nwrc.shapes.Square;

public class General extends Customer{

	// Class Variable - Keep the variable as private as it shouldn't be able to be changed from outside of this class
	private String customerName;

	// Constructor - Assume the general customers don't know the surface area so need room shape, height, and width
	public General(char customerType, String customerAddress, String customerTelNo, char roomShape, double height, double width, String customerName) 
	{
		
		super(customerType, customerAddress, customerTelNo, roomShape, height, width);
		
		// Set the customerName attribute to the provided customerName parameter
		this.customerName = customerName;
	}
	

	public General(char customerType, char roomShape, double height, double width) 
	{
		super(customerType, roomShape, height, width);
		
		
	} 


	// Getter & Setter
	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}


	
	@Override
	public double getCoverage() { // Get coverage method depends on the room shape
		
		// Instantiation for each Room shape Class to get perimeter calculations
		Circle circleObj = new Circle(getWidth());
		Square squareObj = new Square(getWidth());
		Rectangle rectangleObj = new Rectangle(getWidth(),getWidth());
		
		double coverage = 0.0;
		
		
		if(super.getRoomShape()=='C')
			coverage = (circleObj.getPerimeter()* getHeight() - Constants.DOORSIZE - Constants.WINDOWSIZE)/ Constants.COVERAGE * Constants.GALLONS;
		
		else if(super.getRoomShape()=='S')
			coverage = (squareObj.getPerimeter()*getHeight() - Constants.DOORSIZE - Constants.WINDOWSIZE)/ Constants.COVERAGE * Constants.GALLONS;
		
		else if(super.getRoomShape()=='R')
			coverage = (rectangleObj.getPerimeter()*getHeight() - Constants.DOORSIZE - Constants.WINDOWSIZE)/ Constants.COVERAGE * Constants.GALLONS;
		
		
		return coverage; // Return the calculated coverage for each room shape
	}
	

	@Override
	public String toString() // The result format to be presented
	{
		return "[General Output]" + "\n"
				+ "Customer Type: " + getCustomerType() + "\n"
				+ "Customer Name: " + getCustomerName() + "\n"
				+ "Address: " + getCustomerAddress() + "\n"
				+ "TelNo: " + getCustomerTelNo() + "\n"
				+ "Room Shape: " + getRoomShape() + "\n"
				+ "Height: " + getHeight() + "\n"
				+ "Width: " + getWidth() + "\n" 
				+ "Paint Required Litres: " + getCoverage()+ "\n" ;
	}
	
}