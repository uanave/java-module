package academy.everyonecodes.java.evaluation1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthorEmailRetrieverTest {
    AuthorEmailRetriever authorEmailRetriever = new AuthorEmailRetriever();

    @Test
    void retrieveEmail() {
        Comment input = new Comment("ABC", "blablabla",
                new User("pow@yahoo.com", "12344560"));

        String expected = "pow@yahoo.com";

        String result = authorEmailRetriever.retrieve(input);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void retrieveEmpty() {
        Comment input = new Comment("ABCD", "blablabla",
                new User("", "12344560"));

        String expected = "";

        String result = authorEmailRetriever.retrieve(input);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void retrieveWrong() {
        Comment input = new Comment("ABCD", "blablabla",
                new User("some-email-com", "12344560"));

        String expected = "some-email-com";

        String result = authorEmailRetriever.retrieve(input);
        Assertions.assertEquals(expected, result);
    }
}