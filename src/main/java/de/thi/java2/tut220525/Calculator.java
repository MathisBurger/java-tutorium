package de.thi.java2.tut220525;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int a = scanner.nextInt();
            System.out.print("Enter an integer: ");
            int b = scanner.nextInt();

            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben Sie eine valide Ganzzahl ein.");
        } catch (ArithmeticException e) {
            System.out.println("Division durch 0 ist nicht erlaubt");
        }
    }
}
