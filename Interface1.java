interface Printable{  
	void print();  
}  
interface Showable{  
	void show();  
}  
class Test implements Printable,Showable{  
	public void print(){
	System.out.println("Hello");
	}  
	public void show(){
	System.out.println("Welcome");
	} 
}
public class Interface1{ 
	public static void main(String args[]){  
	Test t = new Test();  
	t.print();  
	t.show();  
 }  
}  