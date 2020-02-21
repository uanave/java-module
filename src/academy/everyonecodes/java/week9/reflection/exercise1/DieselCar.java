package academy.everyonecodes.java.week9.reflection.exercise1;

public class DieselCar extends Car {
    public DieselCar(String brand) {
        super(brand, "diesel");
    }

    @Override
    public String refuel() {
        return "I am refilling my " + getEngineType() + " tank!";
    }
}
