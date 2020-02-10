package academy.everyonecodes.java.optionals.Sets.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonListDuplicateRemoverTest {
    PersonListDuplicateRemover remover = new PersonListDuplicateRemover();

    private static Stream<Arguments> persons() {
        Person person1 = new Person("Oana", 22);
        Person person2 = new Person("Mihai", 21);
        Person person3 = new Person("Oana", 22);
        Person person4 = new Person("Mihai", 21);
        Person person5 = new Person("Oana", 32);

        return Stream.of(
                Arguments.of(Set.of(person1, person2), List.of(person1, person2, person3, person4)),
                Arguments.of(Set.of(person3, person4, person5), List.of(person1, person2, person3, person4, person5)),
                Arguments.of(Set.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("persons")
    void test(Set<Person> expected, List<Person> input) {
        Set<Person> result = remover.remove(input);
        assertEquals(expected, result);
    }

}