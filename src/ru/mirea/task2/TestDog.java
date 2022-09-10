package ru.mirea.task2;

import java.util.Arrays;

public class TestDog
{
    public Dog[] DogArray;
    TestDog (Dog[] Array)
    {
        DogArray = Array;
    }
    public void DodAppend(Dog[] ExtraDogs)
    {
        Dog[] NewDogArray = new Dog[ExtraDogs.length + DogArray.length];
        for(int i = 0; i < DogArray.length; i++)
        {
            NewDogArray[i] = DogArray[i];
        }
        for(int i = DogArray.length; i < NewDogArray.length; i++)
        {
            NewDogArray[i] = ExtraDogs[i];
        }
    }



    public static void main(String[] args) {
        Dog[] TestDogArray = new Dog []{new Dog("Bunny", 2) new Dog("Doggo", 3) };
        TestDog A = new TestDog(TestDogArray);
        Dog[] ExtraDogsArray = new Dog[] {new Dog("Funny", 4)};
        A.DodAppend(ExtraDogsArray);
        for (Dog dog : A.DogArray)
        {
            dog.toString();
        }
    }
}
