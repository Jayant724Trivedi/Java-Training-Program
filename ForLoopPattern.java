package com.ex;
public class ForLoopPattern {
	public static void main(String args[])
	{
		int i,j,k=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++)
			{
				if(k%2==1)
				System.out.println("1");
				else
				System.out.println("0");
				k++;
			}
			System.out.println();
		}
	}
}
