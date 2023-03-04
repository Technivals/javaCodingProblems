package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T34LongToIntConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = 0;
        int convertNumber = 0;
        System.out.println("Enter a number of long type which you want to convert to int type");
        try {
            number = sc.nextLong();
            convertNumber = Math.toIntExact(number);
            System.out.println("Conversion is successful");
        } catch (Exception e) {
            System.out.println("Conversion error");
        }
    }
}
