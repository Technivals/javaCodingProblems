package javaCodingProblems.stringsNumbersAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatSymbolsDeleter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> uniqueSymbols = new ArrayList<>();
        StringBuilder uniqueLine = new StringBuilder();
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split(" ");
        for (int s = 0; s < line.length; s++){
            for (int i = 0; i < line[s].length(); i++){
                if(!uniqueSymbols.contains(line[s].charAt(i))){
                    uniqueLine.append(line[s].charAt(i));
                    uniqueSymbols.add(line[s].charAt(i));
                }
            }
            uniqueLine.append(" ");
        }
        System.out.println(uniqueLine.toString());
    }
}
