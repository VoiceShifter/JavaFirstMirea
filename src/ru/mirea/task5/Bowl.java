package ru.mirea.task5;


public class Bowl extends Dish {
    double V;

    Bowl(double aLoverRadious, String aMaterial, double aV) {
        super(aLoverRadious, aMaterial);
        this.V = aV;
    }
    void BreakBowl(){
        this.LoverRadious =0;
        this.Material = "Doesnt matter";
        this.V = 0;
    }

    @Override
    public String toString() {
        return "Bowl:" + "Radious =" + LoverRadious + '\n' + "Material =" + Material + '\n' + "Capacity =" + V;
    }

    public static void main(String[] args) {
        Bowl TestBowl = new Bowl(13, "Metal", 4);
        System.out.println(TestBowl.toString());
    }
}
