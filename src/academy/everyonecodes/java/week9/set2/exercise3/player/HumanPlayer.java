package academy.everyonecodes.java.week9.set2.exercise3.player;


import academy.everyonecodes.java.week9.set2.exercise3.move.Moves;
import academy.everyonecodes.java.week9.set2.exercise3.move.Move;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HumanPlayer implements Player {

    private List<Move> moves = Moves.getMoves();
    private Scanner scanner = new Scanner(System.in);


    @Override
    public Move getMove() {
        Optional<Move> oMove = Optional.empty();
        while (oMove.isEmpty()) {
            oMove = askPlayerForMove();
        }
        return oMove.get();
    }

    private Optional<Move> askPlayerForMove() {
        System.out.println("These are your options: " + getOptions());
        System.out.println("Choose one:");
        String moveName = scanner.nextLine();
        return moves.stream()
                .filter(move -> move.getName().equals(moveName))
                .findFirst();
    }

    @Override
    public boolean wantsToPlay() {
        System.out.println("Do you want to play again?");
        String answer = scanner.nextLine();
        return (answer.equals("yes"));
    }

    private String getOptions() {
        return moves.stream()
                .map(Move::getName)
                .collect(Collectors.joining(", "));
    }
}
