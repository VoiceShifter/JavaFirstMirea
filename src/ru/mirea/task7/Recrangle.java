package ru.mirea.task7;

public class Recrangle extends Shape {
    double Width;
    double Lenght;
    Recrangle(double aWidth, double aLenght, String aColor, boolean aFilled){
        super(aColor, aFilled);
        this.Lenght = aLenght;
        this.Width = aWidth;

    }
    void SetWidth(double aWidth){
        this.Width = aWidth;
    }
    void GetWidth(){
        System.out.println(this.Width);
    }
    void SetLenght(double aLenght){
        this.Lenght = aLenght;
    }
    void GetLenght(){
        System.out.println(this.Lenght);
    }
    double GetArea() {
        return Width*Lenght;
    }

    double GetPerimentr() {
        return (Width + Lenght)*2;
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
