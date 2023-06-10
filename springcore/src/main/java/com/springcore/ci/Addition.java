package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a,double b) {
		this.a = (int)this.a;
		this.b = (int)this.b;
		System.out.println("Constructor : double, double");
	}
	
	public Addition(int a,int b) {
		this.a = this.a;
		this.b = this.b;
		System.out.println("Constructor : int, int");
	}
	
	//Below constructor will create ambiguity because it will be called by default through xml file if type is not specified in ciconfig.xml file.
	public Addition(String a,String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String");
	}
	
	public void doSum() {
		int sum = this.a+this.b;
		System.out.println("a: "+this.a);
		System.out.println("b: "+this.b);
		System.out.println(sum);
	}
}
