package ru.mirea.task4;

public class Author {
    String Name;
    String Email;
    char Gender;

    Author(String aName, String aEmail, char aGender) {
        Name = aName;
        Email = aEmail;
        Gender = aGender;
    }

    public String GetName() {
        return this.Name;
    }

    public String GetEmail() {
        return this.Email;
    }

    public char GetGender() {
        return this.Gender;
    }

    public void setEmail(String aEmail) {
        this.Email = aEmail;
    }

    @Override
    public String toString() {
        return "Author" +
                "Name-'" + Name + '\'' +
                ", Email-'" + Email + '\'' +
                ", Gender-" + Gender;
    }
}
