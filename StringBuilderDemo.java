package com.ex;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("jayant");
		StringBuilder s=new StringBuilder("jayant");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		System.out.println(sb.append(" Trivedi"));
		System.out.println(sb.equals(s));
		System.out.println(sb.indexOf("n"));
		System.out.println(sb.substring(2));
		
	}

}
