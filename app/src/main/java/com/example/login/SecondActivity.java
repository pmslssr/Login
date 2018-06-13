package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;

public class SecondActivity extends AppCompatActivity {

    public static final String TAG = "SecondActivity";
    private CalendarView mCalendarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mCalendarView = (CalendarView)findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override

            public void onSelectedDayChange(CalendarView calendarView,int i, int i1,int i2) {
               String date = i2 +" - "+(i1+1)+ " - "+i;

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("date",date);
                startActivity(intent);
            }

        });


    }
}
