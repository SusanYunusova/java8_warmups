package iba_lesson.lesson2.task;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraySortApp_v2 {
    public static void main(String[] args) {
        Stream.generate(() -> (int) (Math.random() * 200) - 100).limit(20)
                .collect(Collectors.groupingBy(n -> n > 0 ? n % 2 == 0 ? "PE" : "PO" : n % 2 == 0 ? "NE" : "NO"))
                .forEach((k, v) -> System.out.printf("%s:%s\n", k, v));
    }
}
