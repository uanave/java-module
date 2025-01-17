package academy.everyonecodes.java._optionals.maps.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsersDataStoreTest {
    private UsersDataStore usersDataStore = new UsersDataStore();

    private static Stream<Arguments> parameters() {
        User user1 = new User("tom123", "1234567890@1");
        User user2 = new User("john00", "21312#@!!$");

        return Stream.of(
                Arguments.of(Optional.of(user1), "tom123"),
                Arguments.of(Optional.of(user2), "john00"),
                Arguments.of(Optional.empty(), "george")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(Optional<User> expected, String name) {
        Optional<User> oResult = usersDataStore.getUserByUsername(name);

        assertEquals(expected.hashCode(), oResult.hashCode());
    }
}