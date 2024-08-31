import java.util.ArrayList;

public class ObjectInArrayList {
    static ArrayList a1 = new ArrayList();

    public static void main(String[] args) {
        Student s = new Student();
        Car c = new Car();
        a1.add(c);
        a1.add(s);

        if ((a1.get(0).getClass().toString().substring(6)).equals("Car")) {
            Car d = (Car) a1.get(0);
        } else if ((a1.get(0).getClass().toString().substring(6)).equals("Student")) {
            Student f = (Student) a1.get(1);
        }
    }
}

class Car {

}

class Student {

}

//example 2
/*
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> a1 = new ArrayList<>();   
      // insert elements into ArrayList
      for (int i=1; i<=5; i++){
        a1.add(i*10);
      }  
    System.out.println(a1);
    a1.remove(2);
    System.out.println(a1);
    a1.set(2,100);
    System.out.println(a1);
    a1.remove(Integer.valueOf(50));
    System.out.println(a1);
  }
}
*/