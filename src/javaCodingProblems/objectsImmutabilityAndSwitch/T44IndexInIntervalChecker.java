package javaCodingProblems.objectsImmutabilityAndSwitch;

import java.util.Scanner;

public class T44IndexInIntervalChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] interval = new int [10];
        int index = 0;
        System.out.println("Enter the index whose presence you want to check on the interval");
        try {
            index = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You enter not a number");
            System.exit(0);
        }
        if (index > interval.length - 1) {
            throw new IndexOutOfBoundsException("Your index is not in the interval");
        } else {
            System.out.println("Your index is in the interval");
        }
    }
}
