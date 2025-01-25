package fr.lambda;

import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        StreamDemo streamDemo = new StreamDemo();
        List<String> list = List.of("azerty", "querty");
        list.stream().peek(System.out::println).map(String::toUpperCase).forEach(System.out::println);
    }
}
