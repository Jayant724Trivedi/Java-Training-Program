package com.ex;
public class Exception1 { 
		  public static void main(String args[])
		  {  
		   try{   
		      int x=50/0;  
		   }
		   catch(ArithmeticException e)
		   {
			  e.printStackTrace();
			   }  
		  }  
} 

