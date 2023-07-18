package javaCodingProblems.objectsImmutabilityAndSwitch.T49ImmutableClass;

public class MutableClass {

    private int i;
    private boolean b;
    private String s;

    public MutableClass () {
        this.i = 1;
        this.b = true;
        this.s = "s";
    }

    public MutableClass (int i, boolean b, String s) {
        this.i = i;
        this.b = b;
        this.s = s;
    }

    public int getI () {
        return this.i;
    }

    public void setI (int i) {
        this.i = i;
    }

    public boolean getB () {
        return  this.b;
    }

    public void setB (boolean b) {
        this.b = b;
    }

    public String getS () {
        return  this.s;
    }

    public void setS (String s) {
        this.s = s;
    }

    @Override
    public String toString () {
        return "i = " + this.i + "\n" +
                "b = " + this.b + "\n" +
                "s = " + this.s;
    }
}
