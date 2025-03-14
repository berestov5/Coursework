import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private int department;
    private static int counter;
    private int id;

    public Employee(String name, double salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        counter++;
        this.id = counter;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && id == employee.id && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department, id);
    }

    @Override
    public String toString() {
        return "Сотрудники:" +
                " Имя - " + name +
                ", отдел - " + department +
                ", зарплата - " + salary +
                ", id - " + id;
    }

    public String toString(Employee el) {
        return "Сотрудники:" +
                " Имя - " + name +
                ", зарплата - " + salary +
                ", id - " + id;
    }

}


