package javaCodingProblems.objectsImmutabilityAndSwitch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T43NonNullValuesReturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> sequence = new ArrayList<>();
        System.out.println("Enter sequence of values(through whitespace)");
        String [] values = sc.nextLine().split(" ");
        for (int i = 0; i < values.length; i++) {
            if (!values[i].equals("null")) {
                sequence.add(values[i]);
            }
        }
        System.out.print("Your sequence without null looks this:" + "\n" + sequence.toString());
    }
}
