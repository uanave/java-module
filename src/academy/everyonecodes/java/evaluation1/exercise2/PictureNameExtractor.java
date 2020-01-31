package academy.everyonecodes.java.evaluation1.exercise2;

public class PictureNameExtractor {
    public String extract(String name) {
        name = name.toLowerCase();
        name = name.substring(8, name.length());
        name = name.replaceAll("pic.jpg", "");
        String finalName = name.replaceAll("-", " ");
        return finalName;
    }
}
