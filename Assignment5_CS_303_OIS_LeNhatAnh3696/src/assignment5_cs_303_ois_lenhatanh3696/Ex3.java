package assignment5_cs_303_ois_lenhatanh3696;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        int[] temps = new int[days];

        System.out.println("Enter the temperatures for each day:");
        int total = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temps[i] = scanner.nextInt();
            total += temps[i];
        }

        double average = (double) total / days;

        int count = 0;
        for (int temp : temps) {
            if (temp > average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days above average");
        System.out.println("Temperatures: " + Arrays.toString(temps));

        Arrays.sort(temps);

        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);
    }
}
