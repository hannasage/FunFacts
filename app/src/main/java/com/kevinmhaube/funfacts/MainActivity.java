package com.kevinmhaube.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // View Variables
    private TextView factTextview;
    private Button nextFactButton;
    private RelativeLayout layout;
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.relativeLayout);
        factTextview = findViewById(R.id.factTextView);
        nextFactButton = findViewById(R.id.newFactButton);

        nextFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factTextview.setText(factBook.getFact());
                int color = colorWheel.getColor();
                layout.setBackgroundColor(color);
                nextFactButton.setTextColor(color);
            }
        });
    }
}
