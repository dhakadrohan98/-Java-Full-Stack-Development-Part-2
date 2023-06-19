package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	// @Value("#{expression}")
	@Value("#{10+22}")
	private int x;
	
	@Value("#{ 11 > 10 ? 6:5}")
	private int y;
	
	//static method through spEL
	@Value("#{ T(java.lang.Math).sqrt(225) }")
	private double z;
	
	//static variable
	@Value("#{ T(java.lang.Math).E }")
	private double pi;
	
	//creating object of String/Any class.
	@Value("#{ new java.lang.String('Rohan Dhakad') }")
	private String name;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + "]";
	}
	
}
