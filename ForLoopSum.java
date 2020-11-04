package com.ex;
public class ForLoopSum {
	public static void main(String args[])
	{
		int sum=0,rem;
		for(int n=124;n>0;n=n/10)
		{
			rem=n%10;
			sum=sum+rem;
		}
		System.out.println("sum:" +sum);
	}

}
