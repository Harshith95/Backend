package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestPaidEmployee {
    // ✅ Inner static class Employee
    static class Employee {
        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
        }

        public static void main(String[] args) {
            // ✅ Create a list of employees and load some sample data
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(101, "Alice", 50000));
            employees.add(new Employee(102, "Bob", 60000));
            employees.add(new Employee(103, "Charlie", 55000));
            employees.add(new Employee(104, "Diana", 70000));
            employees.add(new Employee(105, "Eve", 65000));

            // ✅ Print employees
//            employees.forEach(System.out::println);
            Optional<Employee> opt = employees.stream().
                    sorted((a,b)-> (int) (b.getSalary() - a.getSalary())).
                    skip(1).findFirst();
            opt.ifPresent(System.out::println);
        }

    }
}
