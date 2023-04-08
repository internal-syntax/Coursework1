package Coursework1;

public class Main {
    public static Employee[] employees = new Employee[10];
    private static int employeeCount = 0;

    public static void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = employee;
        }
    }

    public static void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println("ФИО - " + employee.getFullName() + ", отдел - " + employee.getDepartment() + ", зарплата - " + employee.getSalary() + ", id - " + employee.getId());
        }
    }

    public static int salaryСalculation() {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        return salarySum;
    }

    public static int maximumWageSearch() {
        int maximumSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maximumSalary) {
                maximumSalary = employees[i].getSalary();
            }
        }
        return maximumSalary;
    }

    public static int minimumWageSearch() {
        int minimumSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minimumSalary) {
                minimumSalary = employees[i].getSalary();
            }
        }
        return minimumSalary;
    }

    public static double getAverageSalary() {
        return (double) salaryСalculation() / employees.length;
    }

    public static void getSalaryIndexation() {
        for (int i = 0; i < employees.length; i++) {
            double a = (employees[i].getSalary() * 0.07) + employees[i].getSalary();
            System.out.println("Зарплата сотрудника " + employees[i].getFullName() + " до индексации составляла - " + employees[i].getSalary() + ", после индексации на 7% и составляет - " + a);
        }
    }

    public static void getDepartmentMinimumWage(int department) {
        Employee minSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (minSalaryEmployee == null || employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employees[i];
                }
            }
        }
        System.out.println("В отделе № " + department + " " + "сотрудник с минимальной зарплатой - " + minSalaryEmployee);
    }

    public static void getDepartmentMaximumWage(int department) {
        Employee maxSalaryEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (maxSalaryEmployee == null || employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        System.out.println("В отделе № " + department + " " + "сотрудник с  максимальной зарплатой - " + maxSalaryEmployee);
    }

    public static int getDepartmentSalaries(int department) {
        int sumSalaryDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sumSalaryDepartment += employee.getSalary();
            }
        }
        System.out.println("Сумма зарплат сотрудников отдела №" + department + ": " + sumSalaryDepartment);
        return sumSalaryDepartment;
    }

    public static int getDepartmentAverageSalary(int department) {
        int sumSalaryDepartment = 0;
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                countEmployees++;
                sumSalaryDepartment = (sumSalaryDepartment + employee.getSalary()) / countEmployees;
            }
        }
        System.out.println("Средняя зарплата сотрудников отдела №" + department + ": " + sumSalaryDepartment);
        return sumSalaryDepartment;
    }

    public static int getIndexationSalariesEmployeesDepartment(int department, int indexation) {
        int salarySum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                salarySum += employee.getSalary();
            }
        }
        int indexationAmount = salarySum * indexation / 100;
        System.out.println("Сумма индексации зарплат для сотрудников отдела №" + department + " составит " + indexationAmount);
        return indexationAmount;
    }

    public static void getDataEmployeesDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("Сотрудник" + ": ФИО - " + employee.getFullName() + ", id - " + employee.getId() + ", зарплата - " + employee.getSalary());
            }
        }
    }


    public static int compareSalaries1(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < number) {
                System.out.println("id - " + employees[i].getId() + ", ФИО - " + employees[i].getFullName() + ", зарплата - " + employees[i].getSalary());
            }
        }
        return number;
    }

    public static int compareSalaries2(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= number) {
                System.out.println("id - " + employees[i].getId() + ", ФИО - " + employees[i].getFullName() + ", зарплата - " + employees[i].getSalary());
            }
        }
        return number;
    }

    public static void displayFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО сотрудника: " + employees[i].getFullName());
        }
    }

    public static void main(String[] args) {
        Employee Zaytcev = new Employee("Зайцев Евгений Николаевич", 1, 70_000);
        Employee Belkin = new Employee("Белкин Анатолий Валентинович", 1, 80_000);
        Employee Lisytcina = new Employee("Лисицина Инна Степановна", 2, 50_000);
        Employee Kotov = new Employee("Котов Виктор Игоревич", 2, 100_000);
        Employee Medvedev = new Employee("Медведев Сергей Леонидович", 3, 65_000);
        Employee Losev = new Employee("Лосев Максим Владимирович", 3, 80_000);
        Employee Kabanov = new Employee("Кабанов Степан Аркадьевич", 4, 75_000);
        Employee Seleznev = new Employee("Селезнев Александр Владимирович", 4, 90_000);
        Employee Volkov = new Employee("Волков Константин Владимирович", 5, 80_000);
        Employee Fazan = new Employee("Фазан Елена Сергеевна", 5, 60_000);

        addEmployee(Zaytcev);
        addEmployee(Belkin);
        addEmployee(Lisytcina);
        addEmployee(Kotov);
        addEmployee(Medvedev);
        addEmployee(Losev);
        addEmployee(Kabanov);
        addEmployee(Seleznev);
        addEmployee(Volkov);
        addEmployee(Fazan);

        printAllEmployees();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц - " + salaryСalculation());
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой - " + minimumWageSearch());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой - " + maximumWageSearch());
        System.out.println();
        System.out.println("Среднее значение зарплат - " + getAverageSalary());
        System.out.println();
        displayFullName();
        System.out.println();
        getSalaryIndexation();
        System.out.println();
        compareSalaries1(60_000);
        System.out.println();
        compareSalaries2(100_000);
        System.out.println();
        System.out.println();
        getDepartmentMinimumWage(5);
        System.out.println();
        getDepartmentMaximumWage(1);
        System.out.println();
        getDepartmentSalaries(5);
        System.out.println();
        getDepartmentAverageSalary(1);
        System.out.println();
        getDataEmployeesDepartment(1);
        System.out.println();
        getIndexationSalariesEmployeesDepartment(1, 7);
    }
}