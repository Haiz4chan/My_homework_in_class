package mai_kt;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + " | Name: " + getFullName() + " | Department: " + getDepartment() + " |  TeachingSubject: " + getDepartment());
    }

    public static void addTeacher(Person_List personList, Scanner scanner) {
        System.out.print("Nhap ID giao vien can cap nhat: ");
        String updateTeacherId = scanner.nextLine();
        System.out.print("Nhap ho ten moi cua giao vien: ");
        String newTeacherName = scanner.nextLine();
        System.out.print("Nhap khoa moi: ");
        String newDepartment = scanner.nextLine();
        System.out.print("Nhap mon day moi: ");
        String newSubject = scanner.nextLine();
        Teacher updatedTeacher = new Teacher(updateTeacherId, newTeacherName, new Date(), newDepartment, newSubject);
        personList.updateTeacher(updateTeacherId, updatedTeacher);
        System.out.println("Da cap nhat giao vien.");
    }

    public static void uppdateTeacher(Person_List personList, Scanner scanner) {
        System.out.print("Nhap ID giao vien can cap nhat: ");
        String updateTeacherId = scanner.nextLine();
        System.out.print("Nhap ho ten moi cua giao vien: ");
        String newTeacherName = scanner.nextLine();
        System.out.print("Nhap khoa moi: ");
        String newDepartment = scanner.nextLine();
        System.out.print("Nhap mon day moi: ");
        String newSubject = scanner.nextLine();
        Teacher updatedTeacher = new Teacher(updateTeacherId, newTeacherName, new Date(), newDepartment, newSubject);
        personList.updateTeacher(updateTeacherId, updatedTeacher);
        System.out.println("Da cap nhat giao vien.");
    }
}
