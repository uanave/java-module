package academy.everyonecodes.java.evaluation2.exercise3;

public class WeaponsUpgradeBox extends MysteryBox {
    public WeaponsUpgradeBox(int intensity) {
        super(intensity);
    }

    @Override
    public void apply(Spaceship spaceship) {
        int damage = spaceship.getDamage();
        spaceship.setDamage(damage + getIntensity());
    }
}
