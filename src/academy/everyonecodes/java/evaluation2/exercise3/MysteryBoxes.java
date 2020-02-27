package academy.everyonecodes.java.evaluation2.exercise3;

import java.util.List;

public class MysteryBoxes {
    public static List<MysteryBox> get() {
        return List.of(new SparePartsBox(1), new WeaponsUpgradeBox(2));
    }
}
