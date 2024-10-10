package assignment13_cs_303_ois_lenhatanh3696;

import java.util.ArrayList;
import java.util.Scanner;

public class EMP_LIST {

    private final ArrayList<Employee> list = new ArrayList<>();

    public void AddNew(Employee emp) {
        list.add(emp);
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public void Update(String EmpID) {
        for (Employee emp : list) {
            if (emp.getEmpID().equals(EmpID)) {
                emp.Input();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public Employee Find(String EmpID) {
        for (Employee emp : list) {
            if (emp.getEmpID().equals(EmpID)) {
                return emp;
            }
        }
        System.out.println("Employee not found.");
        return null;
    }

    public void Delete(String EmpID) {
        Employee emp = Find(EmpID);
        if (emp != null) {
            list.remove(emp);
            System.out.println("Employee removed.");
        }
    }

    public void Menu() {
        EMP_LIST empList = new EMP_LIST();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Find Employee");
            System.out.println("6. Display All Employees");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    EmFullTime fullTimeEmp = new EmFullTime();
                    fullTimeEmp.Input();
                    empList.AddNew(fullTimeEmp);
                    System.out.println("Full-Time Employee added.");
                }

                case 2 -> {
                    EmPartTime partTimeEmp = new EmPartTime();
                    partTimeEmp.Input();
                    empList.AddNew(partTimeEmp);
                    System.out.println("Part-Time Employee added.");
                }

                case 3 -> {
                    System.out.print("Enter Employee ID to update: ");
                    String updateID = scanner.next();
                    empList.Update(updateID);
                }

                case 4 -> {
                    System.out.print("Enter Employee ID to delete: ");
                    String deleteID = scanner.next();
                    empList.Delete(deleteID);
                }

                case 5 -> {
                    System.out.print("Enter Employee ID to find: ");
                    String findID = scanner.next();
                    Employee emp = empList.Find(findID);
                    if (emp != null) {
                        emp.Output();
                        System.out.println("Calculated Salary: " + emp.CalculateSalary());
                        System.out.println("Calculated Allowance: " + emp.CalculateAllowance());
                    }
                }

                case 6 -> {
                    System.out.println("Displaying all employees:");
                    for (Employee e : empList.getList()) {
                        e.Output();
                        System.out.println("Calculated Salary: " + e.CalculateSalary());
                        System.out.println("Calculated Allowance: " + e.CalculateAllowance());
                        System.out.println("----------------------------");
                    }
                }

                case 0 ->
                    System.out.println("Exiting...");

                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
