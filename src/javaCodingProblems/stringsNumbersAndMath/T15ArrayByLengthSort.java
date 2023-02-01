package javaCodingProblems.stringsNumbersAndMath;

import java.util.Arrays;
import java.util.Scanner;

public class T15ArrayByLengthSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line with which you want to work");
        String [] lineArray = sc.nextLine().split(" ");
        System.out.println("Enter the order in which you want to sort the string (From the smallest/From the biggest)");
        String choice = sc.nextLine();
        switch (choice){
            case "From the smallest":
                Arrays.sort(lineArray, (s1, s2) -> s1.length() - s2.length());
                System.out.println(Arrays.toString(lineArray));
                break;
            case "From the biggest":
                Arrays.sort(lineArray, (s1, s2) -> s2.length() - s1.length());
                System.out.println(Arrays.toString(lineArray));
                break;
            default:
                System.out.println("You enter wrong order");
        }
    }
}
