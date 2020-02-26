package academy.everyonecodes.java.evaluation2.optionals.Enums.Exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Drawer {
    private Socks getSocks(DayOfWeek day) {
        if (day.getValue() == 1) {
            return Socks.REDSOCKS;
        } else if (day.getValue() > 1 && day.getValue() < 6) {
            return Socks.YELLOWSOCKS;
        } else {
            return Socks.GREENSOCKS;
        }
    }

    private Headpiece getHeadpiece(Month month) {
        if ((month.getValue() > 2) && (month.getValue() < 10)) {
            return Headpiece.LIGHTHEADPIECE;
        } else {
            return Headpiece.WARMHEADPIECE;
        }
    }

    public Outfit getOutfitForToday(DayOfWeek day, Month month) {
        Socks socks = getSocks(day);
        Headpiece headpiece = getHeadpiece(month);
        return new Outfit(socks, headpiece);
    }
}
