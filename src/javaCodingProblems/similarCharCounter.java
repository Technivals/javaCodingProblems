package javaCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class similarCharCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to explore");
        String [] line = sc.nextLine().split(" ");
        List<Character> charList = new ArrayList<>();
        for (String s : line) {
            for (int c = 0; c < s.length(); c++) {
                charList.add(s.toLowerCase(Locale.ROOT).charAt(c));
            }
        }
        List<Character> checkList = new ArrayList<Character>();
        int count = 0;
        for (int i = 0; i < charList.size(); i++) {
            if (!checkList.contains(charList.get(i))) {
                for (int j = 0; j < charList.size(); j++) {
                    if (charList.get(i) == charList.get(j)) {
                        count++;
                    }
                }
                checkList.add(charList.get(i));
                count--;
                }
        }
        System.out.println("The number of similar char in your string is: " + count);
    }
}
