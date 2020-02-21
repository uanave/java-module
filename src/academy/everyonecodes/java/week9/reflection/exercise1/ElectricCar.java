package academy.everyonecodes.java.week9.reflection.exercise1;

public class ElectricCar extends Car {
    public ElectricCar(String brand) {
        super(brand, "electric");
    }

    @Override
    public String refuel() {
        return "I am recharging my " + getEngineType() + " car!";
    }
}
