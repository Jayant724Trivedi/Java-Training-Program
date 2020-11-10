package com.ex;
import java.io.CharArrayReader;  
public class CharArrayReaderExample{  
  public static void main(String[] ag) throws Exception {  
    char[] ary = { 'j', 'a', 'y', 'a', 'n', 't', 't', 'r', 'i', 'v','e','d','i' };  
    CharArrayReader car = new CharArrayReader(ary);  
    int i = 0;   
    while ((i = car.read()) != -1) {  
      char ch = (char) i;  
      System.out.print(ch + " : ");  
      System.out.println(i);  
    }  
  }  
}  
