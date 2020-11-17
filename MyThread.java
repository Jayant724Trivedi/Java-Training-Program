package com.ex;

public class MyThread extends Thread {
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println("i value is="+i);
		}
	}
	public static void main(String args[]) {
		MyThread mt=new MyThread();
		mt.start();
		for(int x=0;x<=20;x++) {
			System.out.println("x value is="+x);
		}
	}
}
