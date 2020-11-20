package com.ex;
public class SleepDemo extends Thread {
		public void run() {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
				System.out.println(i);
			}
		}
		public static void main(String args[]) {
			SleepDemo x=new SleepDemo();
			SleepDemo y=new SleepDemo();
			x.start();
			y.start();
		}
}
