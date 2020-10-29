class Restuarant{
	void takeOrder(String order){
	System.out.println("order given is :"+order);
	}
	void takeOrder(String order1, String order2){
	System.out.println("order given is : "+order1 +"and"+order2);
	}
	void takeOrder(String order1, String order2, String order3){
	System.out.println("order given is : "+order1 +"and" +order2 +"and"+order3);
	}
}
public class Overload{
	public static void main(String args[]){
	Restuarant rs=new Restuarant();
	rs.takeOrder("pizza");
	rs.takeOrder("berger,pizza");
	rs.takeOrder("pizza,berger,poori");
	}
}