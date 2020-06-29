package com.pavan.comp;

public class Test {
	private int a,b;
	
	static{
		System.out.println("Test static method()");
	}

	public Test() {
		System.out.println("0-param constructor");
	}

	public Test(int a, int b) {
		System.out.println("2-param constructor");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

	
	}
	

