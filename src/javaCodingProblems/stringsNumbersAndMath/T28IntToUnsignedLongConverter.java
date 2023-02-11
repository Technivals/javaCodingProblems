package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T28IntToUnsignedLongConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long convertedNumber = 0;
        System.out.println("Enter the number with which you want to work");
        try {
            convertedNumber = Integer.toUnsignedLong(sc.nextInt());
            System.out.println("The conversion was successful");
        } catch (Exception e){
            System.out.println("Conversion error");
        }
    }
}
