package org.example;

import java.util.Scanner;

public class ShowGreetings {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter you name: ");
        String name = scanner.nextLine();

        System.out.println("Hello : " + name);
    }
}
