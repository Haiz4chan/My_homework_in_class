package assignment3_cs_303_ois;

import java.util.Scanner;

public class Assignment3_CS_303_OIS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//=================================BT1========================================//
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = scanner.nextInt();

        System.out.print("Nhap nam sinh: ");
        String yearOfBirth = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        System.out.print("Nhap chuyen nganh: ");
        String major = scanner.nextLine();

        System.out.print("Nhap GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Nhap que quan: ");
        scanner.nextLine();
        String hometown = scanner.nextLine();

        // Hiển thị thông tin
        System.out.println("\n--- Thong Tin ---");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Nam Sinh: " + yearOfBirth);
        System.out.println("Gioi Tinh: " + gender);
        System.out.println("Chuyen Nganh: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Que Quan: " + hometown);

//=================================BT2========================================//
        System.out.print("Nhap chuoi: ");

        if (scanner.hasNext()) {
            String input = scanner.next();

            if (input.length() == 1) {
                System.out.println("Ket qua da nhap khong phai la mot chuoi.");
            } else {
                System.out.println("Ket qua da nhap la mot chuoi.");
            }
        } else {
            System.out.println("Khong du lieu nhap vao.");
        }
//=================================BT3========================================//
        System.out.print("Nhap so nguyen: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt(); 
            System.out.println("So tren la so nguyen");
        } else {
            System.out.println("So ban da nhap khong phai la so nguyen.");
        }
    }
}
