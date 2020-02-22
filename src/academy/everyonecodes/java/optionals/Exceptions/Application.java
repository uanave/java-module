package academy.everyonecodes.java.optionals.Exceptions;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell me your command :");
        String answer = scanner.nextLine();

        chatBot.handle(answer);
    }
}
