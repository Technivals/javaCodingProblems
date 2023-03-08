package javaCodingProblems.objectsImmutabilityAndSwitch.T46EqualsAndHashCode;

import java.util.Objects;
import java.util.Scanner;

public class Simulation {

    public static void main(String[] args) {
        System.out.println("Here is two objects of Vehicle class with identical values (id - 322, brand - Nissan");
        Vehicle vehicle1 = new Vehicle("Nissan", 322);
        Vehicle vehicle2 = new Vehicle("Nissan", 322);
        System.out.println("With default equals method result of compare these values is:");
        System.out.println(vehicle1.badEquals(vehicle2));
        System.out.println("But if we override equals method in Vehicle, result of compare be:");
        System.out.println(vehicle1.goodEquals(vehicle2));
        System.out.println("We see that default method equals badly compare our object" + "\n"
                + "due to the fact that the field values of our objects are in different memory cells");
        System.out.println("It is similarly works with hashCode method ");
        System.out.println("With default hashCode method hash codes of ours objects be different:");
        System.out.println("Hash code vehicle1 = " + vehicle1.badHashCode());
        System.out.println("Hash code vehicle2 = " + vehicle2.badHashCode());
        System.out.println("But if we override hashCode method in Vehicle, hash code of our objects be identical:");
        System.out.println("Hash code vehicle1 = " + vehicle1.goodHashCode());
        System.out.println("Hash code vehicle2 = " + vehicle2.goodHashCode());
    }
}
