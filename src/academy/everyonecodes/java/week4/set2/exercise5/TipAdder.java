package academy.everyonecodes.java.week4.set2.exercise5;

public class TipAdder {
    public double add(double check) {
        double tip = (5 * check) / 100;
        double checkWithTip = tip + check;
        double decimalPoints = checkWithTip - Math.floor(checkWithTip);
        while (decimalPoints != 0) {
            if (decimalPoints > 0.5) {
                return Math.ceil(checkWithTip);
            } else {
                return Math.floor(checkWithTip) + 0.5;
            }
        }
        return checkWithTip;
    }
}
