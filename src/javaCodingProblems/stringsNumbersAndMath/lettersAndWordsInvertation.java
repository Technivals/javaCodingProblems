package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lettersAndWordsInvertation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> reverseWordsList = new ArrayList<>();
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split("");
        for(int i = line.length - 1; i >= 0; i-- ) {
            reverseWordsList.add(line[i]);
        }
        for(int j = 0; j < reverseWordsList.size(); j++) {
            System.out.print(reverseWordsList.get(j));
        }

    }
}
