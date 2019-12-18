package academy.everyonecodes.java.week2.set2.exercise5;

public class Application {
    public static void main(String[] args) {
        ShoeCustomer firstCustomer = new ShoeCustomer(38);
        ShoeCustomer secondCustomer = new ShoeCustomer(42);
        ShopAssistant assistant = new ShopAssistant();

        assistant.findShoeForCustomer(firstCustomer);
        assistant.findShoeForCustomer(secondCustomer);
    }
}
