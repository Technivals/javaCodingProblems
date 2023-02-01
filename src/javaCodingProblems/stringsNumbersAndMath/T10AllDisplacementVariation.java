package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T10AllDisplacementVariation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String line = sc.nextLine();
        int len = line.length();
        permute(line, 0, len - 1);
    }

    private static void permute(String line, int start, int len)
    {
        if (start == len)
            System.out.println(line);
        else {
            for (int i = start; i <= len; i++) {
                line = swap(line, start, i);
                permute(line, start + 1, len);
                line = swap(line, start, i);
            }
        }
    }
    public static String swap(String line, int i, int j)
    {
        char temp;
        char[] charArray = line.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
