package codeclan.com.rockpaperscissors.models;

/**
 * Created by yanren on 15/11/2017.
 */

public class Game {

    public static String gameResult(Player player1, Player machine) {
        String player1Hand = player1.getHand();
        String machineHand = machine.randomChoice();
        machine.setHand(machineHand);

        if (!player1Hand.equals(machineHand)) {
            switch (player1Hand) {
                case "Scissors":
                    if (machineHand.equals("Paper") ) {
                        return "You win!";
                    } else {
                        return "Machine win!";
                    }
                case "Paper":
                    if (machineHand.equals("Rock")) {
                        return "You wins!";
                    } else {
                        return "Machine win!";
                    }
                case "Rock":
                    if (machineHand.equals("Scissors")) {
                        return "You wins!";
                    } else {
                        return "Machine wins!";
                    }
            }
        }
        return "Draw!";
    }
}
