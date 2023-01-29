package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class stringWithSymbolConnector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder withSymbolConnector = new StringBuilder();
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split(" ");
        System.out.println("Enter symbol with which you want connect your strings");
        String symbol = sc.nextLine();
        for (int i = 0; i < line.length; i++){
            withSymbolConnector.append(line[i]);
            if(i != line.length - 1) {
                withSymbolConnector.append(symbol);
            }
        }
        System.out.print("Your new line looks this: " + "\n" + withSymbolConnector);
    }
}
