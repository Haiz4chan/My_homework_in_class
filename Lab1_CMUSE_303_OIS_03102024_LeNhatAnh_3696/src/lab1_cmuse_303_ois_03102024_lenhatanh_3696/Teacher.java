package lab1_cmuse_303_ois_03102024_lenhatanh_3696;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Teacher extends Person {

    Scanner scan = new Scanner(System.in);
    private String departmet;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String departmet, String teachingSubject) {
        this.departmet = departmet;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartmet() {
        return departmet;
    }

    public void setDepartmet(String departmet) {
        this.departmet = departmet;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        System.out.print("Enter id: ");
        this.setId(scan.nextLine());
        System.out.print("Enter name: ");
        this.setFullName(scan.nextLine());
        System.out.print("Enter date of birth: ");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.setDateOfBirth(sdf.parse(dateOfBirthString));
        } catch (Exception e) {
            System.out.println("Wrong format!");
        }
        System.out.print("Enter deparment: ");
        this.departmet = scan.nextLine();
        System.out.print("Enter subject: ");
        this.teachingSubject = scan.nextLine();
    }

    @Override
    public void updatePerson(String id) {
        System.out.print("Enter name: ");
        this.setFullName(scan.nextLine());
        System.out.print("Enter date of birth: ");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.setDateOfBirth(sdf.parse(dateOfBirthString));
        } catch (Exception e) {
            System.out.println("Wrong format!");
        }
        System.out.print("Enter deparment: ");
        this.departmet = scan.nextLine();
        System.out.print("Enter subject: ");
        this.teachingSubject = scan.nextLine();
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + this.getId() + "\nName: " + this.getFullName() + "\nDate of birth: " + sdf.format(this.getDateOfBirth()) + "\nDeparmet: " + this.getDepartmet() + "\nSubject: " + this.getTeachingSubject());
    }
}
