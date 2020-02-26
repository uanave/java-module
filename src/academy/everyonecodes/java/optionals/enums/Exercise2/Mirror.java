package academy.everyonecodes.java.optionals.enums.Exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Mirror {
    public String sayHowItLooks(DayOfWeek day, Month month, Outfit outfit) {
        return "On a " + day.name() + " in " + month.name() + " Hansel is wearing " + outfit.getDescription() +".";
    }
}
