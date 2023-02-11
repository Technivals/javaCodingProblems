package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T29UnsignedNumsComparator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        System.out.println("Enter the first number");
        try {
            firstNumber = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You enter wrong number");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter the second number");
        try {
            secondNumber = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You enter wrong number");
            System.exit(0);
        }
        switch (Integer.compareUnsigned(firstNumber, secondNumber)) {
            case 1:
                System.out.println("The first number is greater than the second");
                break;
            case -1:
                System.out.println("The second number is greater than the first");
                break;
            case 0:
                System.out.println("The numbers are equals");
                break;
            default:
                System.out.println("Compare error");
        }
    }
}
