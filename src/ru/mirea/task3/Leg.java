package ru.mirea.task3;

public class Leg {
    boolean Existance;

    Leg(boolean aExistance) {
        Existance = aExistance;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "Existance=" + Existance +
                '}';
    }
}
