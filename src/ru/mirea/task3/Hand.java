package ru.mirea.task3;

public class Hand
{
    boolean Existance;
    double Lenght;

    Hand(double aLenght, boolean aExistance)
    {
        Lenght = aLenght;
        Existance = aExistance;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "Existance=" + Existance +
                ", Lenght=" + Lenght +
                '}';
    }
}
