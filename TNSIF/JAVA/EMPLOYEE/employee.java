package com.tnsif.daystat;

public class employee {
private String name;
private int id;

static String companyName="DSATM";

public employee(String name, int id) {
	
	this.name = name;
	this.id = id;
}

@Override
public String toString() {
	return "employee [name=" + name + ", id=" + id + ",company ="+ companyName +"]";
}


}
