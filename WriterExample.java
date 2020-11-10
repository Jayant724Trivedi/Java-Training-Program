package com.ex;
import java.io.*;

public class WriterExample {
		public static void main(String[] args) {  
        try {  
            Writer w = new FileWriter("E:\\jnit.txt");  
            String content = "This is program of writer class:";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

}
