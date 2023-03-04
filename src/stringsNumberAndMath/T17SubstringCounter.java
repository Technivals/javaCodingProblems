package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class T17SubstringCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter line with which you want to work");
        String [] lineArray = sc.nextLine().split(" ");
        System.out.println("Enter substring which you want to find");
        String substring = sc.nextLine();
        for (int i = 0; i < lineArray.length; i++) {
            if(lineArray[i].contains(substring)){
                count++;
            }
        }
        if(count == 0){
            System.out.println("No substring found in entered word/words");
        } else {
            System.out.println("Substring in this line meets " + count + " times");
        }
    }
}
