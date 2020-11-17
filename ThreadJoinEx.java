package com.ex;
	import java.util.Scanner;

	class AliveEx extends Thread
	{
		int x,y;
		public void run()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter x,y values");
			x=sc.nextInt();
		    y=sc.nextInt();
		}
	}
	public class ThreadJoinEx {

		public static void main(String[] args) throws java.lang.InterruptedException {
			AliveEx a=new AliveEx();
			a.start();
			a.join();
			System.out.println("Sum ="+(a.x+a.y));
			
		}


}
