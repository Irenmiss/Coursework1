package Coursework1;

public class EmployeeService {

    public double countTotalMonthlyStaffCosts(Employee[] employee) {
        double sumInMonth = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            sumInMonth += employee[i].getSalary();
        }
        return sumInMonth;
    }

    public void printTotalStaffCosts(Employee[] employee) {
        System.out.println("Общая сумма затрат на персонал составляет: " + countTotalMonthlyStaffCosts(employee) + " рублей в месяц.");
    }

    public double countAverageSum(Employee[] employee) {
        int counter = 0;
        double averageSum;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                counter++;
            }
        }
        averageSum = countTotalMonthlyStaffCosts(employee) / counter;
        return averageSum;
    }

    public void printAverageSalary(Employee[] employee) {
        System.out.println("Средняя заработная плата составляет: " + countAverageSum(employee) + " рублей в месяц.");
    }

    public double findMinimumSalary(Employee[] employee) {
        double minSalary = 0;
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
                if (employee[i].getSalary() == findMinimumSalary(employee)) {
                    System.out.println("Минимальная заработная плата составляет: " + findMinimumSalary(employee) + " рублей у сотрудника " + employee[i].getEmployeeName());
                }
            }
        }
    }

    public double findMaximumSalary(Employee[] employee) {
        double maxSalary = 0;
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
                if (employee[i].getSalary() == findMaximumSalary(employee)) {
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
