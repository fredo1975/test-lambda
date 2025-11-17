package fr.lambda.ex1;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
}
