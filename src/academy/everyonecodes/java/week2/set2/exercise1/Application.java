package academy.everyonecodes.java.week2.set2.exercise1;

public class Application {
    public static void main(String[] args) {
        Article article = new Article("Bad News", "blablablablablablablablablablablablablablabla");
        Printer printer = new Printer();
        printer.print(article);
    }
}
