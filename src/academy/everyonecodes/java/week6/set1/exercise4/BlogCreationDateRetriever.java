package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Date;

import java.util.Optional;

public class BlogCreationDateRetriever {
    public Optional<Date> retrieve(Website website) {
        if (website.getBlog().isPresent()) {
            return Optional.of(website.getBlog().get().getDate());
        }
        return Optional.empty();
    }
}
