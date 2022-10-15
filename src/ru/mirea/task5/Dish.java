package ru.mirea.task5;

public  abstract class Dish {
    double LoverRadious;
    String Material;
    Dish(double aLoverRadious, String aMaterial){
        this.LoverRadious = aLoverRadious;
        this.Material = aMaterial;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "LoverRadious=" + LoverRadious +
                ", Material='" + Material + '\'' +
                '}';
    }
}
