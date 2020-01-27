package academy.everyonecodes.java.week6.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PublishedPostCounterTest {
    PublishedPostCounter publishedPostCounter = new PublishedPostCounter();

    @Test
    void countOneSimilarDate() {
        Blog input = new Blog("ABC", List.of(
                new Post("Apple", "Apples are great", new Date(1, 2, 2020), true),
                new Post("Banana", "Bananas are ok", new Date(5, 3, 2020), false)
        ), new Date(1, 2, 2020));

        int result = 1;

        int expected = publishedPostCounter.count(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void countMultipleDates() {
        Blog input = new Blog("ABC", List.of(
                new Post("Apple", "Apples are great", new Date(1, 2, 2020), true),
                new Post("Banana", "Bananas are ok", new Date(5, 3, 2020), false),
                new Post("Kiwi", "Kiwi contains actinidain", new Date(1, 2, 2020), true),
                new Post("Banana", "Bananas are ok", new Date(1, 2, 2020), true)
        ), new Date(1, 2, 2020));

        int result = 3;

        int expected = publishedPostCounter.count(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void countNoDate() {
        Blog input = new Blog("ABC", List.of(
                new Post("Apple", "Apples are great", new Date(7, 2, 2020), true),
                new Post("Banana", "Bananas are ok", new Date(5, 3, 2020), false),
                new Post("Kiwi", "Kiwi contains actinidain", new Date(4, 2, 2020), true),
                new Post("Banana", "Bananas are ok", new Date(6, 2, 2020), true)
        ), new Date(1, 2, 2020));

        int result = 0;

        int expected = publishedPostCounter.count(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void countEmptyList() {
        Blog input = new Blog("ABC", List.of(), new Date(1, 2, 2020));

        int result = 0;

        int expected = publishedPostCounter.count(input);
        Assertions.assertEquals(expected, result);
    }
}
