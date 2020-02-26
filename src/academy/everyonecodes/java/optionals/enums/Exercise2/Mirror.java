package academy.everyonecodes.java.evaluation2.optionals.Enums.Exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Mirror {
    public String sayHowItLooks(DayOfWeek day, Month month, Outfit outfit) {
        return "On a " + day.name() + " in " + month.name() + " Hansel is wearing " + outfit.getDescription() +".";
    }
}
