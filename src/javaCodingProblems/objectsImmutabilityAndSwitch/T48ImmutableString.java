package javaCodingProblems.objectsImmutabilityAndSwitch;

public class T48ImmutableString implements IsImmutable {

    public static void main(String[] args) {
        System.out.println("Strings in java are immutable");
        System.out.println("It means once a string variable are created it cannot be modified");
        System.out.println("However, the String class has fields that do not have the final modifier, which is not valid for an immutable object");
        System.out.println("Let's create a string variable str1 and check its immutability using the method isImmutable");
        String str1 = "str1";
        System.out.println("The result is - " + IsImmutable.isImmutable(str1));
    }
}
