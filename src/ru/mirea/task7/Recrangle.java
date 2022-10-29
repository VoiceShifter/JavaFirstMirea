package ru.mirea.task7;

public class Recrangle extends Shape {
    double Width;
    double Lenght;

    Recrangle(double aWidth, double aLenght, String aColor, boolean aFilled) {
        super(aColor, aFilled);
        this.Lenght = aLenght;
        this.Width = aWidth;

    }

    void setWidth(double aWidth) {
        this.Width = aWidth;
    }

    void getWidth() {
        System.out.println(this.Width);
    }

    void setLenght(double aLenght) {
        this.Lenght = aLenght;
    }

    void getLenght() {
        System.out.println(this.Lenght);
    }

    double getArea() {
        return Width * Lenght;
    }

    double getPerimentr() {
        return (Width + Lenght) * 2;
    }

    public String toString() {
        return "Recrangle{" +
                "Width=" + Width +
                ", Lenght=" + Lenght +
                ", Color='" + Color + '\'' +
                ", Filled=" + Filled +
                '}';
    }
}
