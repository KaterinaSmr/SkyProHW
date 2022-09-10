import java.util.Objects;

public class Employee{
    private int id;
    private String name;
    private int department;
    private int salary;

    private static int EMPLOYEE_COUNT;

    public Employee(String name, int department, int salary) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Введен некорректный номер отдела");
        }
        this.id = ++EMPLOYEE_COUNT;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    private static int getEmployeeCount() {
        return EMPLOYEE_COUNT;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String printInfo() {
        return id + " | имя:  " + this.name + " | зарплата: " + this.salary;
    }

    @Override
    public String toString() {
        return id + " | имя:  " + this.name + " | отдел:  " + this.department + " | зарплата: " + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && name.equals(employee.name) && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);
    }

}
