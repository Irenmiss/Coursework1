package Coursework1;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String department;
    private double salary;
    private static int counter = 0;
    private final int id;

    public Employee(String firstName, String middleName, String lastName, String department, double salary) {
        id = ++counter;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return getId() + ". ФИО: " + getEmployeeName() + " Отдел: " + getDepartment() + ". Оклад: " + getSalary() + " рублей.";

    }

    public static void generateFullEmployeeBook(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
