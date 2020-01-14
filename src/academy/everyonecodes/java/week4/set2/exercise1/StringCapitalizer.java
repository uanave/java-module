package academy.everyonecodes.java.week4.set2.exercise1;

public class StringCapitalizer {
    public String capitalize(String text) {
        if (text.length() > 0) {
            String start = text.substring(0, 1);
            start = start.toUpperCase();
            String end = text.substring(1);
            return start + end;
        }
        return "";
    }

}
