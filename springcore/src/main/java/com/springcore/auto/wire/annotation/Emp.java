package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	// below variable name (address) & bean name(of dependent class) i.e. address should be same.
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}
	//Default constructor
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
