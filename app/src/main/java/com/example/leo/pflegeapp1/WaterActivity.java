package com.example.leo.pflegeapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        TextView tvWasser1 = (TextView) findViewById(R.id.tvWasser1);
        TextView tvWasserCount = (TextView) findViewById(R.id.tvWasserCount);
        TextView tvWasser2 = (TextView) findViewById(R.id.tvWasser2);
        TextView tvWasser3 = (TextView) findViewById(R.id.tvWasser3);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                //Wassercounter springt zurück, muss angepasst werden!!!
            }
        });
    }
}
