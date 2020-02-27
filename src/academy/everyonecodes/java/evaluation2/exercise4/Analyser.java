package academy.everyonecodes.java.evaluation2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Analyser {
    private LowestAveragePriceAnalyser lowestAveragePriceAnalyser = new LowestAveragePriceAnalyser();
    private RegionOfMostSoldOrganicAnalyser regionOfMostSoldOrganicAnalyser = new RegionOfMostSoldOrganicAnalyser();

    public List<String> analyse(List<AvocadoEntry> avocados) {
        List<String> lowestPriceAndMostSold = new ArrayList<>();
        String lowestPrice = lowestAveragePriceAnalyser.analyse(avocados);
        String mostSoldRegion = regionOfMostSoldOrganicAnalyser.analyse(avocados);
        lowestPriceAndMostSold.add(lowestPrice);
        lowestPriceAndMostSold.add(mostSoldRegion);
        return lowestPriceAndMostSold;
    }
}
