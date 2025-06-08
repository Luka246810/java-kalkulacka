package cz.itnetwork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte číslo A: ");
        double a = scanner.nextDouble();

        System.out.print("Zadejte číslo B: ");
        double b = scanner.nextDouble();

        scanner.close();

        System.out.println("Součet: " + add(a, b));
        System.out.println("Rozdíl: " + subtract(a, b));
        System.out.println("Součin: " + multiply(a, b));
        System.out.println("Podíl: " + divide(a, b));
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

     public static double multiply(double a, double b) {
        return a * b;
     }


     public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nelzee dělit nulou");
        }
        return a / b;
     }
}