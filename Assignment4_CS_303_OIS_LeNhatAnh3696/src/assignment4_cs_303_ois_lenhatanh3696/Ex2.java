package assignment4_cs_303_ois_lenhatanh3696;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay dien con so may man cua ban ngay hom nay: ");
        int lucky_number = random.nextInt(100) + 1;
        int number = scanner.nextInt();
        if (number == lucky_number) {
            System.out.println("Chuc mung ban may man ngay hom nay voi ket qua so: " + lucky_number);
        } else {
            System.out.println("Dang tiet , con so may man ngay hom nay la: " + lucky_number);
        }
    }
}
