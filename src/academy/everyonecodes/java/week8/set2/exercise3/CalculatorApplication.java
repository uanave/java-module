package academy.everyonecodes.java.week8.set2.exercise3;

import academy.everyonecodes.java.week8.set2.exercise3.operators.Operator;
import academy.everyonecodes.java.week8.set2.exercise3.operators.Operators;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        List<Operator> operators = Operators.get();
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operation:");
        String answer = scanner.nextLine();

        Optional<Operator> symbol = operators.stream()
                .filter(operator -> answer.contains(operator.getSymbol()))
                .findFirst();

        List<String> numbers = List.of(answer.split(" "));
        if (numbers.size() == 3) {
            double number1 = 0.0;
            double number2 = 0.0;
            try {
                number1 = Double.parseDouble(numbers.get(0));
                number2 = Double.parseDouble(numbers.get(2));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (symbol.isPresent()) {
                Calculation calculation = new Calculation(symbol.get().getSymbol(), number1, number2);
                Optional<Double> result = calc.calculate(calculation);
                result.ifPresent(aDouble -> System.out.println("Solution : " + aDouble));
            } else {
                System.out.println("Solution: operation not available");
            }

        } else {
            System.out.println("Solution: operation not available");
        }
    }
}


