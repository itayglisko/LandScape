package com.example.landscape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnfight,btnmissions,btnshop,btntutorial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfight = findViewById(R.id.btnFight);
        btnmissions = findViewById(R.id.btnMissions);
        btnshop = findViewById(R.id.btnShop);
        btntutorial = findViewById(R.id.btntutorial);
        btnfight.setOnClickListener(this);
        btnmissions.setOnClickListener(this);
        btnshop.setOnClickListener(this);
        btntutorial.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==btnfight)
        {
            Intent Fight = new Intent(this, FightActivity.class);
            startActivity(Fight);
        }
    }
}