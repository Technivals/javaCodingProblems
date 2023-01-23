package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class whitespaceDeleter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string which you want to explore");
        String [] lineArray = sc.nextLine().split(" ");
        StringBuilder lineWithoutWhitespace = new StringBuilder();
        for(String item: lineArray){
            lineWithoutWhitespace.append(item);
        }
        System.out.print("Your string without whitespace looks this: " + "\n" + lineWithoutWhitespace);
    }
}
