import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameNScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int option = 0; // Changed to default to the menu

        while (option != 4) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Delete a student");
            System.out.println("3. Check Details");
            System.out.println("4. Exit");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: // Add a student
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.print("Gender: ");
                    String gender = scanner.nextLine();

                    System.out.print("Score: ");
                    double score = Double.parseDouble(scanner.nextLine());

                    students.add(new Student(name, age, gender, score));
                    break;

                case 2: // Delete a student
                    if (students.isEmpty()) {
                        System.out.println("No students to delete.");
                        break;
                    }

                    System.out.print("Enter the name of the student to delete: ");
                    String nameToDelete = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < students.size(); i++) {
                        if(students.get(i).getName().equalsIgnoreCase(nameToDelete)) {
                            students.remove(i);
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                
                case 3: // Check details
                  System.out.println("\nStudent Details:");
                  for (Student student : students) {
                      System.out.println("Name: " + student.getName() +
                                         ", Age: " + student.getAge() +
                                         ", Gender: " + student.getGender() +
                                         ", Score: " + student.getScore());
                  }
                  break;  


                case 4: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        // Display the remaining students
        System.out.println("\nRemaining Student Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() +
                               ", Age: " + student.getAge() +
                               ", Gender: " + student.getGender() +
                               ", Score: " + student.getScore());
        }

        scanner.close();
    }
}

public class Student {
    // Private fields to store student information
    private String name;
    private int age;
    private String gender;
    private double score;

    // Constructor to initialize the student records
    public Student(String name, int age, String gender, double score) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
    }

    // Getter methods for each field
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getScore() {
        return score;
    }
}
