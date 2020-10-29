class Test{
	int Student_id;
	String Student_name;
	int age;
	float percentage;
	Test(){
	Student_id=102;
	Student_name="rahul";
	age=20;
	percentage=75;
	}
	Test(int p, String q, int r, float s){
	Student_id=p;
	Student_name=q;
	age=r;
	percentage=s;
	}
void display(){
	System.out.println("Student id "+Student_id);
	System.out.println("Student name "+Student_name);
	System.out.println("Student age "+age);
	System.out.println("Student percentage "+percentage);
	}
}
public class Constructor{
	public static void main(String args[]){
	Test t=new Test();
	t.display();
	Test t1= new Test(103,"vijay",21,60);
	t1.display();
	Test t2=new Test(105,"anil",22,65);
	t2.display();
	}
}
	

	

