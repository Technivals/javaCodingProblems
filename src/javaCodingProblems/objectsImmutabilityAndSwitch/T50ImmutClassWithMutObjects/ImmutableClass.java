package javaCodingProblems.objectsImmutabilityAndSwitch.T50ImmutClassWithMutObjects;

public final class ImmutableClass {

    private final int in;
    private final long lng;
    private final MutableClass mt;


    ImmutableClass () {
        this.in = 12;
        this.lng = 43;
        MutableClass clone = new MutableClass();
        clone.setI(12);
        clone.setL(55);
        this.mt = clone;
    }

    ImmutableClass (int in, long lng, MutableClass mt) {
        this.in = in;
        this.lng = lng;
        MutableClass clone = new MutableClass();
        clone.setI(mt.getI());
        clone.setL(mt.getL());
        this.mt = clone;
    }

    public int getIn () {
        return this.in;
    }

    public long getLng () {
        return this.lng;
    }

    public MutableClass getMt () {
        MutableClass clone = new MutableClass();
        clone.setI(this.mt.getI());
        clone.setL(this.mt.getL());
        return clone;
    }

    @Override
    public String toString () {
        return "in = " + this.in + "\n" + "lng = " + this.lng + "\n" + "mt: " + "\n" + this.mt.toString();
    }
}
