package javaCodingProblems.objectsImmutabilityAndSwitch.T50ImmutClassWithMutObjects;

public class MutableClass {

    private int i;
    private long l;

    MutableClass () {
        this.i = 12;
        this.l = 55;
    }

    MutableClass (int i, long l) {
        this.i = i;
        this.l = l;
    }

    public int getI () {
        return this.i;
    }

    public void setI (int i) {
        this.i = i;
    }

    public long getL () {
        return this.l;
    }

    public void setL (long l) {
        this.l = l;
    }

    @Override
    public String toString () {
        return "i = " + this.i + "\n" + "l = " + this.l;
    }
}
