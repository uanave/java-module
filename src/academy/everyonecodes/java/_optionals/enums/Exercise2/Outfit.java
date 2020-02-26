package academy.everyonecodes.java._optionals.enums.Exercise2;

public class Outfit {
    private Socks socks;
    private Headpiece headpiece;

    public Outfit(Socks socks, Headpiece headpiece) {
        this.socks = socks;
        this.headpiece = headpiece;
    }

    public String getDescription() {
        return socks.getDescription() + " and " + headpiece.getDescription();
    }
}
