/*
 *  _____ _______         _                      _
 * |_   _|__   __|       | |                    | |
 *   | |    | |_ __   ___| |___      _____  _ __| | __  ___ ____
 *   | |    | | '_ \ / _ \ __\ \ /\ / / _ \| '__| |/ / / __|_  /
 *  _| |_   | | | | |  __/ |_ \ V  V / (_) | |  |   < | (__ / /
 * |_____|  |_|_| |_|\___|\__| \_/\_/ \___/|_|  |_|\_(_)___/___|
 *                   ___
 *                  |  _|___ ___ ___
 *                  |  _|  _| -_| -_|  LICENCE
 *                  |_| |_| |___|___|
 *
 * IT ZPRAVODAJSTVÍ  <>  PROGRAMOVÁNÍ  <>  HW A SW  <>  KOMUNITA
 *
 * Tento zdrojový kód pochází z IT sociální sítě WWW.ITNETWORK.CZ
 *
 * Můžete ho upravovat a používat jak chcete, musíte však zmínit
 * odkaz na http://www.itnetwork.cz
 */

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
        // System.out.println("Součin: " + multiply(a, b));
        // System.out.println("Podíl: " + divide(a, b));
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    // TODO: Implementujte funkci násobení
    // public static double multiply(double a, double b) {
    //     return a * b;
    // }

    // TODO: Implementujte funkci dělení
    // public static double divide(double a, double b) {
    //     if (b == 0) {
    //         throw new IllegalArgumentException("Nelze dělit nulou");
    //     }
    //     return a / b;
    // }
}
