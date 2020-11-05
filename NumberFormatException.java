package com.ex;
public class NumberFormatException {
	public static void main (String args[])
	  {  
		  String s="bcd";
		  int i=Integer.parseInt(s);
	   try{   
		
		 System.out.print(i);
	   }
	   catch(Exception   e)
	   {
		   e.printStackTrace();
		   }  
	}

}
