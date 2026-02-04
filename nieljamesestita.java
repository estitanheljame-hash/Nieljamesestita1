public class Student {

    String name;
    int age;
    String course;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Student Information");
        System.out.println("-------------------");

        Student student1 = new Student();
        student1.name = "Ana Cruz";
        student1.age = 20;
        student1.course = "BSIT";
        
        Student student2 = new Student();
        student2.name = "niel estita";
        student2.age = 18;
        student2.course = "BSIT";

        student1.displayInfo();
        student2.displayInfo();
    }
}