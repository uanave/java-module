package academy.everyonecodes.java.christmas.Exercise6;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ContributionCalculator contributionCalculator = new ContributionCalculator();
        List<Integer> contributions = List.of(23, 54, 12, 3, 11);
        int totalContributions = contributionCalculator.calculateTotalContribution(contributions);
    }
}