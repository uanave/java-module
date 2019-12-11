package academy.everyonecodes.java.week1.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class CombineLists {
    public static List<String> combine(List<String> first, List<String> second) {
        List<String> combinedElements = new ArrayList<>();
        int size1 = first.size();
        int size2 = second.size();
        int index = 0;
        while (index < size1 || index < size2) {
            if (index < size1) {
                String currentElement = first.get(index);
                combinedElements.add(currentElement);
            }
            if (index < size2) {
                String currentElement = second.get(index);
                combinedElements.add(currentElement);
            }
            index++;
        }
        return combinedElements;
    }

    public static void main(String[] args) {
        List<String> first = new ArrayList<>();
        first.add("dog");
        first.add("cat");
        first.add("bird");
        first.add("bear");
        List<String> second = new ArrayList<>();
        second.add("table");
        second.add("chair");
        second.add("lamp");
        for (String word : combine(first, second)) {
            System.out.println(word);
        }
    }
}
