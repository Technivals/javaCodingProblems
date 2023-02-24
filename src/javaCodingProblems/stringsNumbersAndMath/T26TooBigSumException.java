package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T26TooBigSumException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstNumber = 0;
        long secondNumber = 0;
        long sum = 0;
        System.out.println("Enter the value of the first whole number");
        try {
            firstNumber = sc.nextLong();
        } catch (Exception e) {
            System.out.println("You entered not a number");
            System.exit(0);
        }
        System.out.println("Enter the value of the second whole number");
        try {
            secondNumber = sc.nextLong();
        } catch (Exception e) {
            System.out.println("You entered not a number");
            System.exit(0);
        }
        sum = firstNumber + secondNumber;
        if (firstNumber > 0 && secondNumber > 0 && sum < 0) {
            throw new ArithmeticException("Sum of your values is too big or too small");
        } else if (firstNumber < 0 || secondNumber < 0 && sum > 0) {
            throw new ArithmeticException("Sum of your values is too big or too small");
        } else if (firstNumber < 0 && secondNumber < 0 && sum < 0) {
            throw new ArithmeticException("Sum of your values is too big or too small");
        } else {
            System.out.println("Sum of your values is " + sum);
        }
    }
}
