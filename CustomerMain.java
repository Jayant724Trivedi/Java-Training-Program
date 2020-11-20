package com.ex;
class Customer{
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to with draw.....");
		if(this.amount<amount) {
			System.out.println("Less balance go and deposit");
		try {
			wait();
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("withdraw completed");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("deposit done");
		notify();
	}
}
public class CustomerMain {
		public static void main(String args[]) {
			Customer rahul=new Customer();
			new Thread() {
				public void run() {
					rahul.withdraw(15000);
				}
			}.start();
			new Thread() {
				public void run() {
					rahul.deposit(20000);
				}
			}.start();
		}
}
