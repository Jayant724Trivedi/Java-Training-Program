import java.util.Scanner;
class Test{
	void Square(){
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	a=sc.nextInt();
	System.out.println("Square of given number is : " + a*a);
	}	
}
class Sum extends Test{
	void add(){
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.println("Addition of two number is : " + c);
	}
}
public class SingleInheritance{
	public static void main(String args[]){
	Sum S=new Sum();
	S.Square();
	S.add();
	}
}
	
	
	