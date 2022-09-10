package ru.mirea.task1;

public class CommandLine
{
    public void Func2(String[] args)
    {
        for(Object a : args)
        {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        CommandLine test = new CommandLine();
        test.Func2(args);
    }
}
