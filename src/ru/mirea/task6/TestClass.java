package ru.mirea.task6;

public class TestClass implements Nameable {
    String Name;
    TestClass(String aName){
        this.Name = aName;
    }
    public void getName() {
        System.out.println(Name);
    }

    public static void main(String[] args) {
        TestClass Test = new TestClass("TestName");
        Test.getName();
    }
}
