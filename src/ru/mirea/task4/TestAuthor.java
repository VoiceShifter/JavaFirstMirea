package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author TestAuthor = new Author("Nikita Crabov", "zixxxota@gmail.com", 'n');
        System.out.println(TestAuthor.GetEmail());
        TestAuthor.setEmail("NeNikitaCrabov@tindeks.yahoooo");
        System.out.println(TestAuthor.GetEmail());
        System.out.println(TestAuthor.GetGender());
        System.out.println(TestAuthor.toString());
    }
}
