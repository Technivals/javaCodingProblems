package javaCodingProblems.objectsImmutabilityAndSwitch.T52BadDataPrevention;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import java.util.Set;

public class Simulator {

    public static void main(String[] args) {
        Application application;
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Application.ApplicationBuilder application1 = Application.getBuilder("koka", "kokovenko", 1);
        Application.ApplicationBuilder application2 = Application.getBuilder("kekes", "kekesovych", 2).
                specialisation("Cyber");
        Application.ApplicationBuilder application3 = Application.getBuilder("man", "pan", 3)
                .specialisation("Economy").grade("bachelor");
        final Set <ConstraintViolation<Application.ApplicationBuilder>> violations = validator.validate(application1);
        if (violations.isEmpty()) {
        application = application1.build();
        System.out.println("Application successfully created");
        } else {
            System.out.println("Error ApplicationBuilder: " + violations);
        }
    }
}
