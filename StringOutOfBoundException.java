package com.ex;
public class StringOutOfBoundException {
		public static void main(String[] args) {
			String s="jayant trivedi";
			try
			{
				char ch=s.charAt(25);
				System.out.println(ch);
			}
			catch(StringIndexOutOfBoundsException se)
			{
				System.out.println("enter vallid index number");
			}
		}
}
