package codeclan.com.rockpaperscissors;

import org.junit.Test;

import codeclan.com.rockpaperscissors.models.Game;
import codeclan.com.rockpaperscissors.models.Player;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by yanren on 15/11/2017.
 */

public class GameTest {

    @Test
    public void canPlayGame() {
        Player player1 = new Player("Jeff");
        Player machine = new Player("machine");

        player1.setHand("Rock");

        String result = Game.gameResult(player1, machine);
        assertNotNull(result);
    }
}
