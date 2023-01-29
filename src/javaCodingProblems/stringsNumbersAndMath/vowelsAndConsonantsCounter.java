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
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split(" ");
        List<Character> charList = new ArrayList<>();
        for (int s = 0; s < line.length; s++) {
            for (int c = 0; c < line[s].length(); c++) {
                charList.add(line[s].toLowerCase(Locale.ROOT).charAt(c));
            }
        }
        for(int l = 0; l < charList.size(); l++){
            for(int i = 0; i < vowels.length; i++) {
                if (charList.get(l) == vowels[i].charAt(0)) {
                    vowelsCount++;
                    break;
                }
            }
            if(currentCount == vowelsCount) {
                for (int j = 0; j < consonants.length; j++) {
                    if (charList.get(l) == consonants[j].charAt(0)) {
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
