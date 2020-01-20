package academy.everyonecodes.java.week5.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class FirstByAgeFinderTest {
    FirstByAgeFinder firstByAgeFinder = new FirstByAgeFinder();

    @Test
    void find() {
        Person bob = new Person("Bob", 12);
        Person michael = new Person("Michael", 16);
        List<Person> input1 = List.of(bob, michael);

        int inputAge = 12;
        Optional<Person> oResult = firstByAgeFinder.find(input1, inputAge);

        Person expected = bob;

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getAge(), oResult.get().getAge());
        Assertions.assertEquals(expected.getName(), oResult.get().getName());
    }

    @Test
    void findNoPersonWithAge() {
        Person bob = new Person("Bob", 17);
        Person michael = new Person("Michael", 16);
        List<Person> input1 = List.of(bob, michael);

        int inputAge = 12;
        Optional<Person> oResult = firstByAgeFinder.find(input1, inputAge);
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void findEmpty() {
        List<Person> input = List.of();
        int inputAge = 12;

        Optional<Person> oResult = firstByAgeFinder.find(input, inputAge);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
