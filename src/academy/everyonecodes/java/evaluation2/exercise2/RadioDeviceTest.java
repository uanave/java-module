package academy.everyonecodes.java.evaluation2.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioDeviceTest {
    RadioDevice device = new RadioDevice();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("Hokopoko"), new RadioMessage("Hokopoko", 4200)),
                Arguments.of(Optional.of("Pikachu"), new RadioMessage("Pikachu", 1900)),
                Arguments.of(Optional.of(""), new RadioMessage("", 1900)),
                Arguments.of(Optional.empty(), new RadioMessage("", 1000)),
                Arguments.of(Optional.empty(), new RadioMessage("Hokopoko", 960))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(Optional<String> expected, RadioMessage input) {
        Optional<String> result = device.receive(input);

        assertEquals(expected.hashCode(), result.hashCode());
    }


}