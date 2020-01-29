package academy.everyonecodes.java.optionals.Enums.Exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Mirror {
    public void sayHowItLooks(DayOfWeek day, Month month, Outfit outfit) {
        System.out.println("On a " + day.name() + " in " + month.name() + " Hansel is wearing " + outfit.getDescription() +".");
    }
}
