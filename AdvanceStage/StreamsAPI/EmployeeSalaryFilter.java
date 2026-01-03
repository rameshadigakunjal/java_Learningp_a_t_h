package AdvanceStage.StreamsAPI;

import java.util.List;
import java.util.*;
class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class EmployeeSalaryFilter {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
            new Employee(1, "Alice", 60000),
            new Employee(2, "Bob", 45000),
            new Employee(3, "Charlie", 70000),
            new Employee(4, "David", 30000)
        );
        employee.stream()
                .filter(e-> e.salary>50000)
                .forEach(e -> System.out.println(e.name));
    }
}
