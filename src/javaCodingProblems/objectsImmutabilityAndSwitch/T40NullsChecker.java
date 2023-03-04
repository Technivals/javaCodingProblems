package javaCodingProblems.objectsImmutabilityAndSwitch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class T40NullsChecker {

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
        System.out.println("Enter the style in which you want to check the sequence on null values(imperative/functional)");
        switch (sc.nextLine()) {
            case "imperative":
                imperativeStyle(sequence);
                break;
            case "functional":
                functionalStyle(sequence);
                break;
            default:
                System.out.println("You entered wrong style");
        }
    }

    public static void imperativeStyle(List<String> sequence) {
        int count = 0;
        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i) == null) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Your sequence has null links");
        } else {
            System.out.println("In your sequence has no null links");
        }
    }

    public static void functionalStyle(List<String> sequence) {
        if(sequence.stream().anyMatch(Objects::isNull)) {
            System.out.println("Your sequence has null links");
        } else {
            System.out.println("In your sequence has no null links");
        }
    }
}
