package com.nwrc.customers;

import com.nwrc.dataaccess.Constants;

public class Trade extends Customer {

	// Class Variables
	private String tradeName;

	// Constructors
	public Trade(char customerType, String customerAddress, String customerTelNo, double surfaceArea, String tradeName) 
	{
		super(customerType, customerAddress, customerTelNo, surfaceArea);
		this.tradeName = tradeName;
	}

	
	


	public Trade(char customerType, double surfaceArea ) {
		super(customerType, surfaceArea);
	}





	// Getters & Setters
	public String getTradeName() 
	{
		return tradeName;
	}

	public void setTradeName(String tradeName) 
	{
		this.tradeName = tradeName;
	}
	
	@Override
	public double getCoverage() {
		return (super.getSurfaceArea() / Constants.COVERAGE) * Constants.GALLONS;
	}


	@Override
	public String toString() {
		return "[Trade Output]" + "\n"
		+ "Customer Type: " + getCustomerType() + "\n"
		+ "Trade Name: " + getTradeName() + "\n"
		+ "Address: " + getCustomerAddress() + "\n"
		+ "TelNo: " + getCustomerTelNo() + "\n"
		+ "Surface Area: " + getSurfaceArea() + "\n"
		+ "Paint Required Litres: " + getCoverage()+ "\n" ;
	
	}


	
}