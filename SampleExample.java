package com.ex;
	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

	class Student implements Serializable
	 {
		 int Id;
		 String name;
		 int marks;

	public Student(int id, String name, int marks) {
			super();
			Id = id;
			this.name = name;
			this.marks = marks;
		}
	    public void Display()
	    {
	    	System.out.println("Id is :"+ this.Id);
	    	System.out.println(("Name is :"+this.name));
	    	System.out.println("Marks are :"+this.marks);
	    }}
	public class SampleExample {

		public static void main(String[] args) throws IOException {
			System.out.println("===========Student Details===========");
			Student rahul=new Student(1023,"rahul kumar",345);
			File f1=new File("E://student.txt");
			f1.createNewFile();
			FileOutputStream fos=new FileOutputStream(f1);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			rahul.Display();
			oos.writeObject(rahul);
			oos.flush();
			oos.close();
			fos.close();
			
		}
}
