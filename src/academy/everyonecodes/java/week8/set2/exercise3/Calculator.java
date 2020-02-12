package academy.everyonecodes.java.week8.set2.exercise3;

import academy.everyonecodes.java.week8.set2.exercise3.operators.Operator;
import academy.everyonecodes.java.week8.set2.exercise3.operators.Operators;

import java.util.List;
import java.util.Optional;

public class Calculator {
    private List<Operator> operators = Operators.get();

    public Optional<Double> calculate(Calculation calculation) {
        String symbol = calculation.getSymbol();
        for (Operator operator : operators) {
            if (symbol.equals(operator.getSymbol())) {
                double result = operator.operate(calculation.getNumber1(), calculation.getNumber2());
                return Optional.of(result);

            }
        }
        return Optional.empty();
    }
}
