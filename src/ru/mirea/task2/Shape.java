package ru.mirea.task2;

public class Shape
{
    double S;
    Shape(double Size)
    {
        S = Size;
    }
    @Override
    public String toString() {
        return "Проcтейшая форма с площадью = " + S;
    }

    public static void main(String[] args) {
        Shape A = new Shape(3);
        System.out.print(A.toString());
    }
}
