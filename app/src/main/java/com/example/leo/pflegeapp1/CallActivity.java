package com.example.leo.pflegeapp1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        TextView tvTochter = (TextView) findViewById(R.id.tvTochter);
        ImageButton iBtnCallT = (ImageButton) findViewById(R.id.iBtnCallT);
        iBtnCallT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+49) 157 85739782"));
                startActivity(callIntent);
            }
        });

        ImageButton iBtnVcallT = (ImageButton) findViewById(R.id.iBtnVcallT);
        iBtnVcallT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        TextView tvSohn = (TextView) findViewById(R.id.tvSohn);
        ImageButton iBtnCallS = (ImageButton) findViewById(R.id.iBtnCallS);
        iBtnCallS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+49) 157 85739782"));
                startActivity(callIntent);
            }
        });

        ImageButton iBtnVcallS = (ImageButton) findViewById(R.id.iBtnVcallS);
        iBtnVcallS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        TextView tvArzt = (TextView) findViewById(R.id.tvArzt);
        ImageButton iBtnCallA = (ImageButton) findViewById(R.id.iBtnCallA);
        iBtnCallA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+49) 157 85739782"));
                startActivity(callIntent);
            }
        });

        ImageButton iBtnVcallA = (ImageButton) findViewById(R.id.iBtnVcallA);
        iBtnVcallA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        ImageButton iBtnSettings = (ImageButton) findViewById(R.id.iBtnSettings);
        iBtnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
            }
        });

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
