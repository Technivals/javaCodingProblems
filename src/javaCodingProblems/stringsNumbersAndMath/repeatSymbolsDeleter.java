package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatSymbolsDeleter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split(" ");
        List<Character> uniqueSymbols = new ArrayList<>();
        StringBuilder uniqueLine = new StringBuilder();
        for (String s : line){
            for (int i = 0; i < s.length(); i++){
                if(!uniqueSymbols.contains(s.charAt(i))){
                    uniqueLine.append(s.charAt(i));
                    uniqueSymbols.add(s.charAt(i));
                }
            }
            uniqueLine.append(" ");
        }
        System.out.println(uniqueLine.toString());
    }
}
