package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T27ToUnsignedNumConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = 0;
        System.out.println("Enter the number with which you want to work");
        String s = sc.nextLine();
        System.out.println("Enter number system in which you want to convert your number(from 2 to 36)");
        int numberSystem = sc.nextInt();
        try {
            number = Long.parseUnsignedLong(s, numberSystem);
            System.out.println("Your converted number is " + number);
        } catch (Exception e){
            System.out.println("Conversion error");
        }
    }
}
