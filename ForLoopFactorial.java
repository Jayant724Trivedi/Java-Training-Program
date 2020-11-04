package com.ex;
public class ForLoopFactorial {
	public static void main(String args[])
	{
		int i=1,n=7,fact=1;
		for(i=1;i<n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:" +fact);
	}

}
