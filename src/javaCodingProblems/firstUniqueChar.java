package javaCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class firstUniqueChar {

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
        int count = 0;
        for (int i = 0; i < charList.size(); i++) {
            for (int j = 0; j < charList.size(); j++) {
                if (charList.get(i) == charList.get(j)) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println("The first unique char in your line is: " + charList.get(i));
                break;
            } else {
                count = 0;
            }
        }
    }
}
