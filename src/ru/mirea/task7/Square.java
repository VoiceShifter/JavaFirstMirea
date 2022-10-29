package ru.mirea.task7;

public class Square extends Recrangle {
    Square(double Side, String aColor, boolean aFilled){
          super(Side, Side, aColor, aFilled);
    }
    Square(){
        super(0, 0, "White", false);
    }
    Square(double Side){
        super(Side, Side, "White", false);
    }

    @Override
    void setWidth(double aWidth) {
        super.setWidth(aWidth);
        super.setLenght(aWidth);
    }

    @Override
    void setLenght(double aWidth) {
        super.setWidth(aWidth);
        super.setLenght(aWidth);
    }

    public static void main(String[] args) {
        Square test = new Square(9);
        test.getLenght();
        test.setLenght(13);
        test.getWidth();
    }
}
