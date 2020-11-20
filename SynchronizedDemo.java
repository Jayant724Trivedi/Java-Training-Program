package com.ex;
class Trainees{
	public  synchronized void message(String companyName) {
		for(int i=0;i<10;i++) {
			System.out.print("Welcome to the company:");
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
class MyThread1 extends Thread{
	Trainees t;
	String companyName;
	MyThread1(Trainees t,String companyName){
		this.t=t;
		this.companyName=companyName;
	}
	public void run() {
		t.message(companyName);
	}
}

public class SynchronizedDemo {
	public static void main(String args[]) {
		Trainees batch10=new Trainees();
		MyThread1 x=new MyThread1(batch10,"Motivity");
		MyThread1 y=new MyThread1(batch10,"JNIT");
		x.start();
		y.start();
	}

}
