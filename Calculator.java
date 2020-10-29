class Test{
	int add(int a,int b){
	return a+b;
	}
	int sub(int a,int b){
	return a-b;
	}
	int mul(int a, int b){
	return a*b;
	}
	int div(int a, int b){
	return a/b;
	}
}
public class Calculator{
	public static void main(String args[]){
	Test t=new Test();
	t.add(10,2);
	t.sub(16,12);
	t.mul(5,4);
	t.div(18,2);
	System.out.println("Addition of a and b is:"+t.add(10,2));
	System.out.println("Substraction of a and b is:"+t.sub(16,12));
	System.out.println("Multiply of a and b is:"+t.mul(5,4));
	System.out.println("Division of a and b is:"+t.div(18,2));
	}
}
	
	