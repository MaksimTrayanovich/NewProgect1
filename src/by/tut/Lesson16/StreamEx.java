package by.tut.Lesson16;

import by.tut.Lesson14.MyBestInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        MyBestInterface intStr = str -> str.substring(0, 2);
        intStr.test("abc");

        List<Integer> testValues = Arrays.asList(1, 2, 5, 3);
        Map<Integer, Long> result = testValues.stream().
                collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
        System.out.println(result);

        List<User> users = Arrays.asList(new User(20, "Maks"),
                new User(20, "Kirill"),
                new User(22, "Pasha"),
                new User(30, "Ada"));

        Map<Integer, List<User>> usersByAge = users.stream()
                .collect(Collectors.groupingBy(User::getAge));// user -> user.getAge
        System.out.println(usersByAge);

        var employee = Arrays.asList(new Employee("Worker", 200),
                new Employee("Worker", 250),
                new Employee("Worker", 500),
                new Employee("Worker", 1200),
                new Employee("Manager", 1200),
                new Employee("Manager", 700),
                new Employee("Manager", 200));

        var averageSalary = employee.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();

        System.out.println(averageSalary);

        var employeesByCategory = employee.stream()
                .collect(Collectors.groupingBy(Employee::getCategory));

        System.out.println(employeesByCategory);

        var salaryByCategory = employee.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.averagingDouble(Employee::getSalary)));

        var minSalaryByCategory = employee.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.minBy(Comparator
                                .comparingDouble(Employee::getSalary))));
        System.out.println(minSalaryByCategory);

        System.out.println(salaryByCategory);

        Map<Employee, String> tests = employee.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        Employee::getCategory));
        System.out.println(tests);
    }
}
