package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T36NextNumberWithFloatPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doubleNumber = 0;
        double nextNumber = 0;
        double previousNumber = 0;
        System.out.println("Enter a number with floating point to find out it's next value");
        try {
            doubleNumber = sc.nextDouble();
            nextNumber = Math.nextAfter(doubleNumber, Double.POSITIVE_INFINITY);
            previousNumber = Math.nextAfter(doubleNumber, Double.NEGATIVE_INFINITY);
            System.out.print("Next value of your number in positive infinity is " + nextNumber + "\n" +
                    "Next value of your number in negative infinity is " + previousNumber);
        } catch (Exception e){
            System.out.println("You enter wrong number");
        }
    }
}
