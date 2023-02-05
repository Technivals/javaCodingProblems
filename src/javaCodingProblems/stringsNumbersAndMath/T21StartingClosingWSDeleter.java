package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T21StartingClosingWSDeleter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String line = sc.nextLine();
        String stripper = line.strip();
        System.out.print("Line with deleted  starting and closing whitespaces:" + "\n" + stripper);
    }
}
