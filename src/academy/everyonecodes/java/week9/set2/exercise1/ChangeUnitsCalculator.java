package academy.everyonecodes.java.week9.set2.exercise1;

import academy.everyonecodes.java.week9.set2.exercise1.Units.EuroUnits;
import academy.everyonecodes.java.week9.set2.exercise1.Units.MoneyUnit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ChangeUnitsCalculator {
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
}
