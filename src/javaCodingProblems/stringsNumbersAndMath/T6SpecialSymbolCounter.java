package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T6SpecialSymbolCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int symbolCounter = 0;
        System.out.println("Enter line with which you want to work");
        char [] line = sc.nextLine().toCharArray();
        System.out.println("Enter a symbol which you want to count");
        char ch = sc.nextLine().charAt(0);
        for(int i = 0; i < line.length; i++){
            if(ch == line[i]){
                symbolCounter++;
            }
        }
        System.out.println("Your entered symbol appeared " + symbolCounter + " times");
    }
}
