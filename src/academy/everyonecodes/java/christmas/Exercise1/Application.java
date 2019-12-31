package academy.everyonecodes.java.christmas.Exercise1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your weight in kilograms?");
        double weight = scanner.nextDouble();
        System.out.println("What is your height in meters?");
        double height = scanner.nextDouble();
        BMICalculator bmiCalculator = new BMICalculator();
        double BMI = bmiCalculator.calculateBMI(weight, height);
        System.out.println("Your BMI is " + BMI + ".");
    }
}
