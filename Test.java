package com.ex;
class MySql{
	static {
		System.out.println("My Sql Static Block:");
	}
	public MySql(){
	System.out.println("MySql Constructor");
	}
}
class Oracle{
	static {
		System.out.println("Oracle static block");
	}
	public Oracle(){
		System.out.println("Oracle Constructor");
	}
}
public class Test {
	public static void main(String args[]) throws Exception {
		System.out.println("Static Method");
		Class C=Class.forName("com.ex.Oracle");
		System.out.println(C.getName());
		System.out.println(C.newInstance());
		Class C1=Class.forName("com.ex.MySql");
		System.out.println(C1.getName());
		System.out.println(C1.newInstance());
		
	}

}
