package academy.everyonecodes.java.evaluation2.optionals.maps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScoreCounterTest {
    ScoreCounter counter = new ScoreCounter();

    @Test
    void test() {
        counter.saveRoundWinner("Ana");
        counter.saveRoundWinner("David");
        counter.saveRoundWinner("Ana");

        String result = counter.getWinner();
        System.out.println(result);
        String expected = "Ana";
        Assertions.assertEquals(expected, result);

    }
}