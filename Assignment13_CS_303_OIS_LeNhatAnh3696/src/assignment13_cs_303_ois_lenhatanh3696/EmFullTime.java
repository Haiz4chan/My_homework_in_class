package assignment13_cs_303_ois_lenhatanh3696;

import java.util.Date;
import java.util.Scanner;

public class EmFullTime extends Employee {

    Scanner scanner = new Scanner(System.in);
    private double coefficientSalary;

    public EmFullTime() {
    }

    public EmFullTime(double coefficientSalary, String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        super(EmpID, EmpName, EmpDateOfBirth, StartDate);
        this.coefficientSalary = coefficientSalary;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * coefficientSalary + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 1000000;
        } else if (seniority >= 5) {
            return 500000;
        } else {
            return 0;
        }
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Enter Salary Coefficient: ");
        this.coefficientSalary = scanner.nextDouble();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Salary Coefficient: " + this.coefficientSalary);
    }

}
