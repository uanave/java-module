package academy.everyonecodes.java.week3.set2.exercise6;

public class StringStorageSizeCalculator {
    public int calculate(String stringAndHash) {
        int bytesPerString = stringAndHash.length() * 2;
        int hashSize = 4;
        return (bytesPerString + hashSize) * 8;
    }
}
