package javaCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class similarCharCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> charList = new ArrayList<>();
        List<Character> checkList = new ArrayList<Character>();
        int count = 0;
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split(" ");
        for (int s = 0; s < line.length; s++) {
            for (int c = 0; c < line[s].length(); c++) {
                charList.add(line[s].toLowerCase(Locale.ROOT).charAt(c));
            }
        }
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
