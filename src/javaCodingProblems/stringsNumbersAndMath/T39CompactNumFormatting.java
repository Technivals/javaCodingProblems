package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T39CompactNumFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = 0;
        long thousand = 1000;
        long million = 1000000;
        long billion = 1000000000;
        System.out.println("Enter whole positive number which you want to formatting");
        String input = sc.nextLine();
        try {
            number = Long.parseLong(input);
            if (number < thousand) {
                System.out.println("You enter too small number");
            } else if (number < million) {
                int amount = (int) (number / thousand);
                System.out.println("Your formatted number is " + amount + "K");
            } else if (number < billion) {
                int amount = (int) (number / million);
                System.out.println("Your formatted number is " + amount + "M");
            } else if (number >= billion) {
                int amount = (int) (number / billion);
                System.out.println("Your formatted number is " + amount + "B");
            }
        } catch (Exception e) {
            System.out.println("Formatting error");
        }
    }
}
