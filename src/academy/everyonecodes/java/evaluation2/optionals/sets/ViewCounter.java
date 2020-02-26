package academy.everyonecodes.java.evaluation2.optionals.sets;

import java.util.HashSet;
import java.util.Set;

public class ViewCounter {

    private static Set<String> totalViews = new HashSet<>();

    public void addViewerIPAddress(String input) {
        totalViews.add(input);
    }

    public int countUniqueViews() {
        return totalViews.size();
    }
}
