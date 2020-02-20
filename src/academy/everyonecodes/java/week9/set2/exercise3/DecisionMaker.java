package academy.everyonecodes.java.week9.set2.exercise3;

import academy.everyonecodes.java.week9.set2.exercise3.move.Move;

public class DecisionMaker {

//    private Map<String, String> defeats;

    public String getScore(Move move1, Move move2) {
        if (move1.defeats(move2)) {
            return "Human wins!";
        }
        if (move2.defeats(move1)) {
            return "Computer wins!";
        }
        return "It's a tie!";

     /*   defeats = new HashMap<>();
        defeats.put("rock", "scissors");
        defeats.put("scissors", "paper");
        defeats.put("paper", "rock");
*/
    }
}
