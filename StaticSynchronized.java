package com.ex;
class Mobile{
	public  static synchronized void message(String companyName) {
		for(int i=0;i<10;i++) {
			System.out.print("Welcome to the mobile company:");
			try {
				Thread.sleep(1000);
				System.out.println(companyName);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
	class MyThread2 extends Thread{
		String companyName;
		MyThread2(String companyName){
			this.companyName=companyName;
			
		}
		public void run() {
			Mobile.message(companyName);
		}
	}

  class StaticSynchronized {
	public static void main(String args[]) {
		MyThread2 x=new MyThread2("Samsung");
		MyThread2 y=new MyThread2("Vivo");
		x.start();
		y.start();
	}
		
}



