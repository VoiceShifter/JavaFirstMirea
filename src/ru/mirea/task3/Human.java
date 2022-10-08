package ru.mirea.task3;

public class Human
{
    Hand Hand1, Hand2;
    Leg Leg1, Leg2;
    Head Head1;
    Human(double Hand1Lenght, boolean Hand1Existance, double Hand2Lenght, boolean Hand2Existance, double Leg1Lenght, boolean Leg2Existance, boolean HeadExistance, boolean HeadBoldness)
    {
        Hand1.Existance = Hand1Existance;
        Hand2.Existance = Hand2Existance;
        Hand1.Lenght = Hand1Lenght;
        Hand2.Lenght = Hand2Lenght;
        Head1.Existance = HeadExistance;
        Head1.Bold = HeadBoldness;
    }

    @Override
    public String toString() {
        return "Human" +
                "Hand1=" + Hand1 +
                ", Hand2=" + Hand2 +
                ", Leg1=" + Leg1 +
                ", Leg2=" + Leg2 +
                ", Head1=" + Head1 +
                '}';
    }
}
