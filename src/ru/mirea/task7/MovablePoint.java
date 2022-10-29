package ru.mirea.task7;

public class MovablePoint implements Movable {
    int X;
    int Y;
    int SpeedX;
    int SpeedY;

    public MovablePoint(int X, int Y, int SpeedX, int SpeedY) {
        this.X = X;
        this.Y = Y;
        this.SpeedX = SpeedX;
        this.SpeedY = SpeedY;
    }

    public String ToString() {
        return "MovablePoint" + "\n" +
                "    X = " + X + "\n" +
                "    Y = " + Y + "\n" +
                "    SpeedX = " + SpeedX + "\n" +
                "    SpeedY = " + SpeedY;
    }

    @Override
    public void MoveUp() {
        Y -= SpeedY;
    }

    @Override
    public void MoveDown() {
        Y += SpeedY;
    }

    @Override
    public void MoveLeft() {
        X -= SpeedX;
    }

    @Override
    public void MoveRight() {
        X += SpeedX;
    }
}

