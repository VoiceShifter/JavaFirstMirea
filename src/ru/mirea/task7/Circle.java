package ru.mirea.task7;

public class Circle extends Shape {
    double Radious;
    Circle(){
        super();
        this.Radious =0;

    }
    Circle(double aRadious, boolean aFilled, String aColor){
        super(aColor, aFilled);
        this.Radious = aRadious;

    }

    double GetArea() {
        return 3.14*Radious*Radious;
    }

    double GetPerimentr() {
        return 2*3.14*Radious;
    }

    public String toString() {
        return "Circle: " +
                "Radious=" + Radious +
                ", Color='" + Color + '\'' +
                ", Filled=" + Filled;
    }

    public static void main(String[] args) {
        Circle Test = new Circle(13, false, "Black");
        System.out.println (Test.toString());
        System.out.println(Test.GetArea());
        System.out.println(Test.GetPerimentr());
    }
}
