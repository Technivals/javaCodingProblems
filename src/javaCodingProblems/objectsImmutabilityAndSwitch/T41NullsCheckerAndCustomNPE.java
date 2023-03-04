package javaCodingProblems.objectsImmutabilityAndSwitch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T41NullsCheckerAndCustomNPE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> sequence = new ArrayList<>();
        System.out.println("Enter sequence of values(through whitespace)");
        String [] values = sc.nextLine().split(" ");
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals("null")) {
                sequence.add(null);
            } else {
                sequence.add(values[i]);
            }
        }
        String nullCatcher = "";
        for (String item : sequence) {
            if (item == null) {
                throw new NullPointerException("You entered null value in your sequence");
            }
        }
    }
}
