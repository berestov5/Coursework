public class EmployeeBook {

    private Employee[] employeeArray = new Employee[10];

    Employee employee1 = new Employee("Иванов Петр Иваныч", 120.25, 1);
    Employee employee2 = new Employee("Петров Иван Петрович", 135.00, 2);
    Employee employee3 = new Employee("Сидоров Саид Сидорович", 110.50, 1);
    Employee employee4 = new Employee("Мертвяков Голова Отрубович", 105.00, 3);
    Employee employee5 = new Employee("Нецветайлова Анастасия Карловна", 150.00, 1);
    Employee employee6 = new Employee("Побегайло Далек Забугорович", 140.00, 1);
    Employee employee7 = new Employee("Инфалтилин Невсега Смеянович", 138.50, 1);
    Employee employee8 = new Employee("Бугаев Батыр Здоровякович", 135.00, 4);
    Employee employee9 = new Employee("Алексеев Андрей Анатольевич", 165.00, 5);

    public void fillArray() {
        employeeArray[0] = employee1;
        employeeArray[1] = employee2;
        employeeArray[2] = employee3;
        employeeArray[3] = employee4;
        employeeArray[4] = employee5;
        employeeArray[5] = employee6;
        employeeArray[6] = employee7;
        employeeArray[7] = employee8;
    }

    public void printEmployeeData() {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                System.out.println(employeeArray[i]);
            }
        }
    }
    public double salaryMonth() {
        double salarySum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                salarySum += employeeArray[i].getSalary();
            }
        }
        return salarySum;
    }

    public String salaryMin() {
        double min = Double.MAX_VALUE;
        String name = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getSalary() < min) {
                min = employeeArray[i].getSalary();
                name = employeeArray[i].getName();
            }
        }
        return name;
    }

    public String salaryMax() {
        double max = Double.MIN_VALUE;
        String name = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getSalary() > max) {
                max = employeeArray[i].getSalary();
                name = employeeArray[i].getName();
            }
        }
        return name;
    }

    public double averageSalary() {
        double sumSalary = salaryMonth();
        int namberEmployees = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                namberEmployees++;
            }
        }
        return sumSalary / namberEmployees;
    }

    public void printEmployeeFIO(){
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                System.out.println(employeeArray[i].getName());
            }
        }
    }

    public void indexingSalary(double percent) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                employeeArray[i].setSalary(employeeArray[i].getSalary() * percent / 100 + employeeArray[i].getSalary());
            }
        }
    }

    public String salaryMinDepartment(int department) {
        double min = Double.MAX_VALUE;
        String name = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartment() == department && employeeArray[i].getSalary() < min) {
                min = employeeArray[i].getSalary();
                name = employeeArray[i].getName();
            }
        }
        return name;
    }

    public String salaryMaxDepartment(int department) {
        double max = Double.MIN_VALUE;
        String name = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartment() == department && employeeArray[i].getSalary() > max) {
                max = employeeArray[i].getSalary();
                name = employeeArray[i].getName();
            }
        }
        return name;
    }

    public double salaryMonthDepartment(int department) {
        double salarySum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartment() == department) {
                salarySum += employeeArray[i].getSalary();
            }
        }
        return salarySum;
    }

    public double averageSalaryDepartment(int department) {
        double sumSalary = salaryMonthDepartment(department);
        int namberEmployees = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartment() == department) {
                namberEmployees++;
            }
        }
        return sumSalary / namberEmployees;
    }

    public void indexingSalaryDepartment(double percent, int department) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartment() == department) {
                employeeArray[i].setSalary(employeeArray[i].getSalary() * percent / 100 + employeeArray[i].getSalary());
            }
        }
    }

    public void printEmployeeDataDepartment(int department) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartment() == department) {
                System.out.println(employeeArray[i]);
            }
        }
    }

    public void lessThanControlNumber(int number) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getSalary() < number) {
                System.out.println(employeeArray[i]);
            }
        }
    }

    public void greaterThanControlNumber(int number) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getSalary() >= number) {
                System.out.println(employeeArray[i]);
            }
        }
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] == null) {
                employeeArray[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getId() == id) {
                employeeArray[i] = null;
            }
        }
    }

    public Employee findEmployeeById(int id){
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getId() == id) {
                return employeeArray[i];
            }
        }
        return null;
    }
}
