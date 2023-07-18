package javaCodingProblems.objectsImmutabilityAndSwitch.T49ImmutableClass;

import javaCodingProblems.objectsImmutabilityAndSwitch.IsImmutable;

public class Simulation implements IsImmutable {

    public static void main(String[] args) {
        System.out.println("An immutable class is a class that cannot be changed (its state is fixed) after it has been created");
        System.out.println("There is no reliable way to detect if a class is immutable " +
                "This is because there are so many ways a property of a class might be altered and you can't detect all of them via reflection");
        System.out.println("The only way to get close to this is: " + "\n" +
                "Only allow final properties of types that are immutable" + "\n" +
                "Require the class to be final itself" + "\n" +
                "The class must have a getter to read the fields" + "\n" +
                "There should be no setters in the class");
        System.out.println("Let's create objects(mutable & immutable) of 2 different classes, one of which will be mutable and the other not" +
                "and check them with isImmutable method");
        MutableClass mutable = new MutableClass();
        ImmutableClass immutable = new ImmutableClass();
        System.out.println("The results are:" + "\n" +
                "mutable - " + IsImmutable.isImmutable(mutable) + "\n" +
                "immutable - " + IsImmutable.isImmutable(immutable));
    }
}
