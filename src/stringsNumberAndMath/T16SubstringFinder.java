package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.Scanner;

public class T16SubstringFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> isSubstring = new ArrayList<String>();
        System.out.println("Enter line with which you want to work");
        String [] lineArray = sc.nextLine().split(" ");
        System.out.println("Enter substring which you want to find");
        String substring = sc.nextLine();
        for (int i = 0; i < lineArray.length; i++) {
            if(lineArray[i].contains(substring)){
                isSubstring.add(lineArray[i]);
            }
        }
        if(isSubstring.isEmpty()){
            System.out.println("No substring found in entered word/words");
        } else {
            System.out.println("Substring found in this word/these words - " + isSubstring.toString());
        }
    }
}
