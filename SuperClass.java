
public class SuperClass {
  public static void main(String[] args) {
    Seafoods seafood = new Seafoods();
    seafood.eat(); // parent class will execute and then whatever inside of child class will execute
    Seafoods newExample = new Seafoods(123);
    Seafoods emptyParent = new Seafoods("here just child");
    
    //will call the 2nd  constructor 
  }
} 

public class Buffet {
  Buffet(){
    System.out.println("Parent constructor");
  }

  Buffet(int x){
    this(); // will call the main constructor ^^
    this("something");// will call the constructor with the string below
    System.out.println("Parent constructor with argumennt");
  }

  Buffet(String x){
    //empty constructor
  }

  void eat() {
    System.out.println("I'm eating");
  }

}

public class Seafoods extends Buffet {
  Seafoods() {
    super(99); // will disable the auto-hidden super()
              // will call the 2nd constructor
    System.out.println("Child constructor");
  }

  Seafoods(int x){// this has auto-hidden super()
    System.out.println("Child constructor with argument");
  }

  Seafoods(String x){
    super("i dont want parent");
    System.out.println("Child constructor parent with no functions");
  }

  void eat() {
    super.eat();
    System.out.println("I'm eating seafood");
  }
}
 
