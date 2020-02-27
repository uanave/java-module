package academy.everyonecodes.java.evaluation2.exercise3;

public class SparePartsBox extends MysteryBox {
    public SparePartsBox(int intensity) {
        super(intensity);
    }

    @Override
    public void apply(Spaceship spaceship) {
        int health = spaceship.getHealth();
        spaceship.setHealth(health + getIntensity());
    }
}
