package ru.mirea.task6;

public class TestClassPrice implements Priceable {
    double Price;
    TestClassPrice(double aPrice)
    {
        this.Price = aPrice;
    }

    @Override
    public void getPrice() {
        System.out.println (Price);
    }

    public static void main(String[] args) {
        TestClassPrice Test = new TestClassPrice(420.69);
        Test.getPrice();
    }
}
