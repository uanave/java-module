package academy.everyonecodes.java.evaluation2.optionals.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ScoreCounter {
    private Map<String, Integer> rounds = new HashMap<>();

    public void saveRoundWinner(String name) {
        int score;
        if (rounds.containsValue(name)) {
            rounds.put(name, +1);
        }
        System.out.println(rounds);
    }

    public String getWinner() {
        return rounds.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst()
                .get().getKey();
    }
}

