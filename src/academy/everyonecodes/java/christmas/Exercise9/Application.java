package academy.everyonecodes.java.christmas.Exercise9;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<String> photoNames = List.of("DSC0001.jpg", "DSC0002.jpg", "DSC0003.jpg", "DSC0004.jpg");
        List<String> photoNamesRenamed = new ArrayList<>(photoNames.size());
        for (String photoName : photoNames) {
            photoName.replaceAll("jpg", "png");
            photoNamesRenamed.add(photoName);
        }
        System.out.println(photoNamesRenamed);
    }
}
