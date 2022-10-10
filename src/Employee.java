public class Employee {
    private String fullName;
    private int unit;
    private int salary;
    private int id;
    private static int counter = 0;
    public Employee(String fullName, int unit, int salary, int id) {
        this.fullName = fullName;
        this.unit = unit;
        this.salary = salary;
        this.id = counter++;

    }

    //Getters
    public String getFullName() {
        return this.fullName;
    }

    public int getUnit() {
        return this.unit;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    //Setters
    public void setUnit(int unit) {
        this.unit = unit;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return fullName + ", " + unit + " отдел. " + "Заработная плата: " + salary + " рублей. Id - " + id;
    }
    //вывод всех сотрудников
    public static String printAllEmployee(Employee[] employees){
        String fullInfo = "";
        for (Employee employee: employees) {
            fullInfo += employee.toString() + System.lineSeparator();
        }
        return fullInfo;
    }
    // Сумма затрат на зарплаты за месяц
    public static String printSalaryCosts(Employee[] employees){
        int sum = 0;
        for (Employee salary: employees) {
                sum += salary.salary;
        }
        return sum + " рублей.";
    }
    // Среднее значение зарплат
    public static String printAverageSalary(Employee[] employees){
        int sum = 0;
        int counter = 0;
        for (Employee salary: employees) {
            sum += salary.salary;
            counter++;
        }
        return sum / counter + " рублей.";
    }
    // Поиск сотрудника с минимальной зарплатой
    public static String searchEmployeeMinSalary(Employee[] employees){
        int min = employees[0].salary;
        String fio = employees[0].toString();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary < min){
                min = employees[i].salary;
                fio = employees[i].toString();
            }
        }
        return fio;
    }

    //Поиск сотрудника с максимальной зарплатой
    public static String searchEmployeeMaxSalary(Employee[] employees){
        int max = employees[0].salary;
        String fio = employees[0].toString();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > max){
                max = employees[i].salary;
                fio = employees[i].toString();
            }
        }
        return fio;
    }
    //Вывод ФИО всех сотрудников
    public static void printFullNameAllEmployees(Employee[] employees) {
        for (Employee fullName : employees) {
            System.out.println(fullName.fullName);
        }
    }
}