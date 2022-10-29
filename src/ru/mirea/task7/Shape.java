package ru.mirea.task7;

public abstract class Shape {
    String Color;
    boolean Filled;

    Shape() {
        this.Color = "White";
        this.Filled = false;
    }

    Shape(String aColor, boolean aFilled) {
        this.Color = aColor;
        this.Filled = aFilled;
    }

    public String getColor() {
        return Color;
    }

    ;

    public void setColor(String color) {
        Color = color;
    }

    ;

    public boolean isFilled() {
        return Filled;
    }

    ;

    public void setFilled(boolean filled) {
        Filled = filled;
    }

    ;

    abstract double getArea();

    abstract double getPerimentr();

    @Override
    public abstract String toString();
}
