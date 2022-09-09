import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public final class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(){
        employees = new Employee[10];
        employees[0] = new Employee("Ivanov II", 1, 10_000);
        employees[1] = new Employee("Petrova PP", 3, 20_000);
        employees[2] = new Employee("Sokolov SS", 5, 15_000);
        employees[3] = new Employee("Orlov OO", 5, 25_000);
        employees[4] = new Employee("Zvereva ZZ", 3, 17_000);
        employees[5] = new Employee("Abakumov AA", 3, 12_000);
    }

    public void printAllEmployeesInfo(){
        for (Employee employee : employees) {
            if (employee != null)
                System.out.println(employee);
        }
    }

    public int calcTotalSalaryAMonth(){
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null)
                sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        return sum;
    }

    public Employee getMinSalaryEmployee(){
        Employee result = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (result == null || employees[i] != null && employees[i].getSalary() < result.getSalary())
                result = employees[i];
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + result);
        return result;
    }
    public Employee getMaxSalaryEmployee(){
        Employee result = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (result == null || employees[i] != null && employees[i].getSalary() > result.getSalary())
                result = employees[i];
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + result);
        return result;
    }
    public double calcAverageSalary(){
        double avg = (double) calcTotalSalaryAMonth() / countEmployees();
        System.out.println("Средняя зарплата: " + avg);
        return  avg;
    }

    private int countEmployees(){
        return (int) Arrays.stream(employees).filter(Objects::nonNull).count();
    }

    public void printEmpNames(){
        for (Employee employee : employees) {
            if (employee != null)
                System.out.println(employee.getName());
        }
    }

    //increased comlexity

    public void raiseSalary(int increaseRate){
        Arrays.stream(employees).filter(Objects::nonNull)
                .forEach(e -> e.setSalary((int) (e.getSalary() * ((float)increaseRate/100 + 1.0f))));
    }

    public void raiseSalary(int increaseRate, int department){
        Arrays.stream(employees).filter(e -> e != null && e.getDepartment() == department)
                .forEach(e -> e.setSalary((int) (e.getSalary() * ((float)increaseRate/100 + 1.0f))));
    }

    public Employee getMinSalaryEmployee(int department) {
        Employee result = Arrays.stream(employees).filter(e -> e != null && e.getDepartment() == department)
                .min(Comparator.comparingInt(Employee::getSalary)).orElse(null);
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + result);
        return result;
    }

    public Employee getMaxSalaryEmployee(int department) {
        Employee result = Arrays.stream(employees).filter(e -> e != null && e.getDepartment() == department)
                .max(Comparator.comparingInt(Employee::getSalary)).orElse(null);
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + result);
        return result;
    }

    public int calcTotalSalaryAMonth(int department){
        int sum = Arrays.stream(employees).filter(e -> e != null && e.getDepartment() == department)
                .mapToInt(Employee::getSalary).sum();
        System.out.println("Сумма затрат на зарплаты в месяц в отделе " + department + ": " + sum);
        return sum;
    }

    public double calcAverageSalary(int department){
        int count = countEmployees(department);
        if (count != 0){
            double avg = (double) calcTotalSalaryAMonth(department)/count;
            System.out.println("Средняя зарплата в отделе " + department + ": " + avg);
            return avg;
        } else {
            System.out.println("Нет сотрудников в отделе " + department);
        }
        return 0;
    }

    private int countEmployees(int department){
        return (int) Arrays.stream(employees).filter(e -> e!=null && e.getDepartment() == department).count();
    }

    public void printDeptEmployeesInfo(int department){
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department)
                System.out.println(employee.printInfo());
        }
    }

    public void getEmployessSalaryBelow(int salary){
        Arrays.stream(employees).filter(e -> e!=null && e.getSalary() < salary)
                .forEach(e-> System.out.println(e.printInfo()));
    }

    public void getEmployeesSalaryAbove(int salary){
        Arrays.stream(employees).filter(e -> e!=null && e.getSalary() >= salary)
                .forEach(e-> System.out.println(e.printInfo()));
    }

    //very complex

    public void addEmployee(String name, int department, int salary){
        boolean isAdded =false;
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = new Employee(name, department, salary);
                isAdded = true;
                break;
            }
        }
        if (! isAdded){
            System.out.println("переполнение списка, сотрудник не был добавлен");
        }
    }

    public void removeEmployee(int id){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] !=null && employees[i].getId() == id)
                employees[i] = null;
        }
    }

    public void removeEmployee(String name){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] !=null && employees[i].getName().equals(name))
                employees[i] = null;
        }
    }

    public Employee getEmployee(String name){
        return Arrays.stream(employees).filter(e -> e != null && e.getName().equals(name)).findAny().orElse(null);
    }

    public void printEmployeesByDepartments(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Список сотрудников отдела " + i + ": ");
            final int j = i;
            Arrays.stream(employees).filter(e -> e!= null && e.getDepartment() == j)
                    .forEach(e-> System.out.println(e.printInfo()));
        }
    }
}
