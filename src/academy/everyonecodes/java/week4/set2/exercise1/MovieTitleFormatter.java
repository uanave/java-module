package academy.everyonecodes.java.week4.set2.exercise1;

public class MovieTitleFormatter {
    public String format(String text) {
        StringCapitalizer stringCapitalizer = new StringCapitalizer();
        text = text.toLowerCase();
        String titleCapitalized = "";
        if (text.contains(" ")) {
            String[] movieTitle = text.split(" ");
            for (String title : movieTitle) {
                titleCapitalized += stringCapitalizer.capitalize(title) + " ";
            }
        } else {
            titleCapitalized = stringCapitalizer.capitalize(text);
        }
        return titleCapitalized.trim();
    }
}
