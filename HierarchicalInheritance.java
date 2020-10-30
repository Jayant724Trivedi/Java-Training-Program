class Car { 
	void DisplayCar() { 
		System.out.println("This is a content of parent class"); 
	} 
} 

class Audi extends Car { 
	void DisplayAudi() { 
		System.out.println("This is a content of child class 1"); 
	} 
} 
class Bmw extends Car { 
	void DisplayBmw() { 
		System.out.println("This is a content of child class 2"); 
	} 
}
class HierarchicalInheritance{ 
	public static void main(String args[]) { 
	Bmw b=new Bmw();
	b.DisplayCar();
	b.DisplayBmw();
	Audi a=new Audi();
	a.DisplayCar();
	a.DisplayAudi();
	} 
} 