package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T38FusedMultiplyAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        double thirdNumber = 0;
        double sum = 0;
        System.out.print("Enter numbers with floating point for next example - (a * b) + c" + "\n" + "Enter a: ");
        try {
            firstNumber = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter b: ");
            secondNumber = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter c: ");
            thirdNumber = sc.nextDouble();
            sum = Math.fma(firstNumber, secondNumber, thirdNumber);
            System.out.println("\n" + "Result of example is " + sum);
        } catch (Exception e){
            System.out.println("You enter wrong numbers");
        }
    }
}
