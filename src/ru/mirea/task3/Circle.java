package ru.mirea.task3;

public class Circle
{
    double Radious;
    public void GetRadious () {
        System.out.println(Radious);
    };
    public void SetRadious (double A)
    {
        Radious = A;
    }
    Circle(double Rad)
    {
        Radious = Rad;
    }

}
