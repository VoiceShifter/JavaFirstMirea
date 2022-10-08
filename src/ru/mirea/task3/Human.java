package ru.mirea.task3;

public class Human {
    Hand Hand1, Hand2;
    Leg Leg1, Leg2;
    Head Head1;

    Human(double Hand1Lenght, boolean Hand1Existance, double Hand2Lenght, boolean Hand2Existance, boolean Leg1Existance, boolean Leg2Existance, boolean HeadExistance, boolean HeadBoldness) {
        Hand1 = new Hand (Hand1Lenght, Hand1Existance);
        Hand2 = new Hand (Hand2Lenght, Hand2Existance);
        Leg1 = new Leg(Leg1Existance);
        Leg2 = new Leg(Leg2Existance);
        Head1 = new Head(HeadBoldness, HeadExistance);
    }

    @Override
    public String toString() {
        return "Human" +
                "Hand1=" + Hand1 +
                ", Hand2=" + Hand2 +
                ", Leg1=" + Leg1 +
                ", Leg2=" + Leg2 +
                ", Head1=" + Head1;
    }
    public static void main(String[] args) {
        Human NickVuychich = new Human(0, false, 0, false, false, true, false,false);
        System.out.print(NickVuychich);
    }
}
