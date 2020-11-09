import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dice extends Game {

    List<Integer> playerPoints;
    Integer winner = -1;

    @Override
    void initializeGame() {
        playerPoints = new ArrayList<Integer>(Collections.nCopies(playersCount, 0));
    }

    @Override
    void makePlay(int player) {
        Integer diceRoll = (int) (Math.random() * 6 + 1);
        Integer points = playerPoints.get(player) + diceRoll;
        playerPoints.set(player, points);
        if (points >= 100)
            winner = player;
    }

    @Override
    boolean endOfGame() {
        System.out.println(playerPoints);
        return winner != -1;
    }

    @Override
    void printWinner() {
        System.out.println(winner + " won!");
    }

}