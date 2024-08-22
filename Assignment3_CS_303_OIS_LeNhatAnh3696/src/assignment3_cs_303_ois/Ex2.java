package assignment3_cs_303_ois;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Nhap chuoi: ");

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
    }
}
