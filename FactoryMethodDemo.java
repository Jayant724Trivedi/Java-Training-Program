
abstract class Mobile{
abstract void cost();
abstract void ram();
abstract void rom();
abstract void camera_pexcel();
void open(){
System.out.println("open with power botton");
}
}

class Samsung extends Mobile{
 void cost(){
  System.out.println("Prize of Samsung is: 15000");
 }
 void ram(){
  System.out.println("Ram of Samsung is: 6GB");
 }
 void rom(){
  System.out.println("rom of Samsung is: 128GB");
 }
 void camera_pexcel(){
  System.out.println("camera_pexcel of Samsung is: 64px");
 }
}

class Apple extends Mobile{
 void cost(){
  System.out.println("Prize of Apple is: 45000");
 }
 void ram(){
  System.out.println("Ram of Apple is: 8GB");
 }
 void rom(){
  System.out.println("rom of Apple is: 256GB");
 }
 void camera_pexcel(){
  System.out.println("camera_pexcel of Apple is: 45px");
 }
}

class MobileFactory{
 static Mobile getMobile(String mobileName){
  if(mobileName.equalsIgnoreCase("Samsung")){
   return new Samsung();
  }
  else if(mobileName.equalsIgnoreCase("Apple")){
   return new Apple();
  }
  else {
   return null;
  }
 }
}
class FactoryMethodDemo{
public static void main(String args[]){
Mobile x=MobileFactory.getMobile(args[0]);
x.cost();
x.ram();
x.camera_pexcel();
x.rom();
x.open();
}
}
