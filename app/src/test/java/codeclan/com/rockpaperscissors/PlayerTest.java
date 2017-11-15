package codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.rockpaperscissors.models.Player;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by yanren on 15/11/2017.
 */

public class PlayerTest {
    Player player1;

    @Before
    public void before() {
        this.player1 = new Player("Jeff");
    }

    @Test

    public void couldSetHand(){
        player1.setHand("Paper");
        assertEquals("Paper", player1.getHand());
    }

    @Test
    public void couldSetRandom(){
        String result = player1.randomChoice();
        assertNotNull(result);
    }

}

