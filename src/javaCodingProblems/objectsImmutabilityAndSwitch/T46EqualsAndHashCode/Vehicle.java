package javaCodingProblems.objectsImmutabilityAndSwitch.T46EqualsAndHashCode;

import java.util.Objects;

public class Vehicle {

    private String brand;
    private int id;

    public Vehicle () {}

    public Vehicle (String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    public String getBrand () {
        return this.brand;
    }

    public int getId () {
        return this.id;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setId (int id) {
        this.id = id;
    }

    @Override
    public String toString () {
        return "Id: " + this.id + "\n" + "Brand: " + this.brand;
    }

    public boolean badEquals (Object obj) {
        return this.equals(obj);
    }
    public boolean goodEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Vehicle other = (Vehicle) obj;

        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }

    public int badHashCode () {
        return hashCode();
    }

    public int goodHashCode () {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.brand);
        return hash;
    }
}
