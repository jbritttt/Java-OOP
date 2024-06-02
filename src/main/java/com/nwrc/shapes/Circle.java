package com.nwrc.shapes;

public class Circle implements Shape 
{
	// Class Variables
	private double radius;

	// Constructors
	public Circle(double radius) 
	{
		this.radius = radius;
	}

	// Getters & Setters
	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	@Override
	public double getPerimeter() 
	{
		return Math.PI * getRadius() * 2;
	}

	@Override
	public String toString() {
		return "Circle  [radius=" + radius + ", getRadius()=" + getRadius() + ", getPerimeter()=" + getPerimeter() + "]";
	}


	
	

	
	
	
	
}