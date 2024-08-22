package assignment3_cs_303_ois;

import java.util.Scanner;

public class Ex1 {
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
}
