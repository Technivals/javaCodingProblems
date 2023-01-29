package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class whitespaceDeleter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder lineWithoutWhitespace = new StringBuilder();
        System.out.println("Enter line with which you want to work");
        String [] lineArray = sc.nextLine().split(" ");
        for(String item: lineArray){
            lineWithoutWhitespace.append(item);
        }
        System.out.print("Your string without whitespace looks this: " + "\n" + lineWithoutWhitespace);
    }
}
