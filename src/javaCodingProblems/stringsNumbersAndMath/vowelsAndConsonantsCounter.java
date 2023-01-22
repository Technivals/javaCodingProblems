package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class vowelsAndConsonantsCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowelsCount = 0;
        int consonantsCount = 0;
        int currentCount = 0;
        String [] vowels = {"a", "e", "i", "o", "u", "y"};
        String [] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n",
                "p", "q", "r", "s", "t", "v", "w", "x", "z"};
        System.out.println("Enter string which you want to explore");
        String [] line = sc.nextLine().split(" ");
        List<Character> charList = new ArrayList<>();
        for (String s : line) {
            for (int c = 0; c < s.length(); c++) {
                charList.add(s.toLowerCase(Locale.ROOT).charAt(c));
            }
        }
        for(Character item: charList){
            for(int i = 0; i < vowels.length; i++) {
                if (item == vowels[i].charAt(0)) {
                    vowelsCount++;
                    break;
                }
            }
            if(currentCount == vowelsCount) {
                for (int j = 0; j < consonants.length; j++) {
                    if (item == consonants[j].charAt(0)) {
                        consonantsCount++;
                        break;
                    }
                }
            }
            currentCount = vowelsCount;
        }
        System.out.print("Your line has: " + "\n" +
                vowelsCount + " vowels letter;" + "\n" +
                consonantsCount + " consonants letter");
    }
}
