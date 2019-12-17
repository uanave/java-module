package academy.everyonecodes.java.week2.set2.exercise2;

public class Application {
    public static void main(String[] args) {
        Magazine magazine = Editor.writeMagazine();
        Printer.print(magazine);
    }
}
