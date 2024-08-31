
public class L4E1_ParentChildInheritance {
   public static void main(String[] args) {
     Boat b = new Boat("50","WhiteSand", "Sea", "Raffles Marina");
     setModeOfTravel(b);
   }
  //b is recognised as variable t in this method
   public static void setModeOfTravel(Transportation t){
     //Boat is child of Transport so it can be inside
     t.move();
   }
}

class Transportation {
   String speed;
   String name;
   String type; // land, sea or air
   public Transportation(String speed, String name, String type) {
   this.speed = speed;
   this.name = name;
   this.type = type;
 }
   void move(){
     System.out.println ("Moving in "+ type + " at speed of " + speed);
 }
}

  class Boat extends Transportation {
     String basePort;

     public Boat(String speed, String name, String type, String basePort){
       super(speed, name, type);
       this.basePort = basePort;
     }

    void move(){
       System.out.println ("Moving in " + type + " at speed of " + speed + "\nThe base port for " + name + " is " + basePort);
    }
     
  }
