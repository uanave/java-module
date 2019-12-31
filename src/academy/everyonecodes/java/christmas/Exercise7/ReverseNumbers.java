package academy.everyonecodes.java.christmas.Exercise7;

public class ReverseNumbers {
    public int[] reverse(int[] randomNumbers) {
        int[] result = new int[randomNumbers.length];
        for (int i = 0, j = result.length - 1; i < randomNumbers.length; i++, j--) {
            result[j] = randomNumbers[i];
        }

        return result;
    }
}
