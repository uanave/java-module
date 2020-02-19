package academy.everyonecodes.java.week9.set2.exercise1;

import academy.everyonecodes.java.week9.set2.exercise1.Units.EuroUnits;
import academy.everyonecodes.java.week9.set2.exercise1.Units.MoneyUnit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ChangeUnitsCalculator {
    List<MoneyUnit> units = EuroUnits.get();

    public List<MoneyUnit> calculate(BigDecimal amount) {
        List<MoneyUnit> neededUnits = new ArrayList<>();
        BigDecimal currentAmount = amount;
        for (MoneyUnit unit : units) {
            int result = currentAmount.divide(unit.getValue(), RoundingMode.DOWN).intValue();
            if (result >= 1) {
                neededUnits.add(unit);
                currentAmount = currentAmount.remainder(unit.getValue());
            }
        }
        return neededUnits;
    }
}

/*
public class ChangeUnitsCalculator {
    private List<MoneyUnit> units = EuroUnits.get();

    public List<MoneyUnit> calculate(Double change) {
        List<MoneyUnit> notes = new ArrayList<>();
        while (change > 0) {
            for (MoneyUnit unit : units) {
                while(unit.getValue() <= change) {
                    notes.add(unit);
                    change = BigDecimal.valueOf(change)
                            .subtract(BigDecimal.valueOf(unit.getValue()))
                            .doubleValue();
                }
            }
        }
        return notes;
    }
}
*/
