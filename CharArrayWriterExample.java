package com.ex;
import java.io.CharArrayWriter;  
import java.io.FileWriter;  
public class CharArrayWriterExample {  
public static void main(String args[])throws Exception{    
          CharArrayWriter caw=new CharArrayWriter();    
          caw.write("Welcome to java methods");    
          FileWriter f1=new FileWriter("E:\\a.txt");    
          FileWriter f2=new FileWriter("E:\\b.txt");     
          caw.writeTo(f1);    
          caw.writeTo(f2);    
          f1.close();    
          f2.close();    
          System.out.println("Success...");    
         } 
}
