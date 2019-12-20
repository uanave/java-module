package academy.everyonecodes.java.week2.reflection.exercise1;

public class Application {
    public static void main(String[] args) {
        Product cheese = new Product("cheese", 4);
        Product bread = new Product("bread", 2);

        int cheesePrice = cheese.getPrice();
        cheese.setPrice(cheesePrice + 1);
        System.out.println(cheese.getPrice());

        CartItem cheeseTotal = new CartItem(cheese, 2);
        CartItem breadTotal = new CartItem(bread, 3);
        int cheeseAmount = cheeseTotal.getInstance();
        cheeseTotal.setInstance(cheeseAmount + 1);
        System.out.println(cheeseTotal.getInstance());

    }
}
