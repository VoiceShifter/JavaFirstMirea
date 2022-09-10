package ru.mirea.task2;

public class Book
{
    int Pages;
    Book(int pages)
    {
        Pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Pages=" + Pages +
                '}';
    }
}
