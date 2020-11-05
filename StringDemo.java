package com.ex;
public class StringDemo {
	public static void main(String[] args) {
		String name="Jayant";
		System.out.println(name.charAt(1));
		System.out.println(name.concat("Trivedi"));
		System.out.println(name.equalsIgnoreCase("jayant"));
		System.out.println(name.indexOf('t'));
		name=name.concat(" trivedi");
		System.out.println(name.substring(2));
		String[] s1=name.split(" ");
		System.out.println(s1[0]);
		char[] s=name.toCharArray();
		System.out.println(s[0]+" "+s[10]);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.endsWith("di"));
		System.out.println(name.isEmpty());
		System.out.println(name.isBlank());
		System.out.println(name.lastIndexOf('i'));
		name="Jayant Trivedi ";
		System.out.println(name.trim());
	}

}
