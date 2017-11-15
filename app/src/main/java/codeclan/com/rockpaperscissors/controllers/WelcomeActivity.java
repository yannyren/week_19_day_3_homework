package codeclan.com.rockpaperscissors.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import codeclan.com.rockpaperscissors.R;

public class WelcomeActivity extends AppCompatActivity {
    private Button rule;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        this.rule = findViewById(R.id.rule_button);
        this.start = findViewById(R.id.start_button);
    }

    public void onRuleButtonClick(View view) {

        Intent intent = new Intent(this, RuleActivity.class);

        startActivity(intent);


    }
}
