package ru.mirea.task3;

public class Hand
{
    public boolean Existance;
    public double Lenght;

    Hand(double Lenght, boolean Existance)
    {
        this.Lenght = Lenght;
        this.Existance = Existance;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "Existance=" + Existance +
                ", Lenght=" + Lenght +
                '}';
    }
}
