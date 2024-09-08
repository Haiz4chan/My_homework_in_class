package This_Keyword;

public class Student {

    int id;
    String name;

    Student() {
        System.out.println("default constructor is invoked");
    }

    Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");
        s1.display();
        s2.display();
    }
}
