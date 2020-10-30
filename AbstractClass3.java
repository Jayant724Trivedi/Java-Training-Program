abstract class Animal {
   abstract void makeSound();

   public void eat() {
      System.out.println("Eat");
   }
}

class Dog extends Animal {

   public void makeSound() {
      System.out.println("Bark bark");
   }
}
 public class AbstractClass3 {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.makeSound();
      d1.eat();
   }
}