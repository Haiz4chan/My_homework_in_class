package mai_kt;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getFullName() + ", GPA: " + gpa + ", Major: " + major);
    }

    public static void addStudent(Person_List personList, Scanner scanner) {
        System.out.print("Nhap ID sinh vien: ");
        String studentId = scanner.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        String studentName = scanner.nextLine();
        System.out.print("Nhap GPA sinh vien: ");
        float gpa = scanner.nextFloat();
        System.out.print("Nhap chuyen nganh sinh vien: ");
        String major = scanner.nextLine();
        Date studentDOB = new Date();
        Student student = new Student(studentId, studentName, studentDOB, gpa, major);
        personList.addStudent(student);
        System.out.println("Da them sinh vien thanh cong.");
    }

    public static void uppdataStudent(Person_List personList, Scanner scanner) {
        System.out.print("Nhap ID sinh vien can cap nhat: ");
        String updateStudentId = scanner.nextLine();
        System.out.print("Nhap ho ten moi cua sinh vien: ");
        String newStudentName = scanner.nextLine();
        System.out.print("Nhap GPA moi: ");
        float newGpa = scanner.nextFloat();
        scanner.nextLine(); // Doc bo dong thua
        System.out.print("Nhap chuyen nganh moi: ");
        String newMajor = scanner.nextLine();
        Student updatedStudent = new Student(updateStudentId, newStudentName, new Date(), newGpa, newMajor);
        personList.updateStudent(updateStudentId, updatedStudent);
        System.out.println("Da cap nhat sinh vien.");
    }
}
