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

    private static Stream<Arguments> parameters() {
        Person person1 = new Person("Lena", 22);
        Person person2 = new Person("Michel", 21);
        Person person3 = new Person("Lena", 22);
        Person person4 = new Person("Michel", 21);
        Person person5 = new Person("Lena", 32);

        return Stream.of(
                Arguments.of(List.of(person1, person2), List.of(person1, person2, person3, person4)),
                Arguments.of(List.of(person1, person5, person2), List.of(person1, person2, person3, person4, person5)),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(List<Person> expected, List<Person> input) {
        List<Person> result = remover.remove(input);
        assertEquals(expected, result);
    }

}