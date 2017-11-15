package codeclan.com.rockpaperscissors.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import codeclan.com.rockpaperscissors.R;

public class RuleActivity extends AppCompatActivity {
    private TextView rule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);
        this.rule = findViewById(R.id.rules_box);
        String rules = "Rock beats Scissors; \nScissors beats Paper; \nPaper beats Rock!";

        rule.setText(rules);

    }


}
