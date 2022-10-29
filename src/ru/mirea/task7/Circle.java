package ru.mirea.task7;

public class Circle extends Shape {
    double Radious;

    Circle() {
        super();
        this.Radious = 0;

    }

    Circle(double aRadious, boolean aFilled, String aColor) {
        super(aColor, aFilled);
        this.Radious = aRadious;

    }

    @Override
    double getArea() {
        return 3.14 * Radious * Radious;
    }

    @Override
    double getPerimentr() {
        return 2 * 3.14 * Radious;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "Radious=" + Radious +
                ", Color='" + Color + '\'' +
                ", Filled=" + Filled;
    }

    public double GetRadius() {
        return Radious;
    }

    public void setRadius(double Radius) {
        this.Radious = Radius;
    }

    public static void main(String[] args) {
        Circle Test = new Circle(13, false, "Black");
        System.out.println(Test.toString());
        System.out.println(Test.getArea());
        System.out.println(Test.getPerimentr());
    }
}
