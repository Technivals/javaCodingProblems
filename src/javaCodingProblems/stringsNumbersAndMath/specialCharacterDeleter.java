package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class specialCharacterDeleter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String [] line = sc.nextLine().split(" ");
        System.out.println("Enter character copies of which you want to delete ");
        String uniqueSymbol = sc.nextLine();
        StringBuilder uniqueLine = new StringBuilder();
        for (String s : line){
            for (int i = 0; i < s.length(); i++){
                if(uniqueSymbol.charAt(0) != s.charAt(i)){
                    uniqueLine.append(s.charAt(i));
                }
            }
            uniqueLine.append(" ");
        }
        System.out.println(uniqueLine.toString());
    }
}
