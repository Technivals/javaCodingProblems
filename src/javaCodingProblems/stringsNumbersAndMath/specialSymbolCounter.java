package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class specialSymbolCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int symbolCounter = 0;
        System.out.println("Enter string which you want to explore");
        char [] line = sc.nextLine().toCharArray();
        System.out.println("Enter a symbol which you want to count");
        String symbol = sc.nextLine();
        char ch = symbol.charAt(0);
        for(int i = 0; i < line.length; i++){
            if(ch == line[i]){
                symbolCounter++;
            }
        }
        System.out.println("Your entered symbol appeared " + symbolCounter + " times");
    }
}
