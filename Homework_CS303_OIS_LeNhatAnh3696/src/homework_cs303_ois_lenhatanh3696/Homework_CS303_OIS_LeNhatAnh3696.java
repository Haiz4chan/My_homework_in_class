package homework_cs303_ois_lenhatanh3696;

import java.util.Scanner; 

public class Homework_CS303_OIS_LeNhatAnh3696 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Nhap so nguyen thu nhat: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Phan du: " + remainder);
        
        scanner.close();
    }
}
/* thầy chưa dạy scanner nên em lên mạng xem trước ha :)) */