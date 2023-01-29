package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class onlyNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String [] words = sc.nextLine().split(" ");
        for(String item : words) {
            if (!item.matches("^[0-9]+$")) {
                System.out.println("Line has not only numbers");
                System.exit(0);
            }
        }
        System.out.println("Line has only numbers");
    }
}
