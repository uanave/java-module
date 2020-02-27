package academy.everyonecodes.java.evaluation2.exercise3;

public abstract class MysteryBox {
    private int intensity;

    public MysteryBox(int intensity) {
        this.intensity = intensity;
    }

    protected int getIntensity() {
        return intensity;
    }
    public abstract void apply(Spaceship spaceship);

}
