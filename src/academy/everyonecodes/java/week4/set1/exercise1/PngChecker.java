package academy.everyonecodes.java.week4.set1.exercise1;

public class PngChecker {
    public boolean check(String fileName) {
        int length = fileName.length();
        String end = fileName.substring(length-3, length);
        return end.equalsIgnoreCase("png");
    }
}
