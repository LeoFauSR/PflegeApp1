package com.example.leo.pflegeapp1;

import android.app.AlarmManager;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class ReminderActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        CalendarView cvReminder = (CalendarView) findViewById(R.id.cvReminder);

        ImageButton btnNewM = (ImageButton) findViewById(R.id.btnNewM);
        btnNewM.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            }
        });

        ImageButton btnNewD = (ImageButton) findViewById(R.id.btnNewD);
        btnNewD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timePicker = new DateTimePicker();
                timePicker.show(getSupportFragmentManager(), "time picker");
            }
        });


        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, hourOfDay);
        c.set(Calendar.MINUTE, minute);
        c.set(Calendar.SECOND, 0);



    }
    private void updateTimeText(Calendar c){
        String timeText = "Alarm set for: ";
        timeText += DateFormat.getTimeInstance(DateFormat.SHORT).format(c);

        TextView tvDate = (TextView) findViewById(R.id.tvDate);
        tvDate.setText(timeText);
    }

    private void startAlarm(Calendar c){
        AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

    }
}


