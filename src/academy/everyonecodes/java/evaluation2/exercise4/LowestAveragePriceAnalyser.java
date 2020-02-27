package academy.everyonecodes.java.evaluation2.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LowestAveragePriceAnalyser implements AvocadoAnalyser {
    @Override
    public String analyse(List<AvocadoEntry> avocados) {
        Optional<AvocadoEntry> lowestAveragePrice = avocados.stream()
                .min(Comparator.comparing(AvocadoEntry::getAveragePrice));
        if (lowestAveragePrice.isPresent()) {
            double price = lowestAveragePrice.get().getAveragePrice();
            int year = lowestAveragePrice.get().getYear();
            return "Lowest average price is: " + price + " on " + year;
        }
        return "Lowest average price is: Result not found";
    }
}
