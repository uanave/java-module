package academy.everyonecodes.java.christmas.Exercise8;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] randomNumbers = {1, 2, 3, 4, 5, 6};
        PositionIncrementor positionIncrementor = new PositionIncrementor();
        int[] incrementedNumbers = positionIncrementor.incrementPositionInArray(2, randomNumbers);
        System.out.println(Arrays.toString(incrementedNumbers));
    }
}
