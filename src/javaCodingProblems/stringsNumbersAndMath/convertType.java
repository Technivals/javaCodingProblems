package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class convertType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number which you want to convert");
        String number = sc.nextLine();
        try {
            int intType = Integer.parseInt(number);
            System.out.println("Your number type is integer");
            System.exit(0);
        } catch (Exception ignored){}
        try {
            long longType = Long.parseLong(number);
            System.out.println("Your number type is long");
            System.exit(0);
        } catch (Exception ignored){}
        try {
            float floatType = Float.parseFloat(number);
            if(!Float.isInfinite(floatType)) {
                System.out.println("Your number type is float");
                System.exit(0);
            }
        } catch (Exception ignored){}
        try {
            double doubleType = Double.parseDouble(number);
            System.out.println("Your number type is double");
            System.exit(0);
        } catch (Exception ignored){}
        System.out.println("You entered not a number!");
    }

}
