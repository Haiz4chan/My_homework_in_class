package assignment13_cs_303_ois_lenhatanh3696;

import java.util.Date;
import java.util.Scanner;

public class EmPartTime extends Employee {

    Scanner scanner = new Scanner(System.in);

    private int numberOfWorkdays;

    public EmPartTime() {
    }

    public EmPartTime(int numberOfWorkdays, String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        super(EmpID, EmpName, EmpDateOfBirth, StartDate);
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Enter Number of Workdays: ");
        this.numberOfWorkdays = scanner.nextInt();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Number of Workdays: " + this.numberOfWorkdays);
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * numberOfWorkdays / 26 + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 500000;
        } else if (seniority >= 5) {
            return 300000;
        } else {
            return 0;
        }
    }
}
