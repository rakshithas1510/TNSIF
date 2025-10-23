package com.tnsif.abstraction;

abstract class Shape {
	protected float area;
	abstract void calArea();// abstract 
	void show()// concrete method
	{
		System.out.println("Area of the shape is "+ area);
	}

}