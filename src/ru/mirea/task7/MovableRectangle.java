package ru.mirea.task7;

public class MovableRectangle implements Movable {
    private MovablePoint TopLeft;
    private MovablePoint BottomRight;

    public MovableRectangle(int X1, int Y1, int X2, int Y2, int SpeedX, int SpeedY) {
        TopLeft.X = X1;
        TopLeft.Y = Y1;
        TopLeft.SpeedX = SpeedX;
        TopLeft.SpeedY = SpeedY;
        BottomRight.X = X2;
        BottomRight.Y = Y2;
        BottomRight.SpeedX = SpeedX;
        BottomRight.SpeedY = SpeedY;
    }

    public String ToString() {
        return "MovableRectangle" + "\n" +
                "    X1 = " + TopLeft.X + "\n" +
                "    Y1 = " + TopLeft.Y + "\n" +
                "    X2 = " + BottomRight.X + "\n" +
                "    Y2 = " + BottomRight.Y + "\n" +
                "    SpeedX = " + TopLeft.SpeedX + "\n" +
                "    SpeedY = " + TopLeft.SpeedY;
    }

    @Override
    public void MoveUp() {
        TopLeft.MoveUp();
        BottomRight.MoveUp();
    }

    @Override
    public void MoveDown() {
        TopLeft.MoveDown();
        BottomRight.MoveDown();
    }

    @Override
    public void MoveLeft() {
        TopLeft.MoveLeft();
        BottomRight.MoveLeft();
    }

    @Override
    public void MoveRight() {
        TopLeft.MoveRight();
        BottomRight.MoveRight();
    }
}
