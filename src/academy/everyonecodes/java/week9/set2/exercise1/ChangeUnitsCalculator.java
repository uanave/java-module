package academy.everyonecodes.java.week9.set2.exercise1;

import academy.everyonecodes.java.week9.set2.exercise1.Units.EuroUnits;
import academy.everyonecodes.java.week9.set2.exercise1.Units.MoneyUnit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class ChangeUnitsCalculator {

    private List<MoneyUnit> units = EuroUnits.get();

    public List<MoneyUnit> calculate(double amount) {
        List<MoneyUnit> change = new ArrayList<>();
        while (amount > 0) {
            MoneyUnit unit = findBiggestUnit(amount);
            amount = subtract(amount, unit);
            change.add(unit);
        }
        return change;
    }

    private double subtract(double amount, MoneyUnit unit) {
        return BigDecimal.valueOf(amount).subtract(BigDecimal.valueOf(unit.getValue())).doubleValue();
    }

    private MoneyUnit findBiggestUnit(double amount) {
        return units.stream()
                .sorted(comparing(MoneyUnit::getValue).reversed())
                .filter(unit -> unit.getValue() <= amount)
                .findFirst().orElseThrow();
    }
}

/*public class ChangeUnitsCalculator {
    List<MoneyUnit> units = EuroUnits.get();

    public List<MoneyUnit> calculate(double amount) {
        List<MoneyUnit> neededUnits = new ArrayList<>();
        BigDecimal currentAmount = BigDecimal.valueOf(amount);
        for (MoneyUnit unit : units) {
            BigDecimal unitValue = BigDecimal.valueOf(unit.getValue());
            int result = currentAmount.divide(unitValue, RoundingMode.DOWN).intValue();
            if (result >= 1) {
                for (int i = 0; i < result; i++) {
                    neededUnits.add(unit);
                }
                currentAmount = currentAmount.remainder(unitValue);
            }
        }
        return neededUnits;
    }
}*/