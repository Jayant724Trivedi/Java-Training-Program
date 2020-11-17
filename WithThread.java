package com.ex;

public class WithThread implements Runnable {
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println("i value is="+i);
		}
	}
	public static void main(String args[]) {
		WithThread wt=new WithThread();
		wt.run();
		Thread t=new Thread();
		t.start();
		for(int x=0;x<=20;x++) {
			System.out.println("x value is="+x);
		}
	}
	
	

}
