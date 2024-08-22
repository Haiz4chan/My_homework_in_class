package assignment3_cs_303_ois;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("So tren la so nguyen");
        } else {
            System.out.println("So ban da nhap khong phai la so nguyen.");
        }
    }
}
