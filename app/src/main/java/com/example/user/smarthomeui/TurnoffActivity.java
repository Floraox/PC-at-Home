package com.example.user.smarthomeui;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class TurnoffActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turnoff);
        TextView turnoff_view = (TextView) findViewById(R.id.turnoff_textview);
        TextView setttime_view = (TextView) findViewById(R.id.settime_textview);
        turnoff_view.setOnClickListener((View.OnClickListener) this);
        setttime_view.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v) {
        switch (v.getId( )) {
            case R.id.turnoff_textview:
            //    Intent turnoff_intent = new Intent(TurnoffActivity.this, CheckActivity.class);
            //    startActivity(turnoff_intent);
                break;
            case R.id.settime_textview:
                Intent settime_intent = new Intent(TurnoffActivity.this, SettimeActivity.class);
                startActivity(settime_intent);
                break;
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            moveTaskToBack(true);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

}
