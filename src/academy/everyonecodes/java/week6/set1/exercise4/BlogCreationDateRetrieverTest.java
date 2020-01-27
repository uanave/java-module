package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;
import academy.everyonecodes.java.week6.set1.exercise3.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class BlogCreationDateRetrieverTest {
    BlogCreationDateRetriever blogCreationDateRetriever = new BlogCreationDateRetriever();

    @Test
    void retrieveEmpty() {
        Website input = new Website("www.blabla.com", "Lorem Ipsum is simply dummy text of the printing.",
                Optional.empty());
        Optional<Date> result = blogCreationDateRetriever.retrieve(input);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void retrieveWithOptional() {
        Blog blog = new Blog("ABC", List.of(new Post("Apple", "Apples are great", new Date(1, 2, 2020), true),
                new Post("Banana", "Bananas are ok", new Date(5, 3, 2020), false)), new Date(1, 2, 2020));

        Website input = new Website("www.blabla.com", "Lorem Ipsum is simply dummy text of the printing.",
                Optional.of(blog));

        Date expected = new Date(1, 2, 2020);

        Optional<Date> result = blogCreationDateRetriever.retrieve(input);
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected.getDay(), result.get().getDay());
        Assertions.assertEquals(expected.getMonth(), result.get().getMonth());
        Assertions.assertEquals(expected.getYear(), result.get().getYear());
    }
}
