public class ObjectInArray {
  public static void main(String[] args) {
    SpStudent s1 = new SpStudent();
    s1.name ="Ayoyama";
    s1.id=12345;
    s1.gpa=2.0;

    SpStudent s2 = new SpStudent();
    s2.name ="Jane";
    s2.id=45;
    s2.gpa=4.0;

    SpStudent s3 = new SpStudent();
    s3.name ="John";
    s3.id=123;
    s3.gpa=2.5;

    //int x[]= new int[10];
    SpStudent x[] ={s1, s2, s3};
    System.out.println(x.length);
    System.out.println(x[2].name);

  }

}