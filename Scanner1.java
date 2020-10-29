import java.util.Scanner;
class Student{
	int id ;
	float percentage;
	int age;
	String clg_name;
}
public class Scanner1{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student id");
	int id=sc.nextInt();
	System.out.println("Enter student percentage");
	float percentage=sc.nextFloat();
	System.out.println("Enter student age");
	int age=sc.nextInt();
	System.out.println("Enter student clg_name");
	String clg_name=sc.next();
	
	
}
}	