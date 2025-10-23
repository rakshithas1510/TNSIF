package com.tnsif.Day3;

public class Customer {
	private String Name;
	private int  Phone;
	private double Salary;
	private String Address;
	
	
	public Customer(){
		this.Name=Name;
		this.Phone=Phone;
		this.Salary=Salary;
		this.Address=Address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	   @Override
	    public String toString() {
	        return "Customer Details:\n" +
	               "Name: " + Name + "\n" +
	               "Phone: " + Phone + "\n" +
	               "Salary: " + Salary + "\n" +
	               "Address: " + Address;
	    }

}