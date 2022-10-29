package ru.mirea.task7;

public class MovableCircle implements Movable {
    private int Radius;
    private MovablePoint Center;

    public MovableCircle(int X, int Y, int SpeedX, int SpeedY, int Radius) {
        Center.X = X;
        Center.Y = Y;
        Center.SpeedX = SpeedX;
        Center.SpeedY = SpeedY;
        this.Radius = Radius;
    }

    public String ToString() {
        return "MovableCircle" + "\n" +
                "    X = " + Center.X + "\n" +
                "    Y = " + Center.Y + "\n" +
                "    SpeedX = " + Center.SpeedX + "\n" +
                "    SpeedY = " + Center.SpeedY + "\n" +
                "    Radius = " + Radius;
    }

    @Override
    public void MoveUp() {
        Center.MoveUp();
    }

    @Override
    public void MoveDown() {
        Center.MoveDown();
    }

    @Override
    public void MoveLeft() {
        Center.MoveLeft();
    }

    @Override
    public void MoveRight() {
        Center.MoveRight();
    }
}