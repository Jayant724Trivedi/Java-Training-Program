package com.ex;
	class Alive extends Thread
	{
		public void run()
		{
			System.out.println("Running.........."+Thread.currentThread().getName());
		}
	}
	public class ThreadName {

		public static void main(String[] args) {
			System.out.println("Running.........."+Thread.currentThread().getName());
			Alive a1=new Alive();
			Alive a2=new Alive();
			System.out.println(a1.getName());
			System.out.println(a2.getName());
			a1.setName("Jayant");
			a2.setName("Trivedi");
			a1.start();
			a2.start();
			
		}
}
