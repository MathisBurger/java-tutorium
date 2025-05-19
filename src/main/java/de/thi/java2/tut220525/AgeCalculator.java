package de.thi.java2.tut220525;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int myAge = scanner.nextInt();
        System.out.print("Enter your partners page: ");
        int otherAge = scanner.nextInt();

        try {
            AgeCalculator.validateAge(myAge, otherAge);
        } catch (TooOldException e) {
            System.out.println("Your partner is too old!");
        } catch (TooYoungException e) {
            System.out.println("Your partner is too young!");
        }
    }

    public static void validateAge(int myAge, int partnerAge) {
        int minAllowedAge = (myAge / 2) +7;
        int maxAllowedAge = (myAge +7) * 2;

        if (partnerAge > maxAllowedAge) {
            throw new TooOldException("Ihr Partner ist zu alt");
        }

        if (partnerAge < minAllowedAge) {
            throw new TooYoungException("Ihr Partner ist zu jung");
        }
    }
}
