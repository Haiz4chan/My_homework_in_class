package assignment4_cs_303_ois_lenhatanh3696;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int wrong = 0;
        while (wrong < 3) {
            int num = random.nextInt(5) + 1;
            int sum = 0;
            for (int i = 0; i < num; i++) {
                int n = random.nextInt(10) + 1;
                sum += n;
                System.out.print(n + (i < num - 1 ? " + " : " = "));
            }
            int kq = scanner.nextInt();
            if (kq == sum) {
                System.out.println("Cỏnratulation! you have more 1 point.");
                score++;
            } else {
                System.out.println("Wrong! correct result is " + sum);
                wrong++;
            }
        }
        System.out.println("Your final score!!: " + score);
    }
}
