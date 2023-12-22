package com.example.ab_2_eventlistenercolorchange;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    Button  btnReset;
    LinearLayout changeColorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReset = (Button) findViewById(R.id.resetButton);
        changeColorLayout = findViewById(R.id.changeColor);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBackgroundColor();
            }
        });
    }

    public void changeBackgroundColor(){
        int newColor = Color.parseColor("#8b0a50");
        changeColorLayout.setBackgroundColor(newColor);

    }
}