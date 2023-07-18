package javaCodingProblems.objectsImmutabilityAndSwitch.T49ImmutableClass;

public final class ImmutableClass {

    private final int i;
    private final boolean b;
    private final String s;

    public ImmutableClass () {
        this.i = 1;
        this.b = true;
        this.s = "s";
    }

    public ImmutableClass (int i, boolean b, String s) {
        this.i = i;
        this.b = b;
        this.s = s;
    }

    public int getI () {
        return this.i;
    }

    public boolean getB () {
        return this.b;
    }

    public String getS () {
        return this.s;
    }

    @Override
    public String toString () {
        return "i = " + this.i + "\n" +
                "b = " + this.b + "\n" +
                "s = " + this.s;
    }
}
