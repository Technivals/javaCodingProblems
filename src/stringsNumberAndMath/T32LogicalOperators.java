package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T32LogicalOperators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers through a space to compare them with the number 100");
        String [] numbers = sc.nextLine().split(" ");
        int num1 = 0;
        int num2 = 0;
        if (numbers.length == 2) {
            try {
                num1 = Integer.parseInt(numbers[0]);
                num2 = Integer.parseInt(numbers[1]);
                if (num1 < 0 ^ num2 < 0) {
                    System.out.println("One of your two numbers are negative");
                }
                if (num1 >= 100 && num2 >= 100){
                    System.out.println("Your both numbers are bigger or equal than 100");
                } else if (num1 >= 100 || num2 >= 100) {
                    System.out.println("One of your two numbers are bigger or equal than 100");
                } else {
                    System.out.println("Your both numbers are smaller than 100");
                }
            } catch (Exception e){
                System.out.println("You entered not a number/numbers");
            }
        } else {
            System.out.println("You entered not two numbers");
        }
    }
}
