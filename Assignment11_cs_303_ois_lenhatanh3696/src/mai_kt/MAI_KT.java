package mai_kt;

import java.util.Date;
import java.util.Scanner;

public class MAI_KT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person_List personList = new Person_List();
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Them giao vien");
            System.out.println("3. Cap nhat sinh vien");
            System.out.println("4. Cap nhat giao vien");
            System.out.println("5. Xoa mot nguoi theo ID");
            System.out.println("6. Hien thi tat ca");
            System.out.println("7. Tim sinh vien co GPA cao nhat");
            System.out.println("8. Tim giao vien theo khoa");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Student.addStudent(personList, scanner);
                    break;

                case 2:
                    Teacher.addTeacher(personList, scanner);
                    break;

                case 3:
                    Student.uppdataStudent(personList, scanner);
                    break;

                case 4:
                    Teacher.uppdateTeacher(personList, scanner);
                    break;

                case 5:
                    System.out.print("Nhap ID nguoi can xoa: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    System.out.println("Da xoa thanh cong.");
                    break;

                case 6:
                    System.out.println("Danh sach nguoi:");
                    personList.displayEveryone();
                    break;

                case 7:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Sinh vien co GPA cao nhat:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("Khong co sinh vien nao.");
                    }
                    break;

                case 8:
                    System.out.print("Nhap khoa can tim: ");
                    String searchDepartment = scanner.nextLine();
                    Teacher foundTeacher = personList.findTeacherByDepartment(searchDepartment);
                    if (foundTeacher != null) {
                        System.out.println("Giao vien thuoc khoa " + searchDepartment + ":");
                        foundTeacher.displayInfo();
                    } else {
                        System.out.println("Khong tim thay giao vien thuoc khoa nay.");
                    }
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
