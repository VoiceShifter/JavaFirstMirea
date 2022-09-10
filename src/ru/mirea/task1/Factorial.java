package ru.mirea.task1;

public class Factorial
{
    int FindFactorial(int A)
    {
        if (A == 0)
        {
            return 0;
        }
        else if (A == 1)
        {
            return 1;
        }
        else {
            int Result = 1;
            for (int I = 2; I <= A; I++) {
                Result = Result * I;
            }
            return Result;
        }
    }

    public static void main(String[] args) {
        Factorial Test = new Factorial();
        System.out.println(Test.FindFactorial(5));
    }
}
