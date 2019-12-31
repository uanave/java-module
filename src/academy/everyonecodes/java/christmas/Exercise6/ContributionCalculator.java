package academy.everyonecodes.java.christmas.Exercise6;

import java.util.List;

public class ContributionCalculator {
    public int calculateTotalContribution(List<Integer> contributions) {
        int totalContribution = 0;
        for (int contribution : contributions) {
            totalContribution += contribution;
        }
        return totalContribution;
    }
}
