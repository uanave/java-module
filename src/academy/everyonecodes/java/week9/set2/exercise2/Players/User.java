package academy.everyonecodes.java.week9.set2.exercise2.Players;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Moves;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class User extends Player {

    private List<Move> moves = Moves.get();
    private Scanner scanner = new Scanner(System.in);


    private Optional<Move> askPlayer() {
        System.out.println("These are your options: " + getMoveNames());
        System.out.println("Choose one:\n");
        String answer = scanner.nextLine();
        return moves.stream()
                .filter(move -> move.getName().equals(answer))
                .findFirst();
    }

    private String getMoveNames() {
        return moves.stream()
                .map(Move::getName)
                .collect(Collectors.joining(", "));
    }

    @Override
    public Move getMove() {
        Optional<Move> oMove = Optional.empty();

        while (oMove.isEmpty()) {
            oMove = askPlayer();
        }

        return oMove.get();
    }

    @Override
    public boolean wantsToPlay() {
        System.out.println("Do you want to play again?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.equals("yes");
    }
}


