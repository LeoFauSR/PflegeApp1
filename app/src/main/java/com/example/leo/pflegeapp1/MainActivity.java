package com.example.leo.pflegeapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

double counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvReminder = (TextView) findViewById(R.id.tvReminder);
        ImageButton btnReminder = (ImageButton) findViewById(R.id.btnReminder);
        btnReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent remindIntent = new Intent(getApplicationContext(), ReminderActivity.class);
                startActivity(remindIntent);
            }
        });

        TextView tvMonitoring = (TextView) findViewById(R.id.tvMonitoring);
        ImageButton btnMonitoring = (ImageButton) findViewById(R.id.btnMonitoring);
        btnMonitoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hier auf SmartHome/eHealth-Plattform verlinken
            }
        });

        TextView tvCall = (TextView) findViewById(R.id.tvCall);
        ImageButton btnCall = (ImageButton) findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(getApplicationContext(), CallActivity.class);
                startActivity(callIntent);
            }
        });

        TextView tvGame = (TextView) findViewById(R.id.tvGame);
        ImageButton btnGame = (ImageButton) findViewById(R.id.btnGame);
        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameIntent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(gameIntent);
            }
        });

        Button btnWater = (Button) findViewById(R.id.btnWater);
        btnWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Funktion einfügen, dass nach 24 Uhr auf null gesetzt wird!
                counter += 0.25;
                if(counter <= 2){
                Toast.makeText(getApplicationContext(), "Du hast schon " + counter + " Liter Wasser getrunken! Weiter so!", Toast.LENGTH_LONG).show();
                Intent waterIntent = new Intent(getApplicationContext(), WaterActivity.class);
                waterIntent.putExtra("com.example.leo.pflegeapp1.SOMETHING", counter);
                startActivity(waterIntent);
                }else{
                Toast.makeText(getApplicationContext(), "Prima! Du hast schon über 2 Liter getrunken!", Toast.LENGTH_LONG).show();
                Intent waterIntent = new Intent(getApplicationContext(), WaterActivity.class);
                waterIntent.putExtra("com.example.leo.pflegeapp1.SOMETHING", counter);
                startActivity(waterIntent);
                }

            }
        });


    }
}