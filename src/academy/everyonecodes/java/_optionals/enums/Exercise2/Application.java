package academy.everyonecodes.java._optionals.enums.Exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Drawer drawer = new Drawer();
        Mirror mirror = new Mirror();
        DayOfWeek day = calendar.askForDay();
        Month month = calendar.askForMonth();
        Outfit outfit = drawer.getOutfitForToday(day, month);
        mirror.sayHowItLooks(day, month, outfit);
    }
}
