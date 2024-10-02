package lab1_cmuse_303_ois_03102024_lenhatanh_3696;

import java.util.Scanner;

public class Processcer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList studentList = new PersonList();
        int choice;

        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Diplay all student and teacher");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("0. exit");
            System.out.print("Please choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.addTeacher();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Enter id: ");
                    String id = scanner.nextLine();
                    studentList.updatePerson(id);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Enter id of student you want to remove: ");
                    id = scanner.nextLine();
                    studentList.deletePersonById(id);
                    break;
                case 5:
                    studentList.displayEveryone();
                    break;
                case 6:
                    System.out.println("Top student is:");
                    studentList.findTopStudent().displayInfo();
                    break;
                case 7:
                    scanner.nextLine();
                    System.out.print("Enter departmet of teacher you want to find: ");
                    String departmet = scanner.nextLine();
                    studentList.findTeacherByDepartment(departmet);
                    break;
                case 0:
                    System.out.println("Exit program.");
                    break;
                default:
                    System.out.println("Wrong! Try again.");
            }
        } while (choice != 0);

    }
}
