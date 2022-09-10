package ru.mirea.task1;


import java.util.Arrays;
import java.util.Random;

public class IntArraySort {
    public static void main(String[] args) {
        int[] Array = new int[10];
        for (int I = 0; I < 10; I++)
        {
            Array[I] = (int)(Math.random() * 100);
            System.out.println(Array[I]);
        }
        int[] Array2 = new int[10];
        System.out.println('\n');
        Random RandomGenerator = new Random();
        for (int I = 0; I < 10; I++)
        {
            Array2[I] = RandomGenerator.nextInt(100);
            System.out.println(Array2[I]);
        }

        Arrays.sort(Array);
        Arrays.sort(Array2);
        for(int a : Array)
        {
            System.out.print(a + " ");
        };
        System.out.println('\n');
        for(int b : Array2)
        {
            System.out.print(b + " ");
        };


    };
}