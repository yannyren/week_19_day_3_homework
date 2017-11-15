package codeclan.com.rockpaperscissors.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import codeclan.com.rockpaperscissors.R;
import codeclan.com.rockpaperscissors.models.Game;
import codeclan.com.rockpaperscissors.models.Player;

public class MainActivity extends AppCompatActivity {
    private TextView machineChoice;
    private TextView result;
    private TextView paper;
    private TextView rock;
    private TextView scissors;
    private Player player1;
    private Player machine;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.machineChoice = findViewById(R.id.machine_choice_show);
        this.result = findViewById(R.id.result_show);
        this.paper = findViewById(R.id.paper_box);
        this.rock = findViewById(R.id.rock_box);
        this.scissors = findViewById(R.id.scissors_box);


        this.player1 = new Player("Jeff");
        this.machine = new Player("machine");

    }

    public void onPaperButtonClick(View view) {
        String textToScan = paper.getText().toString();
        Log.d("name", textToScan);

        player1.setHand(textToScan);
        Log.d("texttoScan",player1.getHand() );
        //Game game = new Game();
        String answer = Game.gameResult(player1, machine);
        Log.d("Paper answer", answer);

        result.setText(answer);
        String machinechoicehand = machine.getHand();
        Log.d("machine choice", machinechoicehand);
        machineChoice.setText(machinechoicehand);


    }

    public void onRockButtonClick(View view) {
        String textToScan = rock.getText().toString();
        Log.d("name", textToScan);
        player1.setHand(textToScan);
        Log.d("texttoScan",player1.getHand() );
        //Game game = new Game();
        String answer = Game.gameResult(player1, machine);
        Log.d("Rock answer", answer);

        result.setText(answer);
        machineChoice.setText(machine.getHand());


    }
    public void onScissorsButtonClick(View view) {
        String textToScan = scissors.getText().toString();
        Log.d("name", textToScan);

        player1.setHand(textToScan);
        Log.d("texttoScan",player1.getHand() );
        //Game game = new Game();
        String answer = Game.gameResult(player1, machine);
        Log.d("Paper answer", answer);

        result.setText(answer);
        machineChoice.setText(machine.getHand());

    }










}
