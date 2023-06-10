package com.springcore.lifecycle;

public class Pizza {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	
	public void start() {
		System.out.println("Inside init method");
	}
	
	public void end() {
		System.out.println("Inside destroy method");
	}
}
