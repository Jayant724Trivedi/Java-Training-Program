class Sweet{
	void menu(){
	System.out.println("1.pizza 2.samosa 3.jalebi 4.poha");
}
void takeOrder(String order){
	System.out.println("order given is" +order);
}
String serveFood(){
	return "jalebi";
}
int giveBill(){
	return 200;
}
String payBill(int amount){
	System.out.println("Amount given is "+amount);
	return "paid";
}
}
class Client{
	public static void main(String args[]){
	Sweet s =new Sweet();
	s.menu();
	s.takeOrder("jalebi");
	s.serveFood();
	String plate=s.serveFood();
	System.out.println("food served is "+plate);
	System.out.println("food served is "+s.serveFood());
	System.out.println("Bill is "+s.giveBill());
	System.out.println("Bill"+s.payBill(200));
}
}
