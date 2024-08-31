public class Polymorph {
  public static void main(String[] args) {
    Dog d1 =new Dog();
    Animal a1 = new Animal();
    //child class can be assigned to parent class object but info will be lost
    a1=d1;
    a1.move();
    d1.move();
    d1.run();
   // a1.run(); //data in d1 will be lost a1 cannot hold this for d1
    
  }

}

class Animal{
  void move(){
    System.out.println("Animal is moving");
  }
}

class Dog extends Animal{
  void run(){
    System.out.println("Dog is running");
  }

  void move(){
    System.out.println("Dog is moving");
  }
}