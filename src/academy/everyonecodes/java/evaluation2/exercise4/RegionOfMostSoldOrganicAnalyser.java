package academy.everyonecodes.java.evaluation2.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RegionOfMostSoldOrganicAnalyser implements AvocadoAnalyser {
    @Override
    public String analyse(List<AvocadoEntry> avocados) {
        Optional<AvocadoEntry> regionWithMostOrganicSales = avocados.stream()
                .filter(avocadoEntry -> (!avocadoEntry.getRegion().equals("TotalUS")) && (avocadoEntry.getType().equals("organic")))
                .max(Comparator.comparing(AvocadoEntry::getTotalSold));
        if (regionWithMostOrganicSales.isPresent()) {
            String region = regionWithMostOrganicSales.get().getRegion();
            double totalSold = regionWithMostOrganicSales.get().getTotalSold();
            return "Region of most sold organic is: " + region + " with " + totalSold;
        }
        return "Region of most sold organic is: Result not found";
    }
}
