package Coursework1;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иван", "Иванович", "Иванов", "1", 20000);
        employee[1] = new Employee("Петр", "Петрович", "Петров", "1", 36500);
        employee[2] = new Employee("Настасья", "Петровна", "Коробочка", "2", 50000);
        employee[3] = new Employee("Михаил", "Александрович", "Берлиоз", "2", 45230);
        employee[4] = new Employee("Ипполит", "Матвеевич", "Воробьянинов", "3", 38200);
        employee[5] = new Employee("Михаил", "Семёнович", "Собакевич", "3", 21360);
        employee[6] = new Employee("Маргарита", "Николаевна", "", "4", 67800);
        employee[7] = new Employee("Остап", "Ибрагимович", "Бендер", "4", 93680);
        employee[8] = new Employee("Илья", "Ильич", "Обломов", "5", 159040);
        employee[9] = new Employee("Анна", "Аркадьевна", "Каренина", "5", 201400);
        System.out.println("Полный список сотрудников:");
        Employee.generateFullEmployeeBook(employee);
        System.out.println();
        employeeService.printTotalStaffCosts(employee);
        System.out.println();
        employeeService.printAverageSalary(employee);
        System.out.println();
        employeeService.printMaximumSalary(employee);
        System.out.println();
        employeeService.printMinimumSalary(employee);
        System.out.println();
        System.out.println("Список сотрудников:");
        employeeService.printEmployeeName(employee);
    }

}
