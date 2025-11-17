package fr.lambda.ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercice1 {
    public static void main(String[] args){
        Exercice1 ex = new Exercice1();
        Employee emp1 = new Employee("John Doe", 25);
        Employee emp2 = new Employee("Jane Res", 52);
        Employee emp3 = new Employee("Rufus Lowe", 18);
        List<Employee> l = List.of(emp1, emp2,emp3);
        //Given a list of employees, you need to filter all the employee whose age is greater than 20 and print the employee names.(Java 8 APIs only)
        List<String> res = l.stream().filter(e -> e.getAge() > 20).map(e->e.getName()).toList();
        res.forEach(System.out::println);

        //Given the list of employees, count number of employees with age 25?
        long count = l.stream().filter(e->e.getAge() == 25).count();
        System.out.println("Number of employees with age 25: "+count);

        //Given a list of employee, find maximum age of employee
        int max = l.stream().max((e1,e2) -> Integer.compare(e1.getAge(), e2.getAge())).get().getAge();
        System.out.println("Maximum age of employee: "+max);

        //Given a list of employees, sort all the employee on the basis of age
        List sorted = l.stream().sorted((c1,c2)-> Integer.compare(c1.getAge(), c2.getAge())).toList();
        System.out.println("Employees sorted by age: ");
        sorted.forEach(System.out::println);

        //Join the all employee names with “,”
        String joinedNames = l.stream().map(e->e.getName()).reduce((a,b) -> a+","+b).get();
        System.out.println("Joined employee names: "+joinedNames);

        //Given the list of employee, group them by employee name
        var groupedByName = l.stream().collect(java.util.stream.Collectors.groupingBy(Employee::getName));
        System.out.println("Employees grouped by name: "+groupedByName);

        //Given the list of numbers, remove the duplicate elements from the list.
        List<Integer> numbers = List.of(1,2,3,2,4,5,1,6,3);
        Set<Integer> noDuplicates = new HashSet<>(numbers);
        System.out.println("List of numbers without duplicates: "+noDuplicates);

        //Given a list of numbers, square them and filter the numbers which are greater 10000 and then find average of them
        List<Integer> nums = List.of(50, 100, 150, 200, 300);
        Double average = nums.stream().mapToInt(value -> value*value).filter(v->v>10000).average().getAsDouble();
        System.out.println("Average of squared numbers greater than 10000: "+average);
    }
}
