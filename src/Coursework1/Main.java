package Coursework1;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Зайцев Евгений Николаевич", 1, 70_000);
        employeeBook.addEmployee("Белкин Анатолий Валентинович", 1, 80_000);
        employeeBook.addEmployee("Лисицина Инна Степановна", 2, 50_000);
        employeeBook.addEmployee("Котов Виктор Игоревич", 2, 100_000);
        employeeBook.addEmployee("Медведев Сергей Леонидович", 3, 65_000);
        employeeBook.addEmployee("Лосев Максим Владимирович", 3, 80_000);
        employeeBook.addEmployee("Кабанов Степан Аркадьевич", 4, 75_000);
        employeeBook.addEmployee("Селезнев Александр Владимирович", 4, 90_000);
        employeeBook.addEmployee("Волков Константин Владимирович", 5, 80_000);
        employeeBook.addEmployee("Фазан Елена Сергеевна", 5, 60_000);

        employeeBook.sealDepartmentEmployees();
        System.out.println();
        employeeBook.printAllEmployees();
        System.out.println();
        employeeBook.getSalaryChange("Зайцев Евгений Николаевич", 65_000);
        employeeBook.printAllEmployees();
    }
}