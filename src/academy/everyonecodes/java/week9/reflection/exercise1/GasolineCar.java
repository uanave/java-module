package academy.everyonecodes.java.week9.reflection.exercise1;

public class GasolineCar extends Car {
    public GasolineCar(String brand) {
        super(brand, "gasoline");
    }

    @Override
    public String refuel() {
        return "I am refilling my " + getEngineType() + " tank!";
    }
}
