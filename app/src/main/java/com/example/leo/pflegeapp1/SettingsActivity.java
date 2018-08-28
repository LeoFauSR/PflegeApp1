package com.example.leo.pflegeapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        TextView tvNrT = (TextView) findViewById(R.id.tvNrT);
        TextView tvNrS = (TextView) findViewById(R.id.tvNrS);
        TextView tvNrA = (TextView) findViewById(R.id.tvNrA);

        EditText etNrT = (EditText) findViewById(R.id.etNrT);
        EditText etNrS = (EditText) findViewById(R.id.etNrS);
        EditText etNrA = (EditText) findViewById(R.id.etNrA);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
