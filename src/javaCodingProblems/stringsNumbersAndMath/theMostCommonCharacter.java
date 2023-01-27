package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class theMostCommonCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String line = sc.nextLine().toLowerCase();
        char [] characters = line.toCharArray();
        int tempCount = 0;
        int trueCount = 0;
        List<Character> mostCommonChars = new ArrayList<>();
        List<Character> usedSymbols = new ArrayList<>();
        usedSymbols.add(' ');
        for (char ch1 : characters){
            if(!usedSymbols.contains(ch1)) {
                for (char ch2 : characters) {
                    if (ch1 == ch2) {
                        tempCount++;
                    }
                }
            }
            usedSymbols.add(ch1);
            if (trueCount <= tempCount){
                trueCount = tempCount;
                mostCommonChars.add(ch1);
            }
            tempCount = 0;
        }
        System.out.println("The most common character in line is " + mostCommonChars.toString() +
                " with " + trueCount + " append(s)");
    }
}
