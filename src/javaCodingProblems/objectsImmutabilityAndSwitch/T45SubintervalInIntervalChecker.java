package javaCodingProblems.objectsImmutabilityAndSwitch;

import java.util.Scanner;

public class T45SubintervalInIntervalChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] interval = new int [21];
        int firstIndex = 0;
        int lastIndex = 0;
        System.out.println("Enter the first index of your subinterval");
        try {
            firstIndex = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the last index of your subinterval");
            lastIndex = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You enter not a number");
            System.exit(0);
        }
        if (lastIndex >= firstIndex) {
            if (firstIndex < 0 || firstIndex > interval.length - 1 || lastIndex > interval.length - 1) {
                throw new IndexOutOfBoundsException("Your subinterval is not in the interval");
            } else {
                System.out.println("Your subinterval is in the interval");
            }
        } else {
            System.out.println("Your last index is bigger than last index");
        }
    }
}
