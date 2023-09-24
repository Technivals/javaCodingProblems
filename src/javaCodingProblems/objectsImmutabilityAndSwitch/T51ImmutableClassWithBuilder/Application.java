package javaCodingProblems.objectsImmutabilityAndSwitch.T51ImmutableClassWithBuilder;

import java.util.Date;

public final class Application {

    private final String firstname;
    private final String lastname;
    private final int courseNumber;
    private final String specialisation;
    private final String grade;
    private final Date submitted;

    private Application(ApplicationBuilder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.courseNumber = builder.courseNumber;
        this.specialisation = builder.specialisation;
        this.grade = builder.grade;
        this.submitted = builder.submitted;
    }

    public static ApplicationBuilder getBuilder (String firstname, String lastname, int courseNumber) {
        return new Application.ApplicationBuilder(firstname, lastname, courseNumber);
    }

public static final class ApplicationBuilder {

    private final String firstname;
    private final String lastname;
    private final int courseNumber;
    private String specialisation;
    private String grade;
    private final Date submitted;

    public ApplicationBuilder(String firstname, String lastname, int courseNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.courseNumber = courseNumber;
        this.submitted = new Date();
    }

    public ApplicationBuilder specialisation(String specialisation) {
        this.specialisation = specialisation;
        return this;
    }

    public ApplicationBuilder grade(String grade) {
        this.grade = grade;
        return this;
    }

    public Application build() {
        return new Application(this);
    }
}

    public String getFirstname () {
        return firstname;
    }

    public String getLastname () {
        return lastname;
    }

    public int getCourseNumber () {
        return courseNumber;
    }

    public String getSpecialisation () {
        return specialisation;
    }

    public String getGrade () {
        return grade;
    }

    public Date getSubmitted () {
        return new Date(submitted.getTime());
    }

    @Override
    public String toString () {
        return "firstname: " + firstname + "\n" + "lastname: " + lastname + "\n" + "course: " + courseNumber + "\n"
                + "specialisation: " + specialisation + "\n" + "grade: " + grade + "\n" + "submitted: " + new Date(submitted.getTime());
    }
}
