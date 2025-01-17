package academy.everyonecodes.java._optionals.enums.Exercise1;

public class TShirt {
    private String color;
    private Size size;
    private int price;

    public TShirt(String color, Size size, int price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
