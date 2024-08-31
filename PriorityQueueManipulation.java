import java.util.*;

public class PriorityQueueManipulation {
    public static void main(String[] args) {
        PriorityQueue<Student> a = new PriorityQueue<Student>(new SortByName());

        a.add(new Student("KK", 3.8));   // name, GPA
        a.add(new Student("Bobo", 3.5));
        a.add(new Student("Tutu", 2.9));

        PriorityQueue<Student> b = new PriorityQueue<Student>(new SortByGPA());
        b.addAll(a);

        while(!b.isEmpty()){
            System.out.println(b.poll());
        }
    }
}

class SortByGPA implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.GPA, s1.GPA); // Sort in descending order
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (s1.name.compareTo(s2.name)); // Sort in descending order
    }
}

class Student {
    String name;
    double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String toString() {
        return (name + ", " + GPA);
    }
}
