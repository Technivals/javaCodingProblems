package javaCodingProblems.objectsImmutabilityAndSwitch;


public class T47ImmutableObjects implements IsImmutable {

    public static void main(String[] args) {
        System.out.println("An immutable object is an object that cannot be changed (its state is fixed) after it has been created");
        System.out.println("There is no reliable way to detect if a class is immutable " +
                "This is because there are so many ways a property of a class might be altered and you can't detect all of them via reflection");
        System.out.println("The only way to get close to this is: " + "\n" +
                "Only allow final properties of types that are immutable (primitive types and classes are immutable)" + "\n" +
                "Require the class to be final itself");
        System.out.println("Using the method isImmutable, you can superficially check whether the object is immutable");
        int i = 0;
        Integer in = 0;
        char ch = 'k';
        boolean b = false;
        System.out.println("The result of checking some objects is as follows:" + "\n" +
                "int i - " + IsImmutable.isImmutable(i) + "\n" +
                "Integer in - " + IsImmutable.isImmutable(in) + "\n" +
                "char ch - " + IsImmutable.isImmutable(ch) + "\n" +
                "boolean b - " + IsImmutable.isImmutable(b));
    }
}
