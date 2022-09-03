package ru.mirea.task1;


public class StatitIntArray
{
    public int[] Array = {1, 2, 3, 5, 6};
/*
    public void Func2(String[] args)
    {
        for(Object a : args)
        {
            System.out.println(a);
        }

    }
*/
    public void Function()
    {
        int Result =0 ;
        for (int n :this.Array)
        {
            Result += n;
        }
        System.out.println(Result);
        Result =0;
        int Index =0;
        while (Index < this.Array.length)
        {
            Result+=this.Array[Index];
            Index++;
        }
        System.out.println(Result);
        Result = 0;
        Index = 0;
        do
            {
                Result+= this.Array[Index];
                Index++;
            }
        while(Index < this.Array.length);
        System.out.println(Result);

    }
public static void main(String[] args)
        {
        StatitIntArray test = new StatitIntArray();
        test.Function();
        }
};


