package academy.everyonecodes.java.optionals.Exceptions;

import java.util.List;

public class ChatBot {

    public void handle(String input) {
        List<String> commands = List.of(input.split(" "));
        try {
            String firstResponse = handleFirst(commands.get(0));
            String secondResponse = handleSecond(commands.get(1), commands.get(0));
            System.out.println(firstResponse + " " + secondResponse);
        } catch (WrongFirstArgumentException | WrongSecondArgumentException error) {
            System.out.println(error.getMessage());
        }
    }


    String handleFirst(String input) throws WrongFirstArgumentException {
        if (input.equals("lights")) {
            return "Lights switched";
        } else if (input.equals("temperature")) {
            return "Temperature";
        }
        throw new WrongFirstArgumentException(input);
    }

    String handleSecond(String input, String type) throws WrongSecondArgumentException {
        if (type.equals("lights")) {
            if (input.equals("on") || input.equals("off")) {
                return input;
            }
        } else if (type.equals("temperature")) {
            try {
                int value = Integer.parseInt(input);
                if (value < 30 && value > 0) {
                    return "raised by " + input;
                } else if (value < 0 && value > -30) {
                    return "lowered by " + Math.abs(value);
                }
            } catch (NumberFormatException e) {
                throw new WrongSecondArgumentException(input);
            }
        }
        throw new WrongSecondArgumentException(input);
    }
}