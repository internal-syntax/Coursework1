package Coursework1;

public class EmployeeBook {
    private static final Integer EMPLOYEES_SIZE = 10;
    private static final Integer DEPARTMENT_COUNT = 5;

    private final Employee[] employees = new Employee[EMPLOYEES_SIZE];

    public void addEmployee(String fullName, int department, int salary) {
        int index = getFreeArrayCell();
        if (index == -1) {
            System.out.println("Нет места для добавления нового сотрудника");
        } else {
            employees[index] = new Employee(fullName, department, salary);
        }
    }

    private int getFreeArrayCell() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void deleteEmployee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName() == fullName) {
                employees[i] = null;
            }
        }
    }

    public void getSalaryChange(String fullName, int salary) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
            }
        }
    }

    public void getDepartmentChange(String fullName, int department) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setDepartment(department);
            }
        }
    }

    public void sealDepartmentEmployees() {
        for (int i = 1; i <= DEPARTMENT_COUNT; i++) {
            System.out.println("Отдел " + i + ":");
            for (Employee employee : employees) {
                if (employee.getDepartment() == i) {
                    System.out.println(employee.getFullName());
                }
            }
        }
    }

    public void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }

    public int salaryСalculation() {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        return salarySum;
    }

    public int maximumWageSearch() {
        int maximumSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maximumSalary) {
                maximumSalary = employees[i].getSalary();
            }
        }
        return maximumSalary;
    }

    public int minimumWageSearch() {
        int minimumSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minimumSalary) {
                minimumSalary = employees[i].getSalary();
            }
        }
        return minimumSalary;
    }

    public double getAverageSalary() {
        return (double) salaryСalculation() / employees.length;
    }

    public void getSalaryIndexation() {
        for (int i = 0; i < employees.length; i++) {
            double a = (employees[i].getSalary() * 0.07) + employees[i].getSalary();
            System.out.println("Зарплата сотрудника " + employees[i].getFullName() + " до индексации составляла - " + employees[i].getSalary() + ", после индексации на 7% и составляет - " + a);
        }
    }

    public void getDepartmentMinimumWage(int department) {
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

    public void getDepartmentMaximumWage(int department) {
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

    public int getDepartmentSalaries(int department) {
        int sumSalaryDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sumSalaryDepartment += employee.getSalary();
            }
        }
        System.out.println("Сумма зарплат сотрудников отдела №" + department + ": " + sumSalaryDepartment);
        return sumSalaryDepartment;
    }

    public int getDepartmentAverageSalary(int department) {
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

    public int getIndexationSalariesEmployeesDepartment(int department, int indexation) {
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

    public void getDataEmployeesDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("Сотрудник" + ": ФИО - " + employee.getFullName() + ", id - " + employee.getId() + ", зарплата - " + employee.getSalary());
            }
        }
    }


    public int compareSalaries1() {
        int a = 60_000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < a) {
                System.out.println("id - " + employees[i].getId() + ", ФИО - " + employees[i].getFullName() + ", зарплата - " + employees[i].getSalary());
            }
        }
        return a;
    }

    public int compareSalaries2() {
        int b = 100_000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= b) {
                System.out.println("id - " + employees[i].getId() + ", ФИО - " + employees[i].getFullName() + ", зарплата - " + employees[i].getSalary());
            }
        }
        return b;
    }

    public void displayFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО сотрудника: " + employees[i].getFullName());
        }
    }
}

