package academy.everyonecodes.java.christmas.Exercise8;

public class PositionIncrementor {
    public int[] incrementPositionInArray(int position, int[] randomNumbers) {
        int[] incrementedNumbers = randomNumbers;
        incrementedNumbers[position] = incrementedNumbers[position + 1];
        return incrementedNumbers;
    }
}
