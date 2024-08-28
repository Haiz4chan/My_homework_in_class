
package assignment5_cs_303_ois_lenhatanh3696;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Ex2 : Nhap xuat va tinh trung binh du bao thoi tiet:
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();

        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
    }
}
