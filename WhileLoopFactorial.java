package com.ex;
public class WhileLoopFactorial {
	public static void main(String args[])
	{
		int i=1,n=5,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
			System.out.println(i);
		}
		System.out.println("fact:" +fact);
		
	}

}
