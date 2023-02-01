package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T18AnagramsChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> wrd1List = new ArrayList<>();
        List<Character> wrd2List = new ArrayList<>();
        System.out.println("Enter two words to check if they are anagrams");
        String line = sc.nextLine().toLowerCase();
        String [] wrds = line.split(" ");
        if(wrds.length == 2) {
            char[] wrd1Array = wrds[0].toCharArray();
            char[] wrd2Array = wrds[1].toCharArray();
            for (int c = 0; c < wrds[0].length(); c++) {
                wrd1List.add(wrd1Array[c]);
                wrd2List.add(wrd2Array[c]);
            }
            for (int j = 0; j < wrd1Array.length; j++) {
                wrd1List.remove(Character.valueOf(wrd1Array[j]));
                wrd2List.remove(Character.valueOf(wrd1Array[j]));
                }
            if (wrd1List.isEmpty() && wrd2List.isEmpty()) {
                System.out.println("Your words are anagrams");
            } else {
                System.out.println("Your words aren't anagrams");
            }
        } else {
            System.out.println("You entered not 2 words");
        }
    }
}
