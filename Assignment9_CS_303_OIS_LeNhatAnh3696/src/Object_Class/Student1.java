package Object_Class;

public class Student1 {

    int ID;
    String name;

    public Student1(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    void displayInformation() {
        System.out.println("ID: " + ID + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1(1, "Nam");
        Student1 student2 = new Student1(2, "Lan");
        student1.displayInformation();
        student2.displayInformation();
    }
}
