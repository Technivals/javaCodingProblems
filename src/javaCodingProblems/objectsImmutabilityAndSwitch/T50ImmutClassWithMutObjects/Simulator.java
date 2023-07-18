package javaCodingProblems.objectsImmutabilityAndSwitch.T50ImmutClassWithMutObjects;

public class Simulator {

    public static void main(String[] args) {
        MutableClass mt = new MutableClass();
        ImmutableClass imt = new ImmutableClass(12, 46, mt);
        System.out.println(imt.toString());
        imt.getMt().setI(66);
        System.out.println(imt.toString());
    }
}
