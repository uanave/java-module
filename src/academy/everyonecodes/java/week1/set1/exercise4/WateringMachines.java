package academy.everyonecodes.java.week1.set1.exercise4;

public class WateringMachines {
    public static double doDiscount(double discount, int price){
        return (discount / 100) * price;
    }

    public static void main(String[] args){
        int plants = 3 + 9;
        int machine = 1;
        int plantsWateredByOneMachine = 4;
        int numberOfWateringMachinesToBuy = (plants / plantsWateredByOneMachine) - machine;
        int pricePerMachine = 40;
        int discount = 20;
        double discountValue = doDiscount(discount, pricePerMachine);
        double finalCost = numberOfWateringMachinesToBuy * (pricePerMachine - discountValue);
        System.out.println("The final cost is " + finalCost);
    }
}
