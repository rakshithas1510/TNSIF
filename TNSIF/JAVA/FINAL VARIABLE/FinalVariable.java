package com.tnsif.dayfinal;

public class FinalVariable {
final int x=10;
final static int y=11; 
final static int z=20;
void change() {
	x=30;
	y=70;
}
@Override
public String toString() {
	return "FinalVariable [x=" + x + "]";
}
static
{
	x=200;
}
}
