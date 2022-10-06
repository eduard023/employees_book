public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Петр Сергеевич", 1, 47900, 0);
        employees[1] = new Employee("Сергеев Иван Александрович", 1, 40750, 0);
        employees[2] = new Employee("Никифоров Никита Петрович", 2, 43900, 0);
        employees[3] = new Employee("Дудик Артем Валерьевич", 2, 37500, 0);
        employees[4] = new Employee("Сидоров Григорий Николаевич", 2, 35400, 0);
        employees[5] = new Employee("Лаботовский Игнат Михайлович", 3, 46650, 0);
        employees[6] = new Employee("Михайлов Станислав Иванович", 3, 48700, 0);
        employees[7] = new Employee("Ибрагимов Михаил Вольфович", 4, 35640, 0);
        employees[8] = new Employee("Петров Алексей Алексеевич", 4, 34900, 0);
        employees[9] = new Employee("Якшин Тимур Кириллович", 5, 51000, 0);
        System.out.println("Список всех сотрудников и данных по ним:\n" + Employee.printAllEmployee(employees));
        System.out.println("Сумма затрат на зарплаты за месяц: " + Employee.printSalaryCosts(employees));
        System.out.println("Сотрудник с минимальной заработной платой: " + Employee.searchEmployeeMinSalary(employees));
        System.out.println("Сотрудник с максимальной заработной платой: " + Employee.searchEmployeeMaxSalary(employees));
        System.out.println("Среднее значение зарплат: " + Employee.printAverageSalary(employees));
        System.out.println("Список ФИО всех сотрудников:\n" + Employee.printFullNameAllEmployees(employees));
    }

}