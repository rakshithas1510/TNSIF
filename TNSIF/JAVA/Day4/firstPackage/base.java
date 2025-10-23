//program to demonstrate package and access modifiers
package com.tnsif.day4.firstPackage;

public class base {
//Declare default, public, private and protected
	int varDefault =10;
	public int varPublic=20;
	private int varPrivate = 30;
	protected int varProtected=40;
	
	//Declare methods with default, Public, private and protected
	void methodDefault()
	{
		System.out.println("Default access Base class");
		System.out.println("Default variable: "+varDefault);
	}
	void methodPublic()
	{
		System.out.println("Public access Base class");
		System.out.println("Public variable: "+varPublic);
	}
	void methodPrivate()
	{
		System.out.println("Private access Base class");
		System.out.println("Private variable: "+varPrivate);
	}
	void methodProtected()
	{
		System.out.println("Protected access Base class");
		System.out.println("Protected variable: "+varProtected);
	}
}
