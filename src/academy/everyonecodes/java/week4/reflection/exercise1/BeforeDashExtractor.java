package academy.everyonecodes.java.week4.reflection.exercise1;

public class BeforeDashExtractor {
    public String extract(String text) {
        while (text.length() > 0) {
            String textWithoutDash = "";
            for (int i = 0, j = 1; i <= text.length(); i++, j++) {
                String letter = text.substring(i, j);
                if (letter.equals("-")) {
                    return textWithoutDash;
                } else {
                    textWithoutDash = textWithoutDash + letter;
                }
            }
            return textWithoutDash;
        }
        return "";
    }
}
