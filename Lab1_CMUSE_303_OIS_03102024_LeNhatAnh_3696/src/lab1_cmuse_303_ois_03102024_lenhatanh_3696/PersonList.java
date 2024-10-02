package lab1_cmuse_303_ois_03102024_lenhatanh_3696;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    Scanner scan = new Scanner(System.in);
    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public PersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addStudent() {
        System.out.print("Enter number of student you want to add: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information of student " + (i + 1));
            Student student = new Student();
            student.addPerson();
            this.personList.add(student);
        }
    }

    public void addTeacher() {
        System.out.print("Enter number of teacher you want to add: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information of teacher " + (i + 1));
            Teacher teacher = new Teacher();
            teacher.addPerson();
            this.personList.add(teacher);
        }
    }

    public void updatePerson(String id) {
        int i = 0;
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.updatePerson(id);
                System.out.println("Update successfully!");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("No person has id " + id);
        }
    }

    public void deletePersonById(String id) {
        for (int i = 0; i < this.personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.remove(i);
                System.out.println("Deleted person has id " + id);
                return;
            }
        }
        System.out.println("No person found with id " + id);
    }

    Person findPersonByID(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                System.out.println("Information of this person:");
                return person;
            }
        }
        System.out.println("No student found with id " + id);
        return null;
    }

    public void displayEveryone() {
        if (personList.isEmpty()) {
            System.out.println("Person list is emty!");
        } else {
            for (Person person : personList) {
                person.displayInfo();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    Student findTopStudent() {
        if (personList.isEmpty()) {
            System.out.println("Student list is emty!");
            return null;
        }
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student student) {
                if (topStudent == null || topStudent.getGpa() < student.getGpa()) {
                    topStudent = student;
                }
            }
        }
        if (topStudent == null) {
            System.out.println("No students found in the list!");
        }
        return topStudent;
    }

    Teacher findTeacherByDepartment(String department) {
        if (personList.isEmpty()) {
            System.out.println("Student list is emty!");
            return null;
        }
        for (Person person : personList) {
            if (person instanceof Teacher teacher) {
                if (teacher.getDepartmet().equals(department)) {
                    System.out.println("Information of this teacher:");
                    teacher.displayInfo();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                }
            }
        }
        return null;
    }
}
