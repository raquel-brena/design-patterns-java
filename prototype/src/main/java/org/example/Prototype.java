package org.example;

public abstract class Prototype<T> implements Cloneable{
    @Override
    public Prototype<T> clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
