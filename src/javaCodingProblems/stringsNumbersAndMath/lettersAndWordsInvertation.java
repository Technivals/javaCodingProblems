package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lettersAndWordsInvertation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to explore");
        String [] line = sc.nextLine().split("");
        List<String> reverseWordsList = new ArrayList<>();
        for(int i = line.length - 1; i >= 0; i-- ) {
            reverseWordsList.add(line[i]);
        }
        for(String item : reverseWordsList) {
            System.out.print(item);
        }

    }
}
