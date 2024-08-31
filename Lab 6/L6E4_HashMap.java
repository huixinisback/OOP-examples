
import java.util.*;

public class L6E4_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> choice1 = new HashMap<>();
        choice1.put(1, "AI");
        choice1.put(2, "Robotics");
        choice1.put(3, "IoT");
        Student one = new Student("12345", 3.40, choice1);

        HashMap<Integer, String> choice2 = new HashMap<>();
        choice2.put(1, "AI");
        choice2.put(2, "Robotics");
        choice2.put(3, "IoT");
        choice2.put(4, "Web");
        Student two = new Student("56789", 3.90, choice2);

        HashMap<Integer, String> choice3 = new HashMap<>();
        choice3.put(1, "AI");
        choice3.put(2, "Robotics");
        Student three = new Student("40987", 3.60, choice3);

        PriorityQueue<Student> a = new PriorityQueue<>(new SortByGPA());
        a.add(one);
        a.add(two);
        a.add(three);
        PriorityQueue<Student> clone = new PriorityQueue<>(new SortByGPA());
        clone.addAll(a);

        while (!a.isEmpty()) {
            Student s = a.poll();
            System.out.println(s.adm + ", " + s.GPA );
        }

        a.addAll(clone);



        //part 2

        HashMap<String,Integer> vacancy = new HashMap<>();
        vacancy.put("IoT", 2);
        vacancy.put("AI", 1);
        vacancy.put("Robotics", 1);
        vacancy.put("Web", 1);
        vacancy.forEach((s,i)->System.out.println("In " + s +" there is " + i +" slots."));

        while (!a.isEmpty()) {
            Student s = a.poll();
            applyChoice(s,vacancy);
            System.out.println(s.adm +" has been assigned to " + s.choices.get(1));
        }

        vacancy.forEach((s,i)->System.out.println("In " + s +" there is " + i +" slots."));


    }

    public static void applyChoice(Student student, HashMap<String, Integer> available){
        int x = 1;
        boolean yes = false;
        int numberOfChoices = student.choices.size();
        for(int i =1; i<=numberOfChoices; i++) {
            String choice = student.choices.get(i);
            int vacantSlot = available.get(choice);
            if (vacantSlot > 0) {
                student.choices.clear();
                student.choices.put(1, choice);
                available.put(choice,vacantSlot-1);
                yes = true;
                break;
            } else {
                x++;
            }

        }

        if(!yes){
            student.choices.clear();
            student.choices.put(1,"NIL");
        }


    }

}

class SortByGPA implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.GPA, s1.GPA); // Sort in descending order

        //s1.name.compareto(s2.name) for string comparison
    }
}

class Student {
    String adm;
    double GPA;
    HashMap<Integer, String> choices;

    public Student(String adm, double GPA, HashMap<Integer, String> choices) {
        this.adm = adm;
        this.GPA = GPA;
        this.choices = choices;
    }
}
