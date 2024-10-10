package assignment13_cs_303_ois_lenhatanh3696;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Employee implements IEmployee {

    private String EmpID;
    private String EmpName;
    private Date EmpDateOfBirth;
    private Date StartDate;

    public Employee() {
    }

    public Employee(String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpDateOfBirth = EmpDateOfBirth;
        this.StartDate = StartDate;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Date getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(Date EmpDateOfBirth) {
        this.EmpDateOfBirth = EmpDateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    @SuppressWarnings("empty-statement")
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Employee ID: ");
        this.EmpID = scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        this.EmpName = scanner.nextLine();

        try {
            System.out.print("Enter Employee Date of Birth (dd/MM/yyyy): ");
            this.EmpDateOfBirth = sdf.parse(scanner.nextLine());

            System.out.print("Enter Employee Start Date (dd/MM/yyyy): ");
            this.StartDate = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Wrong format!!!");
        }
    }

    public void Output() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Employee ID: " + this.EmpID);
        System.out.println("Employee Name: " + this.EmpName);
        System.out.println("Employee Date of Birth: " + sdf.format(this.EmpDateOfBirth));
        System.out.println("Employee Start Date: " + sdf.format(this.StartDate));
    }

    public int CalculateSeniority() {
        Date currentDate = new Date();
        int years = currentDate.getYear() - StartDate.getYear();
        return years;
    }

    @Override
    public abstract double CalculateSalary();

    @Override
    public abstract double CalculateAllowance();

}
