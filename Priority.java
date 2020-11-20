package com.ex;

public class Priority extends Thread {
	public void run() {
		System.out.println("Thread name" +Thread.currentThread().getName());
		System.out.println("Thread priority" +Thread.currentThread().getPriority());
	}
	public static void main(String args[]) {
		Priority x=new Priority();
		x.setPriority(Thread.MIN_PRIORITY);
		Priority y=new Priority();
		y.setPriority(Thread.MAX_PRIORITY);
		x.start();
		y.start();
	}

}
