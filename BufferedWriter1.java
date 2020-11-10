package com.ex;
import java.io.*;  
public class BufferedWriter1 {  
public static void main(String[] args) throws Exception {     
    FileWriter fw = new FileWriter("E:\\jnit.txt");  
    BufferedWriter bw = new BufferedWriter(fw);  
    bw.write("Welcome to java.");  
    bw.close();  
    System.out.println("Success");  
    }  
}  
