package javaCodingProblems.stringsNumbersAndMath;

import java.util.Arrays;
import java.util.Scanner;

public class T24StringTransform {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String line = sc.nextLine();
        System.out.print("Enter the number of the action you want to take with your line:" + "\n" +
                "1 - Convert all line characters to upper case" + "\n" +
                "2 - Convert all line characters to upper case" + "\n" +
                "3 - Replace all vowels with &" + "\n" +
                "4 - Reverse line characters" + "\n");
        switch (sc.nextInt()) {
            case 1:
                System.out.print("Your line with upper case is: " + "\n" + line.toUpperCase());
                break;
            case 2:
                System.out.print("Your line with lower case is: " + "\n" + line.toLowerCase());
                break;
            case 3:
                replaceVowels(line);
                break;
            case 4:
                reverseLine(line);
                break;
            default:
                System.out.println("You enter wrong number!");
        }
    }

    public static void replaceVowels(String line) {
        char [] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y'};
        char [] lineChars = line.toCharArray();
        StringBuilder replacedLine = new StringBuilder();
        for (int i = 0; i < lineChars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (lineChars[i] == vowels[j]) {
                    lineChars[i] = '&';
                }
            }
            replacedLine.append(lineChars[i]);
        }
        line = Arrays.toString(lineChars);
        System.out.print("Your line with replaced vowels is:" + "\n" + replacedLine);
    }

    public static void reverseLine(String line) {
        char [] lineChars = line.toCharArray();
        StringBuilder reversedLine = new StringBuilder();
        for (int i = lineChars.length - 1; i >= 0; i--) {
            reversedLine.append(lineChars[i]);
        }
        System.out.print("Your line with reversed chars is" + "\n" + reversedLine);
    }
}
