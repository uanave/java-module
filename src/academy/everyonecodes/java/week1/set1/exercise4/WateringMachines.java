package academy.everyonecodes.java.week1.set1.exercise4;

public class WateringMachines {
    public static void main(String[] args){
        int plants = 3 + 9;
        int machine = 1;
        int plantsWateredByOneMachine = 4;
        int numberOfWateringMachinesToBuy = (plants / plantsWateredByOneMachine) - 1;
        int pricePerMachine = 20;
        int finalCost = numberOfWateringMachinesToBuy * (pricePerMachine - (pricePerMachine / 100) * 20);
        System.out.println("The final cost is " + finalCost);
    }
}
