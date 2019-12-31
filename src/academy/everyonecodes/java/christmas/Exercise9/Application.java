package academy.everyonecodes.java.christmas.Exercise9;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        String[] photoNames = {"DSC0001.jpg", "DSC0002.jpg", "DSC0003.jpg", "DSC0004.jpg"};
        List<String> photoNamesRenamed = new ArrayList<>();
        for (String photoName : photoNames) {
            String renamedPhoto = photoName.replaceAll("jpg", "png");
            photoNamesRenamed.add(renamedPhoto);
        }

        System.out.println(photoNamesRenamed);
    }
}
