public class ConstructorType {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Lata");
        Student s3 = new Student(123);
    }
}
class Student {
    String name;
    int roll;

    //Non-Parametrized Constructor
    Student() {
        System.out.println("Constructor is call....");
    }
    //Parametrized Constructor
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
}
