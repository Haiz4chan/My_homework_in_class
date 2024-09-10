package assignment10_cs_303_ois_lenhatanh3696;

import java.util.Scanner;

public class Assignment10_CS_303_OIS_LeNhatAnh3696 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        Author author = new Author();
        int choice;
        do {
            while (true) {
                System.out.println("__________________________");
                System.out.println("1. Nhap thong tin sach.");
                System.out.println("2. Nhap thong tin tac gia.");
                System.out.println("3. Xuat thong tin sach.");
                System.out.println("4. Xuat thong tin tac gia.");
                System.out.println("0. Thoat.");
                System.out.print("Chon: ");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Nhap tieu de sach: ");
                        book.setTitle(scanner.nextLine());

                        System.out.print("Nhap ten tac gia: ");
                        book.setAuthor(scanner.nextLine());

                        System.out.print("Nhap gia sach: ");
                        book.setPrice(scanner.nextDouble());
                        scanner.nextLine();

                        System.out.println("Thong tin sach vua nhap:");
                        System.out.println(book);
                        break;
                    case 2:
                        System.out.print("Nhap ten tac gia: ");
                        author.setName(scanner.nextLine());

                        System.out.print("Nhap ngay sinh tac gia: ");
                        author.setDateOfBirth(scanner.nextLine());

                        System.out.println("Thong tin tac gia vua nhap:");
                        System.out.println(author);
                        break;
                    case 3:
                        System.out.println("Thong tin sach:");
                        System.out.println(book);
                        break;
                    case 4:
                        System.out.println("Thong tin tac gia:");
                        System.out.println(author);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }while (choice != 0);
    }
}
