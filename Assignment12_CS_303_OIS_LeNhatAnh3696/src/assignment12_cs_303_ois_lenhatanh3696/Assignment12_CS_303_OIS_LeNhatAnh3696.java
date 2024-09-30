package assignment12_cs_303_ois_lenhatanh3696;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment12_CS_303_OIS_LeNhatAnh3696 {

    public static void main(String[] args) {
        WeatherData weatherData = WeatherUtils.inputWeatherData();
        WeatherUtils.writeWeatherDataToFile(weatherData, "weather_report.txt");
    }
}

class WeatherData {

    String[] days;
    double[] temperatures;
    String[] conditions;

    public WeatherData(String[] days, double[] temperatures, String[] conditions) {
        this.days = days;
        this.temperatures = temperatures;
        this.conditions = conditions;
    }
}

class WeatherUtils {

    public static WeatherData inputWeatherData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ngay can bao cao: ");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();

        String[] days = new String[numberOfDays];
        double[] temperatures = new double[numberOfDays];
        String[] conditions = new String[numberOfDays];

        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Nhap ten ngay (vi du: Monday): ");
            days[i] = scanner.nextLine();
            System.out.print("Nhap nhiet do: ");
            temperatures[i] = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Nhap tinh trang thoi tiet (vi du: Sunny, Rainy): ");
            conditions[i] = scanner.nextLine();
        }

        return new WeatherData(days, temperatures, conditions);
    }

    public static void writeWeatherDataToFile(WeatherData weatherData, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Weather Report:\n");
            for (int i = 0; i < weatherData.days.length; i++) {
                writer.write("Day: " + weatherData.days[i] + "\n");
                writer.write("Temperature: " + weatherData.temperatures[i] + " °C\n");
                writer.write("Condition: " + weatherData.conditions[i] + "\n");
                writer.write("\n");
            }
            System.out.println("Weather report has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
