package assignment7_cs_303_ois_lenhatanh3696;

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment7_CS_303_OIS_LeNhatAnh3696 {

    public static void main(String[] args) {
        ArrayList<Integer> mangdong = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("====================================");
            System.out.println("1. Them phan tu vao mang: ");
            System.out.println("2. Xuat phan tu vao mang: ");
            System.out.println("3. Xoa phan tu le ra khoi mang: ");
            System.out.println("4. Tim gia tri phan tu lon thu 2 trong mang: ");
            System.out.println("5. Thoat");
            System.out.println("====================================");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Them_mang(mangdong, scanner);
                    break;
                case 2:
                    Xuat_mang(mangdong);
                    break;
                case 3:
                    Xoa_phan_tu(mangdong);
                    break;
                case 4:
                    int max2 = Phan_tu_max(mangdong);
                    if (max2 == Integer.MIN_VALUE) {
                        System.out.println("Khong tim thay phan tu lon thu 2 cua mang!!");
                    } else {
                        System.out.println("Phan tu lon thu 2 cua mang la: " + max2);
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!!");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void Them_mang(ArrayList<Integer> mangdong, Scanner scanner) {
        System.out.println("Nhap so luong phan tu cua mang: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("Nhap phan tu: ");
            int phantu = scanner.nextInt();
            mangdong.add(phantu);
            System.out.println("Phan tu da duoc them.");
        }
    }

    public static void Xuat_mang(ArrayList<Integer> mangdong) {
        System.out.println("Cac phan tu trong mang da nhap la: :");
        for (int phantu : mangdong) {
            System.out.print(phantu + " ");
        }
        System.out.println();
    }

    public static void Xoa_phan_tu(ArrayList<Integer> mangdong) {
        for (int i = mangdong.size() - 1; i >= 0; i--) {
            if (mangdong.get(i) % 2 != 0) {
                mangdong.remove(i);
            }
        }
        System.out.println("Cac phan tu bay gio la: ");
        for (int phantu : mangdong) {
            System.out.print(phantu + " ");
        }
        System.out.println();
    }

    public static int Phan_tu_max(ArrayList<Integer> mangdong) {
        if (mangdong.size() < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu!!");
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int number : mangdong) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number < max1) {
                max2 = number;
            }
        }
        return max2;
    }
}
