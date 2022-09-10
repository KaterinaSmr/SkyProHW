
public class Main {
    public static void main(String[] args) {
        //base
        EmployeeBook employeeBook = new EmployeeBook();

//        a. Получить список всех сотрудников со всеми имеющимися по ним данными
//        (вывести в консоль значения всех полей (toString)).
        employeeBook.printAllEmployeesInfo();

//        b.Посчитать сумму затрат на зарплаты в месяц.
        System.out.println("Сумма затрат на зарплаты в месяц: " + employeeBook.calcTotalSalaryAMonth());

//        c. Найти сотрудника с минимальной зарплатой.
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.getMinSalaryEmployee());

//        d. Найти сотрудника с максимальной зарплатой.
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.getMaxSalaryEmployee());

//        e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        System.out.println("Средняя зарплата: " + employeeBook.calcAverageSalary());

//        f. Получить Ф. И. О. всех сотрудников (вывести в консоль).
        employeeBook.printEmpNames();

//======= increased complexity =========

//        1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
        employeeBook.raiseSalary(10);
        employeeBook.printAllEmployeesInfo();

//        2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//        a. Сотрудника с минимальной зарплатой.
        int department = 3;
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": "
                + employeeBook.getMinSalaryEmployee(department));

//        b. Сотрудника с максимальной зарплатой.
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": "
                + employeeBook.getMaxSalaryEmployee(department));

//        c. Сумму затрат на зарплату по отделу.
        System.out.println("Сумма затрат на зарплаты в месяц в отделе " + department + ": "
                + employeeBook.calcTotalSalaryAMonth(department));

//        d. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
        System.out.println("Средняя зарплата в отделе " + department + ": "
                + employeeBook.calcAverageSalary(department));

//        e. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
        employeeBook.raiseSalary(10, 3);

//        f. Напечатать всех сотрудников отдела (все данные, кроме отдела).
        employeeBook.printDeptEmployeesInfo(3);

//        3. Получить в качестве параметра число и найти:
//        a. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
        int salary = 20000;
        System.out.println("Сотрудники с зарплатой меньше " + salary + ": ");
        employeeBook.printEmployessSalaryBelow(salary);
//        b. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
        System.out.println("Сотрудники с зарплатой больше или равно " + salary + ": ");
        employeeBook.printEmployeesSalaryAbove(salary);

//======= very complex =========

//        a. Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
//           Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее.
//           Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.
        employeeBook.addEmployee("New Employee Name", 2, 50000);

//        b. Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
        employeeBook.removeEmployee(1);
        employeeBook.removeEmployee("Orlov OO");
        employeeBook.printAllEmployeesInfo();

//        5. Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
//        a. Изменить зарплату.
        employeeBook.getEmployee("New Employee Name").setSalary(100000);
//        b. Изменить отдел.
//        Придумать архитектуру. Сделать или два метода, или один, но продумать его.
        employeeBook.getEmployee("Abakumov AA").setDepartment(1);

//        6. Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
        employeeBook.printEmployeesByDepartments();
    }



}