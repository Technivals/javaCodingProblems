package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T25MinAndMaxValueFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        System.out.println("Enter the value of the first number. You can enter decimal number");
        try {
            firstNumber = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("You enter not a number");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter the value of the second number. You can enter decimal number");
        try {
            secondNumber = sc.nextDouble();
        } catch (Exception e){
            System.out.println("You enter not a number");
            System.exit(0);
        }
        System.out.println("The maximum value of the numbers is " + Math.max(firstNumber, secondNumber));
        System.out.println("The minimum value of the numbers is " + Math.min(firstNumber, secondNumber));
    }
}
