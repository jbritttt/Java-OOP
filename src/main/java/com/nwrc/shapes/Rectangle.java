package com.nwrc.shapes;

public class Rectangle extends Square 
{
	private double width;
//                      width          width/2
	public Rectangle(double length, double width) 
	{
		super(length);
		this.width = width;
		
	}

	public double getWidth() 
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		return 2 * ((super.getLength())/2 + getWidth());
	}
	
	
	
	
}
