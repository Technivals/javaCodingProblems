package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class T2FirstUniqueChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        List<Character> charList = new ArrayList<>();
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split(" ");
        for (int s = 0; s < line.length; s++) {
            for (int c = 0; c < line[s].length(); c++) {
                charList.add(line[s].toLowerCase(Locale.ROOT).charAt(c));
            }
        }
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
