package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T30DivWithRemainUnsignedNums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisible = 0;
        int divisor = 0;
        int result = 0;
        int remainder = 0;
        System.out.println("Enter the divisible number");
        try {
            divisible = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You enter wrong number");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter the divisor number");
        try {
            divisor = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You enter wrong number");
        }
        try {
            result = Integer.divideUnsigned(divisible, divisor);
            remainder = Integer.remainderUnsigned(divisible, divisor);
        } catch (Exception e) {
            System.out.println("Calculation error");
            System.exit(0);
        }
        System.out.print("Result of division is " + result + "\n" + "Remainder of division is " + remainder + "\n");
    }
}
