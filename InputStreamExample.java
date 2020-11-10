package com.ex;
import java.io.*;
public class InputStreamExample {    
	public static void main(String args[])throws Exception{    
	   FileInputStream input1=new FileInputStream("E:\\jnit.txt");    
	   FileInputStream input2=new FileInputStream("E:\\jnit.txt");    
	   SequenceInputStream sis=new SequenceInputStream(input1, input2);    
	   int j;    
	   while((j= sis.read())!=-1){    
	    System.out.print((char)j);    
	   }    
	   sis.close();    
	   input1.close();    
	   input2.close();    
	  }    

}
