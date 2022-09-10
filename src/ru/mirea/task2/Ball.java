package ru.mirea.task2;

public class Ball
{
    double Radious;
    String Color;
    Ball(double Radious, String color)
    {
        Radious = Radious;
        Color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "Radious=" + Radious +
                ", Color=" + Color +
                '}';
    }
}
