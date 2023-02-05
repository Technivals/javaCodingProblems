package javaCodingProblems.stringsNumbersAndMath;

import java.util.Arrays;
import java.util.Scanner;

public class T22CommonPrefixFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder prefix = new StringBuilder();
        boolean endPrefix = false;
        char ch = ' ';
        System.out.println("Enter the words in which you want to find a common prefix");
        String [] words = sc.nextLine().split(" ");
        Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
        for (int i = 0; i < words[0].length(); i++) {
            ch = words[0].charAt(i);
            for (int j = 0; j < words.length; j++) {
                if (ch != words[j].charAt(i)) {
                    endPrefix = true;
                    break;
                }
            }
            if (!endPrefix){
                prefix.append(ch);
            } else {
                break;
            }
        }
        if (prefix.length() > 0){
            System.out.println("Common prefix of your words is " + prefix.toString());
        } else {
            System.out.println("Your words do not have a common prefix");
        }
    }
}
