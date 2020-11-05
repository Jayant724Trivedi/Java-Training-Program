package com.ex;
public class Exception3 {
	  public static void main (String args[])
	  {  
		  int a[]=new int[8];  
	   try{   
		
		   a[9]=40;
	   }
	   catch(ArrayIndexOutOfBoundsException      e)
	   {
		  e.printStackTrace();
		   }  
	  
	  }  
	} 


