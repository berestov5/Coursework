public class Main {
    public static void main(String[] args) {
        EmployeeBook obj = new EmployeeBook();
        obj.fillArray();

        obj.printEmployeeData();
        System.out.println("Сумма затрат на ЗП в месяц: " + obj.salaryMonth());
        System.out.println("Сотрудник с минимальной зараплатой: " + obj.salaryMin());
        System.out.println("Сотрудник с максимальной зараплатой: " + obj.salaryMax());
        System.out.printf("Среднее значение зарплат: %.2f %n", obj.averageSalary());
        System.out.println("Список ФИО всех сотрудников");
        obj.printEmployeeFIO();

        obj.indexingSalary(10);

        System.out.println("Сотрудник с минимальной зараплатой: " + obj.salaryMinDepartment(1));
        System.out.println("Сотрудник с максимальной зараплатой: " + obj.salaryMaxDepartment(1));
        System.out.printf("Сумма затрат на ЗП по отделу: %.2f %n", obj.salaryMonthDepartment(1));
        System.out.printf("Средняя зп по отделу: %.2f %n", obj.averageSalaryDepartment(1));
        obj.indexingSalaryDepartment(10, 1);

        System.out.println("Печатаем всех сотрудников отдела:");
        obj.printEmployeeDataDepartment(1);

        System.out.println("Печать сотрудников, с зарплатой меньше числа:");
        obj.lessThanControlNumber(149);
        System.out.println("Печать сотрудников, с зарплатой больше числа:");
        obj.greaterThanControlNumber(149);

        obj.addEmployee(obj.employee9);
        System.out.println("Проверка добавления сотрудника в массив");
        obj.printEmployeeData();
        obj.removeEmployee(8);
        System.out.println("Проверка удаления сотрудника из массива по id");
        obj.printEmployeeData();
        System.out.println("Находим сотрудника по id:");
        System.out.println(obj.findEmployeeById(5));
    }
}
