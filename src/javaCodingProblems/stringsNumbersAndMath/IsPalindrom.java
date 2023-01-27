package javaCodingProblems.stringsNumbersAndMath;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class IsPalindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split("[\\W+]+");
        StringBuilder connectedLine = new StringBuilder();
        StringBuilder palindrome = new StringBuilder();
        for (String s : line) {
            s = s.toLowerCase();
            for (int j = 0 ; j < s.length(); j++) {
                connectedLine.append(s.charAt(j));
            }
        }
        for (int i = line.length - 1; i >= 0; i--) {
            line[i] = line[i].toLowerCase();
            for (int j = line[i].length() - 1; j >= 0; j--) {
                palindrome.append(line[i].charAt(j));
            }
        }
        boolean isPalindrom = true;
        if (!connectedLine.toString().equals(palindrome.toString())){
            System.out.println("Your word/words in line is not palindrome");
            isPalindrom = false;
            }
        if (isPalindrom) {
            System.out.println("Your word/words in line is palindrome");
        }
    }
}
