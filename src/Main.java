public class Main {
    public static void main(String[] args) {
        EmployeeBook obj = new EmployeeBook();
        obj.fillArray(); // заполняем массив

        obj.printEmployeeData(); // 8a печатаем список всех сотрудников
        System.out.println("Сумма затрат на ЗП в месяц: " + obj.salaryMonth()); // 8b
        System.out.println("Сотрудник с минимальной зараплатой: " + obj.salaryMin()); // 8c
        System.out.println("Сотрудник с максимальной зараплатой: " + obj.salaryMax()); // 8d
        System.out.printf("Среднее значение зарплат: %.2f %n", obj.averageSalary()); // 8e
        System.out.println("Список ФИО всех сотрудников");
        obj.printEmployeeFIO(); // 8f

        obj.indexingSalary(10); // 1. индексируем зарплату всем сотрудникам

        System.out.println("Сотрудник с минимальной зараплатой: " + obj.salaryMinDepartment(1)); // 2a
        System.out.println("Сотрудник с максимальной зараплатой: " + obj.salaryMaxDepartment(1)); // 2b
        System.out.printf("Сумма затрат на ЗП по отделу: %.2f %n", obj.salaryMonthDepartment(1)); // 2c
        System.out.printf("Средняя зп по отделу: %.2f %n", obj.averageSalaryDepartment(1)); // 2d
        obj.indexingSalaryDepartment(10, 1); // 2e индексируем зарплату отделу

        System.out.println("Печатаем всех сотрудников отдела:");
        obj.printEmployeeDataDepartment(1); // 2f

        System.out.println("Печать сотрудников, с зарплатой меньше числа:");
        obj.lessThanControlNumber(149); // 3a
        System.out.println("Печать сотрудников, с зарплатой больше числа:");
        obj.greaterThanControlNumber(149); // 3b

        obj.addEmployee(obj.employee9); // 4a добавляем сотрудника
        System.out.println("Проверка добавления сотрудника в массив");
        obj.printEmployeeData();
        obj.removeEmployee(8); // 4b удаляем сотрудника по id
        System.out.println("Проверка удаления сотрудника из массива по id");
        obj.printEmployeeData();
        System.out.println("Находим сотрудника по id:");
        System.out.println(obj.findEmployeeById(5)); // 5
    }
}
