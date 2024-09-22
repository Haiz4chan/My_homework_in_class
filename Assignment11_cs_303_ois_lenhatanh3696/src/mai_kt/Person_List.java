package mai_kt;

import java.util.ArrayList;

public class Person_List {

    private ArrayList<Person> personList = new ArrayList<>();

    public void addStudent(Student student) {
        personList.add(student);
    }

    public void updateStudent(String id, Student updatedStudent) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i) instanceof Student && personList.get(i).getId().equals(id)) {
                personList.set(i, updatedStudent);
                return;
            }
        }
    }

    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
    }

    public void updateTeacher(String id, Teacher updatedTeacher) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i) instanceof Teacher && personList.get(i).getId().equals(id)) {
                personList.set(i, updatedTeacher);
                return;
            }
        }
    }

    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }
}
