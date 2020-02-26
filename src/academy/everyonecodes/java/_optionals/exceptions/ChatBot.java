package academy.everyonecodes.java._optionals.exceptions;

import java.util.List;

public class ChatBot {

    public void handle(String input) {
        try {
            List<String> commands = getList(input);
            String command = handleFirst(commands.get(0));
            String value = handleSecond(commands.get(1), commands.get(0));
            System.out.println(command + " " + value);
        } catch (WrongFirstArgumentException | WrongSecondArgumentException error) {
            System.out.println(error.getMessage());
        }
    }

    List<String> getList(String input) throws WrongFirstArgumentException {
        List<String> commands = List.of(input.split(" "));
        if (commands.size() != 2) {
            throw new WrongFirstArgumentException("Please enter a valid command!");
        }
        return commands;
    }

    String handleFirst(String input) throws WrongFirstArgumentException {
        if (input.equals("lights")) {
            return "Lights switched";
        } else if (input.equals("temperature")) {
            return "Temperature";
        }
        throw new WrongFirstArgumentException(input);
    }

    String handleSecond(String input, String value) throws WrongSecondArgumentException {
        if (value.equals("lights")) {
            if (input.equals("on") || input.equals("off")) {
                return input;
            }
        } else if (value.equals("temperature")) {
            try {
                int degrees = Integer.parseInt(input);
                if (degrees < 30 && degrees > 0) {
                    return "raised by " + input;
                } else if (degrees < 0 && degrees > -30) {
                    return "lowered by " + Math.abs(degrees);
                }
            } catch (NumberFormatException e) {
                throw new WrongSecondArgumentException(input);
            }
        }
        throw new WrongSecondArgumentException(input);
    }
}