public class StaticVariable {
    public static void main(String[] args) {
      System.out.println ("count=" + Circle.count);
      Circle x = new Circle("red",1.0);
      System.out.println ("count=" + Circle.count);
      Circle y = new Circle("red",5.0);
      Circle z = new Circle("blue",10.0);
// all of them are referring to the same static variable of count inside the circle even though other variable changes
      System.out.println ("count=" + y.count);
      System.out.println ("count=" +  x.count);
    }
}

class Circle {
    String Color;
    double Radius;
    static int count=0;      // class variable
    Circle (String c, double r){
        Color = c; Radius = r;
        count++;
    }
}
