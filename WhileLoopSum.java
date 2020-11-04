package com.ex;
public class WhileLoopSum {
	public static void main(String args[]) {
		int i=0,n=4,sum=0;
		while(i<=n)
		{
			System.out.println(i);
			i++;
			sum=sum+i;
		}
		System.out.println("sum:" +sum);
		
}
}
