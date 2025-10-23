//program to demonstrate accessing classes and methods of different packages
package com.tnsif.day4.firstPackage;

public class Executer {

	public static void main(String[] args) {
		// Accessing different packages class
		base b1 = new base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		b1.methodPrivate();

	}

}
