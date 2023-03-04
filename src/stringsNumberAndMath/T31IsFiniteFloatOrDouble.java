package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T31IsFiniteFloatOrDouble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number with floating point to find out if it is finite");
        String s = sc.nextLine();
        try {
            float floatNumber = Float.parseFloat(s);
            if (Float.isFinite(floatNumber)) {
                System.out.println("Your number with floating point is finite for Float type");
            } else {
                System.out.println("Your number with floating point is infinite for Float type");
            }
            double doubleNumber = Double.parseDouble(s);
            if (Double.isFinite(doubleNumber)) {
                System.out.println("Your number with floating point is finite for Double type");
            } else {
                System.out.println("Your number with floating point is infinite for Double type");
            }
        } catch (Exception e){
            System.out.println("You enter not a number");
        }
    }
}
