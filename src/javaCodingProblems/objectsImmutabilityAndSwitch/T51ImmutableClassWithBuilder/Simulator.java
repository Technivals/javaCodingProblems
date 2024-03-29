package javaCodingProblems.objectsImmutabilityAndSwitch.T51ImmutableClassWithBuilder;

public class Simulator {

    public static void main(String[] args) {
        Application application1 = Application.getBuilder("Josh", "Martin", 1).build();
        Application application2 = Application.getBuilder("Jack", "Hardy", 2).specialisation("Cyber")
                .build();
        Application application3 = Application.getBuilder("David", "Cross", 3).specialisation("Economy")
                .grade("bachelor").build();
        System.out.println(application1.toString());
        System.out.println(application2.toString());
        System.out.println(application3.toString());
    }
}
