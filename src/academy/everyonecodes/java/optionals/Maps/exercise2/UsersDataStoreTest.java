package academy.everyonecodes.java.optionals.Maps.exercise2;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsersDataStoreTest {
    private UsersDataStore usersDataStore = new UsersDataStore();

    @Test
    void test() {
        String input = "goguGaze";
        Optional<User> oResult = usersDataStore.getUserByUsername(input);
        User expected = new User("goguGaze", "1234567890@1");
        assertTrue(oResult.isPresent());
        assertEquals(expected, oResult.get());
    }
}