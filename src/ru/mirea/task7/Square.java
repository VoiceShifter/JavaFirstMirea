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
    void GetLenght() {
        super.GetLenght();
    };

    @Override
    void SetWidth(double aWidth) {
        super.SetWidth(aWidth);
    };

    @Override
    void SetLenght(double aLenght) {
        super.SetLenght(aLenght);
    };

    @Override
    void GetWidth() {
        super.GetWidth();
    }
}
