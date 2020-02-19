package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;

import java.util.Map;

public class DecisionMaker {
    private Map<String, String> winningMoves = Map.of(
            "rock", "scissors",
            "paper", "rock",
            "scissors", "paper"

    );

    public String decideWinner(Move move1, Move move2) {
        String move = winningMoves.get(move1.getName());
        if (move1.getName().equals(move2.getName())) {
            return "It's a tie!";
        } else if (move.equals(move2.getName())) {
            return "User wins!";
        }
        return "Computer wins!";
    }

}
