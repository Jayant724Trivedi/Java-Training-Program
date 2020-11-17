package com.ex;
class NoThread{
public void show() {
	for(int i=0;i<=20;i++) {
		System.out.println("i value is="+i);
	}
}
}
public class WithoutThread {
	public static void main(String args[]) {
	NoThread nt=new NoThread();
	nt.show();
	for(int x=0;x<=20;x++)
	{
		System.out.println("x value is="+x);
	}
	
	}
}
