package com.ex;
public class DoWhileFactorial {
	public static void main(String args[])
	{
		int n=5,fact=1,i=1;
		do
		{
			fact=fact*i;
			i++;
		} while(i<=n);
		System.out.println("Fact:" +fact);
	}
}
