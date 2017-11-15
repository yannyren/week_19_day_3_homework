package codeclan.com.rockpaperscissors.models;

import java.text.ChoiceFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yanren on 15/11/2017.
 */

public class Player {

    private String name;
    private String hand;

    public Player (String name){
        this.name = name;

    }

   public void setHand(String choice){
        this.hand = choice;
   }

   public String randomChoice(){
       Random rand = new Random();
       ArrayList<String> choices = new ArrayList<>();
       choices.add("Paper");
       choices.add("Rock");
       choices.add("Scissors");
       int result = rand.nextInt(choices.size());
       return choices.get(result);
   }

    public String getHand() {
       return this.hand;
    }
}
