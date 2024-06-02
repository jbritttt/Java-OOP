package com.nwrc.customers;

import com.nwrc.dataaccess.Constants;

public class Customer {

	// Class Variables
	private char customerType;
	private String customerAddress;
	private String customerTelNo;
	private double surfaceArea;
	private char roomShape;
	private double height;
	private double width;
	
	// Constructors
	public Customer(char customerType, String customerAddress, String customerTelNo, char roomShape, double height, double width) 
	{
		this.customerType = customerType;
		this.customerAddress = customerAddress;
		this.customerTelNo = customerTelNo;
		this.roomShape = roomShape;
		this.height = height;
		this.width = width;
	}

	public Customer(char customerType, String customerAddress, String customerTelNo, double surfaceArea) 
	{
		this.customerType = customerType;
		this.customerAddress = customerAddress;
		this.customerTelNo = customerTelNo;
		this.surfaceArea = surfaceArea;
	}

	
	
 
// Constructor to set values for general customers from CustomerTest class.
	public Customer(char customerType, char roomShape, double height, double width) {
		this.customerType = customerType;
		this.roomShape = roomShape;
		this.height = height;
		this.width = width;
	}

	public Customer(char customerType, double surfaceArea) {
		this.customerType = customerType;
		this.surfaceArea = surfaceArea;
		
	}

	// Getters & Setters
	public char getCustomerType() 
	{
		return customerType;
	}

	public void setCustomerType(char customerType) 
	{
		this.customerType = customerType;
	}

	public String getCustomerAddress() 
	{
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) 
	{
		this.customerAddress = customerAddress;
	}

	public String getCustomerTelNo() 
	{
		return customerTelNo;
	}

	public void setCustomerTelNo(String customerTelNo) 
	{
		this.customerTelNo = customerTelNo;
	}

	public double getSurfaceArea() 
	{
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) 
	{
		this.surfaceArea = surfaceArea;
	}

	public char getRoomShape() 
	{
		return roomShape;
	}

	public void setRoomShape(char roomShape) 
	{
		this.roomShape = roomShape;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}

	public double getWidth() 
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	}

	// Get Coverage Method Outline
	public double getCoverage()
	{
		// (super.getSurfaceArea() / Constants.COVERAGE) * Constants.GALLONS
		return (getSurfaceArea()/ Constants.COVERAGE) * Constants.GALLONS; 
	}
	
	@Override
	public String toString() 
	{
		return "Customer Type: " + getCustomerType() + "\n" 
				+ "Customer Address: " + getCustomerAddress() + "\n"
				+ "Customer TelNo: " + getCustomerTelNo() + "\n"
				+ "SurfaceArea: " + getSurfaceArea() + "\n"
				+ "RoomShape: " + getRoomShape() + "\n"
				+ "Height: " + getHeight() + "\n"
				+ "Width: " + getWidth() + "\n" 
				+ "Coverage: " + getCoverage() + "\n" ;
	}
}
