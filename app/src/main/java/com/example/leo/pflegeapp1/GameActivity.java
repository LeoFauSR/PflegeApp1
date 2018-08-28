package com.example.leo.pflegeapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                //Wassercounter springt zurück, muss angepasst werden!!!
            }
        });

        TextView tvCount = (TextView) findViewById(R.id.tvWasserCount);

        ImageButton btnMmry1 = (ImageButton) findViewById(R.id.btnMmry1);
        btnMmry1.setOnClickListener(this);

        ImageButton btnMmry2 = (ImageButton) findViewById(R.id.btnMmry2);
        btnMmry2.setOnClickListener(this);

        ImageButton btnMmry3 = (ImageButton) findViewById(R.id.btnMmry3);
        btnMmry3.setOnClickListener(this);

        ImageButton btnMmry4 = (ImageButton) findViewById(R.id.btnMmry4);
        btnMmry4.setOnClickListener(this);

        ImageButton btnMmry5 = (ImageButton) findViewById(R.id.btnMmry5);
        btnMmry5.setOnClickListener(this);

        ImageButton btnMmry6 = (ImageButton) findViewById(R.id.btnMmry6);
        btnMmry6.setOnClickListener(this);

        ImageButton btnMmry7 = (ImageButton) findViewById(R.id.btnMmry7);
        btnMmry7.setOnClickListener(this);

        ImageButton btnMmry8 = (ImageButton) findViewById(R.id.btnMmry8);
        btnMmry8.setOnClickListener(this);

        ImageButton btnMmry9 = (ImageButton) findViewById(R.id.btnMmry9);
        btnMmry9.setOnClickListener(this);

        ImageButton btnMmry10 = (ImageButton) findViewById(R.id.btnMmry10);
        btnMmry10.setOnClickListener(this);

        ImageButton btnMmry11 = (ImageButton) findViewById(R.id.btnMmry11);
        btnMmry11.setOnClickListener(this);

        ImageButton btnMmry12 = (ImageButton) findViewById(R.id.btnMmry12);
        btnMmry12.setOnClickListener(this);

        ImageButton btnMmry13 = (ImageButton) findViewById(R.id.btnMmry13);
        btnMmry13.setOnClickListener(this);

        ImageButton btnMmry14 = (ImageButton) findViewById(R.id.btnMmry14);
        btnMmry14.setOnClickListener(this);

        ImageButton btnMmry15 = (ImageButton) findViewById(R.id.btnMmry15);
        btnMmry15.setOnClickListener(this);

        ImageButton btnMmry16 = (ImageButton) findViewById(R.id.btnMmry16);
        btnMmry16.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //show Picture
    }
}
