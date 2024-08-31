import java.util.*;

public class PriorityQueueIterator {
    public static void main(String[] args) {
        PriorityQueue<Student> a = new PriorityQueue<Student>(new SortByName());
        a.add(new Student("KK"));
        a.add(new Student("Bobo"));
        a.add(new Student("Tutu"));
        Iterator<Student> it = a.iterator();
        while (it.hasNext())
            System.out.println(it.next().name);

    }


}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return((s1.name.compareTo(s2.name)));
    }
}


class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}