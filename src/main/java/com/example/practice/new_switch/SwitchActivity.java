package com.example.practice.new_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.practice.R;

public class SwitchActivity extends AppCompatActivity {

    private Switch switch_on;
    private ToggleButton togglebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        switch_on = findViewById(R.id.switch_on);
        togglebtn = findViewById(R.id.togglebtn);

        switch_on.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b=true){
                    Toast.makeText(SwitchActivity.this, "ONNNNNN", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SwitchActivity.this, "OFFFFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
        togglebtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(SwitchActivity.this, "ONN", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SwitchActivity.this, "OFFs", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
