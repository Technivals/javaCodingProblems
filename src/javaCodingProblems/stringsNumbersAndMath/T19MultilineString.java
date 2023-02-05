package javaCodingProblems.stringsNumbersAndMath;

import java.util.Objects;
import java.util.Scanner;

public class T19MultilineString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder multiLine = new StringBuilder();
        boolean end = false;
        System.out.println("Enter the first line of your multiline string");
        String line = sc.nextLine();
        while (!end){
            if(!Objects.equals(line, "End Multiline")) {
                multiLine.append(line);
                multiLine.append("\n");
                System.out.println("Enter next line of your multiline string");
                System.out.println("If you want to end your multiline string then enter End Multiline");
                line = sc.nextLine();
            } else {
                System.out.print("Your multiline is:" + "\n" + multiLine.toString());
                end = true;
            }
        }
    }
}
