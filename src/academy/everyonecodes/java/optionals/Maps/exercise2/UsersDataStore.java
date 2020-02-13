package academy.everyonecodes.java.optionals.Maps.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UsersDataStore {
    private Map<String, User> users;

    public UsersDataStore() {
        users = new HashMap<>();
        User user1 = new User("goguGaze", "1234567890@1");
        User user2 = new User("gigiChelu", "21312#@!!$");
        users.put(user1.getUsername(), user1);
        users.put(user2.getUsername(), user2);
    }

    public Optional<User> getUserByUsername(String username) {
        if (users.containsKey(username)) {
            return Optional.of(users.get(username));

        }
        return Optional.empty();

    }
}
