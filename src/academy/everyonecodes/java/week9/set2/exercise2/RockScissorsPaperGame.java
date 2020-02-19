package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Players.Computer;
import academy.everyonecodes.java.week9.set2.exercise2.Players.User;

public class RockScissorsPaperGame {
    private static void playRound(DecisionMaker decisionMaker) {

        User user = new User();
        Computer computer = new Computer();
        Move move1 = user.getMove();
        Move move2 = computer.getMove();
        System.out.println("User chose: " + move1.getName());
        System.out.println("Computer chose: " + move2.getName());
        String result = decisionMaker.decideWinner(move1, move2);
        System.out.println(result);
        if (user.wantsToPlay()) {
            playRound(decisionMaker);
        } else {
            System.out.println("See you next time!");
        }
    }

    public void play() {
        System.out.println("Let’s play rock, paper, scissors!\n");
        DecisionMaker decisionMaker = new DecisionMaker();
        playRound(decisionMaker);
    }
}

