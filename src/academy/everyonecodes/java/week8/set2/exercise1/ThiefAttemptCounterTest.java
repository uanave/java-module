package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ThiefAttemptCounterTest {
    ThiefAttemptCounter counter = new ThiefAttemptCounter();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                arguments(20, new BeginnerThief(), new Safe(10, 20)),
                arguments(10, new AdvancedThief(), new Safe(10, 20)),
                arguments(7, new AdvancedThief(), new Safe(10, 13)),
                arguments(0, new BeginnerThief(), new Safe(10, 0)),
                arguments(1, new BeginnerThief(), new Safe(10, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int expected, Thief thief, Safe safe) {

        int result = counter.countAttempts(thief, safe);
        assertEquals(expected, result);

    }


}