package academy.everyonecodes.java.optionals.enums.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<TShirt> availableTShirts = new ArrayList<>();


    public Shop() {
        this.availableTShirts.add(new TShirt("lila", Size.XS, 5));
        this.availableTShirts.add(new TShirt("black", Size.S, 10));
        this.availableTShirts.add(new TShirt("green", Size.M, 6));
        this.availableTShirts.add(new TShirt("blue", Size.L, 10));
        this.availableTShirts.add(new TShirt("purple", Size.XL, 6));
        this.availableTShirts.add(new TShirt("pink", Size.XXL, 7));
        this.availableTShirts.add(new TShirt("yellow", Size.M, 2));
        this.availableTShirts.add(new TShirt("fuchsia", Size.L, 1));
        this.availableTShirts.add(new TShirt("white", Size.XS, 10));
        this.availableTShirts.add(new TShirt("orange", Size.XS, 2));
    }

    public List<TShirt> getAvailableTShirts() {
        List<TShirt> newAvailableTShirts = availableTShirts;
        return newAvailableTShirts;
    }

}

