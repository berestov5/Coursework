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
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public double salaryMonth() {
        double salarySum = 0;
        for (Employee employee : employeeArray) {
            if (employee != null) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public String salaryMin() {
        double min = employeeArray[0].getSalary();
        String name = "";
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getName();
            }
        }
        return name;
    }

    public String salaryMax() {
        double max = employeeArray[0].getSalary();
        String name = "";
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getName();
            }
        }
        return name;
    }

    public double averageSalary() {
        double sumSalary = salaryMonth();
        int namberEmployees = 0;
        for (Employee employee : employeeArray) {
            if (employee != null) {
                namberEmployees++;
            }
        }
        return sumSalary / namberEmployees;
    }

    public void printEmployeeFIO(){
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public void indexingSalary(double percent) {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * percent / 100 + employee.getSalary());
            }
        }
    }

    public String salaryMinDepartment(int department) {
        double min = 0;
        String name = "";
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getName();
            }
        }
        return name;
    }

    public String salaryMaxDepartment(int department) {
        double max = 0;
        String name = "";
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getName();
            }
        }
        return name;
    }

    public double salaryMonthDepartment(int department) {
        double salarySum = 0;
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getDepartment() == department) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public double averageSalaryDepartment(int department) {
        double sumSalary = salaryMonthDepartment(department);
        int namberEmployees = 0;
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getDepartment() == department) {
                namberEmployees++;
            }
        }
        return sumSalary / namberEmployees;
    }

    public void indexingSalaryDepartment(double percent, int department) {
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * percent / 100 + employee.getSalary());
            }
        }
    }

    public void printEmployeeDataDepartment(int department) {
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.toString(employee));
            }
        }
    }

    public void lessThanControlNumber(int number) {
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee);
            }
        }
    }

    public void greaterThanControlNumber(int number) {
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println(employee);
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
        for (Employee employee : employeeArray) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
