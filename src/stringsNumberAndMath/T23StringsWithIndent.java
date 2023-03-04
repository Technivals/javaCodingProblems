package javaCodingProblems.stringsNumbersAndMath;

import java.util.*;

public class T23StringsWithIndent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        int count = 0;
        List<String> multiline = new ArrayList<>();
        StringBuilder indentLine = new StringBuilder();
        System.out.println("Enter the line");
        String line = sc.nextLine();
        while (!end){
            if(!Objects.equals(line, "Finish Input")) {
                multiline.add(line);
                System.out.println("If you want to enter another line then type it below");
                System.out.println("If you want to end input string then enter Finish input");
                line = sc.nextLine();
            } else {
                end = true;
            }
        }
        System.out.println("Enter the lengths of indent for all lines. " +
                "You can also enter indent for each line separately. For this, enter the length of indents thought whitespace");
        String[] indents = sc.nextLine().split(" ");
        if (indents.length != 1) {
            int[] indentsLength = new int[indents.length];
            try {
                for (int i = 0; i < indentsLength.length; i++) {
                    indentsLength[i] = Integer.parseInt(indents[i]);
                }
                for (int j = 0; j < indentsLength.length; j++) {
                    for (int k = 0; k < indentsLength[j]; k++) {
                        indentLine.append(" ");
                    }
                    indentLine.append(multiline.get(count));
                    indentLine.append("\n");
                    count++;
                }
            } catch (Exception e) {
                System.out.println("You entered not number");
            }
        } else {
            try {
                int indentLength = Integer.parseInt(indents[0]);
                for (int s = 0; s < multiline.size(); s++) {
                    for (int k = 0; k < indentLength; k++) {
                        indentLine.append(" ");
                    }
                    indentLine.append(multiline.get(s));
                    indentLine.append("\n");
                }
            } catch (Exception e) {
                System.out.println("You entered not a number");
            }
        }
        System.out.print("You input with indent looks that way: " + "\n" + indentLine);
    }
}
