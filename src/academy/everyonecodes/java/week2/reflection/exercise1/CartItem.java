package academy.everyonecodes.java.week2.reflection.exercise1;

public class CartItem {
    private Product product;
    private int amount;

    public CartItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getInstance() {
        return amount;
    }

    public void setInstance(int instance) {
        this.amount = instance;
    }
}
