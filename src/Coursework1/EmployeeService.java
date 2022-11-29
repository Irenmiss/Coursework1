package Coursework1;

import java.util.Arrays;

public class EmployeeService {
    public Employee[] employee = new Employee[10];
    private double sumInMonth;
    private double averageSum;
    private double minSalary;
    private double maxSalary;


    public double countTotalMonthlyStaffCosts(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sumInMonth += employee[i].getSalary();
            }
        }
        return sumInMonth;
    }

    public void printTotalStaffCosts(Employee[] employee) {
        System.out.println("Общая сумма затрат на персонал составляет: " + countTotalMonthlyStaffCosts(employee) + " рублей в месяц.");
    }

    public double countAverageSum(Employee[] employee) {
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            {
                count++;
                averageSum = sumInMonth / count;
            }
        }
        return averageSum;
    }

    public void printAverageSalary(Employee[] employee) {
        System.out.println("Средняя заработная плата составляет: " + countAverageSum(employee) + " рублей в месяц.");
    }

    public double findMinimumSalary(Employee[] employee) {
        minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() < minSalary) {
                    minSalary = employee[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public void printMinimumSalary(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                findMinimumSalary(employee);
                if (employee[i].getSalary() == minSalary) {
                    System.out.println("Минимальная заработная плата составляет: " + findMinimumSalary(employee) + " рублей у сотрудника " + employee[i].getEmployeeName());
                }
            }
        }
    }

    public double findMaximumSalary(Employee[] employee) {
        maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        return maxSalary;
    }

    public void printMaximumSalary(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                findMaximumSalary(employee);
                if (employee[i].getSalary() == maxSalary) {
                    System.out.println("Максимальная заработная плата составляет: " + findMaximumSalary(employee) + " рублей у сотрудника " + employee[i].getEmployeeName());
                }
            }
        }
    }

    public void printEmployeeName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getEmployeeName());
            }
        }
    }
}
