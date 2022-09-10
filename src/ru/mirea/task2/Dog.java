package ru.mirea.task2;

public class Dog
{
    String NickName;
    int Age;
    Dog(String nickname, int age)
    {
        NickName = nickname;
        Age = age;
    }
    public void SetName(String NewName)
    {
        this.NickName = NewName;
    };
    public void SetAge(int NewAge)
    {
        this.Age = NewAge;
    };
    public void TellAge()
    {
        System.out.print("Human age = " + this.Age * 7 + '\n');
    }

    @Override
    public String toString()
    {
        return "Dog " + NickName + " is " + Age + " years old \n" ;
    }

    public static void main(String[] args) {
        Dog testdog = new Dog("Doggo", 12);
        testdog.TellAge();
        System.out.println(testdog.toString());
    }
}
