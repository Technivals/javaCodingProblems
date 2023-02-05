package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T20StringConcat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder concatLine = new StringBuilder();
        int number = 0;
        System.out.println("Enter line with which you want to work");
        String line = sc.nextLine();
        System.out.println("Enter the number of concatenation of this line");
        try {
            number = sc.nextInt();
        } catch (Exception e){
            System.out.println("You enter not a number");
        }
        for(int i = 0; i < number; i++){
            concatLine.append(line);
            concatLine.append(" ");
        }
        System.out.print("Your concatenated line is:" + "\n" + concatLine.toString());
    }
}
