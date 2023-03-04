package javaCodingProblems.objectsImmutabilityAndSwitch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T42NullsCheckerAndSpecNPE {

    public static void main(String[] args) throws IllegalAccessException {
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
                throw new IllegalAccessException("You have entered an impossible value");
            }
            nullCatcher = item;
        }
    }
}
