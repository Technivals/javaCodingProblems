package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T13SpecialCharacterDeleter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder uniqueLine = new StringBuilder();
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split(" ");
        System.out.println("Enter character, copies of which you want to delete ");
        String uniqueSymbol = sc.nextLine();
        for (int s = 0; s < line.length; s++){
            for (int i = 0; i < line[s].length(); i++){
                if(uniqueSymbol.charAt(0) != line[s].charAt(i)){
                    uniqueLine.append(line[s].charAt(i));
                }
            }
            uniqueLine.append(" ");
        }
        System.out.println(uniqueLine.toString());
    }
}
