package com.ex;
import java.io.PipedReader;  
import java.io.PipedWriter;  
  public class PipedReaderExample {  
    public static void main(String[] args) {  
        try {  
  
            final PipedReader pr = new PipedReader();  
            final PipedWriter pw = new PipedWriter(pr);  
  
            Thread readerThread = new Thread(new Runnable() {  
                public void run() {  
                    try {  
                        int i = pr.read();  
                        while (i != -1) {  
                            System.out.print((char) i);  
                            i = pr.read();  
                        }  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            Thread writerThread = new Thread(new Runnable() {  
                public void run() {  
                    try {  
                        pw.write("This is program of piped reader and piped writer:\n".toCharArray());  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            readerThread.start();  
            writerThread.start();  
  
        } catch (Exception e) {  
            System.out.println(e.getMessage());  
        }  
  
    }  
}  
