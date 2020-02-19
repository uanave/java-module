package academy.everyonecodes.java.week9.set2.exercise1.Units;

import java.math.BigDecimal;
import java.util.Objects;

public class MoneyUnit {
    private BigDecimal value;
    private String currency;

    public MoneyUnit(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoneyUnit moneyUnit = (MoneyUnit) o;
        return Objects.equals(value, moneyUnit.value) &&
                Objects.equals(currency, moneyUnit.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }
}
