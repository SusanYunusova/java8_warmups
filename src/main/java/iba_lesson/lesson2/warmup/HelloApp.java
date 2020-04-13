package iba_lesson.lesson2.warmup;

import java.util.Scanner;

public class HelloApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hELLO,WHATS YOUR NAME?\nname:");
        String name = scanner.nextLine();
        System.out.printf("Hello %s\nNice to meet you %s\nbye",name,name);

    }
}
