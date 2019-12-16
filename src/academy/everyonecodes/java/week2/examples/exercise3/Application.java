package academy.everyonecodes.java.week2.examples.exercise3;

import java.awt.print.Book;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        BookEntry theIdiot = new BookEntry("The Idiot", "Fyodor Dostoevsky", 1869);
        BookEntry thePlague = new BookEntry("The Plague", "Albert Camus", 1947);
        BookEntry germinal = new BookEntry("Germinal", "Emile Zola", 1885);

        List<BookEntry> bookEntries = List.of(theIdiot, thePlague, germinal);

        Library everyoneReadsLibrary = new Library("everyone reads", bookEntries);

        for (BookEntry book : everyoneReadsLibrary.getBooks()) {
            System.out.println("'" + book.getTitle() + "' was authored by " + book.getAuthor());
        }
    }
}
