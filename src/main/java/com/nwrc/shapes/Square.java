package com.nwrc.shapes;

public class Square implements Shape 
{
	private double length;


	public Square(double length) 
	{
		this.length = length;
	}


	public double getLength() 
	{
		return length;
	}

	public void setLength(double length) 
	{
		this.length = length;
	}

	@Override
	public double getPerimeter() 
	{
		return 4 * getLength();
	}
	
	
	
}
