class Car{
   	 void cost(){
      	System.out.println("No Cost");
  	 }
	void milage(){
	System.out.println("No milage");
	}	
}
class Verna extends Car{
    	void cost(){
      	System.out.println("Verna cost is 50 lakhs");
   	}
	void milage(){
	System.out.println("Verna milage is 10 km");
	}
}
class Brezza extends Car{
	void cost(){
      	System.out.println("Brezza cost is 40 lakhs");
   	}
	void milage(){
	System.out.println("Brezza milage is 20 km");
	}
}
public class MethodOverride1{
   public static void main( String args[]) {
      Car x=new Car();
	x.cost();
	x.milage();
	Verna v=new Verna();
	v.cost();
	v.milage();
	Brezza b=new Brezza();
	b.cost();
	b.milage();
	}
}

