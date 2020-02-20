package academy.everyonecodes.java.week9.set2.exercise3.move;

public abstract class Move {
    private String name;
    private String defeated;

    public Move(String name, String defeated) {
        this.name = name;
        this.defeated = defeated;
    }

    public String getName() {
        return name;
    }

    public boolean defeats(Move move) {
        return defeated.contains(move.getName());
    }
}
