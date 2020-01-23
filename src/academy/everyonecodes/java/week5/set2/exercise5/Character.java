package academy.everyonecodes.java.week5.set2.exercise5;

public class Character {
    private String name;
    private int bookOfDeath;
    private String gender;

    public Character(String name, int bookTitle, String gender) {
        this.name = name;
        this.bookOfDeath = bookTitle;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getBookOfDeath() {
        return bookOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "... where '" + this.name + "' is the name, he dies in book " + this.bookOfDeath + " and he is " + this.gender + ".";
    }
}
