package academy.everyonecodes.java.week4.set1.exercise2;

import java.util.Random;

public class OneToTenPicker {
    public int pick() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
