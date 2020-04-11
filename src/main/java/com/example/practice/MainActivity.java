package com.example.practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.practice.new_switch.RatingBar.RatingBarActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg_practice;
    private RadioButton rb_games, rb_hobby, rb_profession;
    private Spinner spinner_country, spinner_state, spinner_city, spinner_area;
    private Button btn_continue;
    private CheckBox chk_cricket, chk_volley, chk_football, chk_hockey, chk_sing, chk_dance, chk_drawing, chk_reading, chk_artist, chk_doctor, chk_engineeriing, chk_sport;
    private Switch switch_1;
    private ToggleButton togglebtn1;
    private Button btn_progress;
    private SeekBar seekbar;
    private ProgressBar progress_horizontal;
    private Button btn_close;
    private RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg_practice = findViewById(R.id.rg_practice);
        rb_games = findViewById(R.id.rb_games);
        rb_hobby = findViewById(R.id.rb_hobby);
        rb_profession = findViewById(R.id.rb_profession);
        spinner_country = findViewById(R.id.spinner_country);
        spinner_state = findViewById(R.id.spinner_state);
        spinner_area = findViewById(R.id.spinner_area);
        spinner_city = findViewById(R.id.spinner_city);
        btn_continue = findViewById(R.id.btn_continue);
        chk_cricket = findViewById(R.id.chk_cricket);
        chk_volley = findViewById(R.id.chk_volley);
        chk_football = findViewById(R.id.chk_football);
        chk_hockey = findViewById(R.id.chk_hockey);
        chk_sing = findViewById(R.id.chk_sing);
        chk_dance = findViewById(R.id.chk_dance);
        chk_drawing = findViewById(R.id.chk_drawing);
        chk_reading = findViewById(R.id.chk_reading);
        chk_artist = findViewById(R.id.chk_artist);
        chk_doctor = findViewById(R.id.chk_doctor);
        chk_engineeriing = findViewById(R.id.chk_engineering);
        chk_sport = findViewById(R.id.chk_sport);
        togglebtn1 = findViewById(R.id.togglebtn1);
        switch_1 = findViewById(R.id.switch_1);
        btn_progress = findViewById(R.id.btn_progress);
        progress_horizontal = findViewById(R.id.progress_horizontal);
        seekbar = findViewById(R.id.seekbar);
        btn_close = findViewById(R.id.btn_close);
        rating = findViewById(R.id.rating);

        switch_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    rb_games.setClickable(true);
                    rb_hobby.setClickable(true);
                    rb_profession.setClickable(true);
                } else {
                    rb_games.setClickable(false);
                    rb_profession.setClickable(false);
                    rb_hobby.setClickable(false);
                    chk_cricket.setVisibility(View.GONE);
                    chk_volley.setVisibility(View.GONE);
                    chk_football.setVisibility(View.GONE);
                    chk_hockey.setVisibility(View.GONE);
                    chk_drawing.setVisibility(View.GONE);
                    chk_dance.setVisibility(View.GONE);
                    chk_reading.setVisibility(View.GONE);
                    chk_sing.setVisibility(View.GONE);
                    chk_artist.setVisibility(View.GONE);
                    chk_doctor.setVisibility(View.GONE);
                    chk_engineeriing.setVisibility(View.GONE);
                    chk_sport.setVisibility(View.GONE);
                    chk_cricket.setChecked(false);
                    chk_hockey.setChecked(false);
                    chk_football.setChecked(false);
                    chk_volley.setChecked(false);
                    chk_dance.setChecked(false);
                    chk_drawing.setChecked(false);
                    chk_reading.setChecked(false);
                    chk_sing.setChecked(false);
                    chk_artist.setChecked(false);
                    chk_engineeriing.setChecked(false);
                    chk_sport.setChecked(false);
                    chk_doctor.setChecked(false);
                }
            }
        });
        rg_practice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int selectedid = radioGroup.getCheckedRadioButtonId();

                if (selectedid == R.id.rb_games) {
                    Toast.makeText(MainActivity.this, "" + rb_games.getText().toString(), Toast.LENGTH_SHORT).show();
                    chk_cricket.setVisibility(View.VISIBLE);
                    chk_volley.setVisibility(View.VISIBLE);
                    chk_football.setVisibility(View.VISIBLE);
                    chk_hockey.setVisibility(View.VISIBLE);
                    chk_drawing.setVisibility(View.GONE);
                    chk_dance.setVisibility(View.GONE);
                    chk_reading.setVisibility(View.GONE);
                    chk_sing.setVisibility(View.GONE);
                    chk_artist.setVisibility(View.GONE);
                    chk_doctor.setVisibility(View.GONE);
                    chk_engineeriing.setVisibility(View.GONE);
                    chk_sport.setVisibility(View.GONE);
                }

                if (selectedid == R.id.rb_hobby) {
                    Toast.makeText(MainActivity.this, "" + rb_hobby.getText().toString(), Toast.LENGTH_SHORT).show();
                    chk_cricket.setVisibility(View.GONE);
                    chk_volley.setVisibility(View.GONE);
                    chk_football.setVisibility(View.GONE);
                    chk_hockey.setVisibility(View.GONE);
                    chk_drawing.setVisibility(View.VISIBLE);
                    chk_dance.setVisibility(View.VISIBLE);
                    chk_reading.setVisibility(View.VISIBLE);
                    chk_sing.setVisibility(View.VISIBLE);
                    chk_artist.setVisibility(View.GONE);
                    chk_doctor.setVisibility(View.GONE);
                    chk_engineeriing.setVisibility(View.GONE);
                    chk_sport.setVisibility(View.GONE);

                }
                if (selectedid == R.id.rb_profession) {
                    chk_cricket.setVisibility(View.GONE);
                    chk_volley.setVisibility(View.GONE);
                    chk_football.setVisibility(View.GONE);
                    chk_hockey.setVisibility(View.GONE);
                    chk_drawing.setVisibility(View.GONE);
                    chk_dance.setVisibility(View.GONE);
                    chk_reading.setVisibility(View.GONE);
                    chk_sing.setVisibility(View.GONE);
                    chk_artist.setVisibility(View.VISIBLE);
                    chk_doctor.setVisibility(View.VISIBLE);
                    chk_engineeriing.setVisibility(View.VISIBLE);
                    chk_sport.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "" + rb_profession.getText().toString(), Toast.LENGTH_SHORT).show();

                }
            }
        });

        togglebtn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    spinner_country.setEnabled(true);
                    spinner_state.setEnabled(true);
                    spinner_city.setEnabled(true);
                    spinner_area.setEnabled(true);
                } else {
                    spinner_country.setEnabled(false);
                    spinner_state.setEnabled(false);
                    spinner_city.setEnabled(false);
                    spinner_area.setEnabled(false);
                }
            }
        });
        ArrayList<String> list = new ArrayList<>();
        spinner_country.setPrompt("Country");
        list.add("India");
        list.add("Australia");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner_country.setAdapter(adapter);

        spinner_country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sp1 = String.valueOf(spinner_country.getSelectedItem());
                //  Toast.makeText(MainActivity.this, "" + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                if (sp1.contentEquals("India")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Gujarat");
                    list.add("Punjab");
                    list.add("Goa");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_state.setAdapter(adapter);
                }
                if (sp1.contentEquals("Australia")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("New South Wales");
                    list.add("Queensland");
                    list.add("South Australia");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_state.setAdapter(adapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner_state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sp1 = String.valueOf(spinner_state.getSelectedItem());
                //  Toast.makeText(MainActivity.this, "" + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                if (sp1.contentEquals("Gujarat")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Baroda");
                    list.add("Navsari");
                    list.add("Ahmedabad");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_city.setAdapter(adapter);


                }
                if (sp1.contentEquals("Goa")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Panaji");
                    list.add("Calangute");
                    list.add("Vasco da gama");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_city.setAdapter(adapter);

                }
                if (sp1.contentEquals("Punjab")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Amritsar");
                    list.add("Ludhiana");
                    list.add("Jalandhar");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_city.setAdapter(adapter);

                }
                if (sp1.contentEquals("New South Wales")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Sydney");
                    list.add("Albury");
                    list.add("Dubbo");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_city.setAdapter(adapter);

                }
                if (sp1.contentEquals("South Australia")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Adelaide");
                    list.add("Tumby Bay");
                    list.add("Border Town");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_city.setAdapter(adapter);

                }
                if (sp1.contentEquals("Queensland")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Mount Isa");
                    list.add("Brisbane");
                    list.add("Gold Coast");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_city.setAdapter(adapter);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner_city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sp1 = String.valueOf(spinner_city.getSelectedItem());
                //  Toast.makeText(MainActivity.this, "" + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                if (sp1.contentEquals("Navsari")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Vijalpore");
                    list.add("Jalalpore");
                    list.add("Abrama");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_area.setAdapter(adapter);


                }
                if (sp1.contentEquals("Baroda")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Waghodia");
                    list.add("Vasna");
                    list.add("Vasna Road");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_area.setAdapter(adapter);

                }
                if (sp1.contentEquals("Ahmedabad")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Ambawadi");
                    list.add("Ambli");
                    list.add("Amraiwadi");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_area.setAdapter(adapter);

                }
                if (sp1.contentEquals("Sydney")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("East Sydney");
                    list.add("Garden Island");
                    list.add("Glebe Point");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_area.setAdapter(adapter);

                }
                if (sp1.contentEquals("Albury")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("North Albury");
                    list.add("South Albury");
                    list.add("East Albury");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_area.setAdapter(adapter);

                }
                if (sp1.contentEquals("Dubbo")) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add("Rawsonville");
                    list.add("Toongi");
                    list.add("Brocklehurst");
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
                    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
                    adapter.notifyDataSetChanged();
                    spinner_area.setAdapter(adapter);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int change = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                change = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Media", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek Value is" + change, Toast.LENGTH_SHORT).show();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "country==> " + spinner_country.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "state==> " + spinner_state.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "city==> " + spinner_city.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "area==> " + spinner_area.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

                StringBuilder result = new StringBuilder();
                result.append("Selected==>");
                if (chk_cricket.isChecked()) {
                    result.append("\n Cricket");
                }
                if (chk_football.isChecked()) {
                    result.append("\n Football");
                }
                if (chk_hockey.isChecked()) {
                    result.append("\n Hockey");
                }
                if (chk_volley.isChecked()) {
                    result.append("\n Volley");
                }
                if (chk_dance.isChecked()) {
                    result.append("\n Dance");
                }
                if (chk_drawing.isChecked()) {
                    result.append("\n Drawing");
                }
                if (chk_sing.isChecked()) {
                    result.append("\n Singing");
                }
                if (chk_reading.isChecked()) {
                    result.append("\n Reading");
                }
                if (chk_artist.isChecked()) {
                    result.append("\n Artist");
                }
                if (chk_doctor.isChecked()) {
                    result.append("\n Doctor");
                }
                if (chk_engineeriing.isChecked()) {
                    result.append("\n Engineering");
                }
                if (chk_sport.isChecked()) {
                    result.append("\n Sportsman");
                }
                Toast.makeText(MainActivity.this, "" + result.toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, RatingBarActivity.class);
                startActivity(intent);
            }
        });

        btn_close.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alert Dialog Box");
                builder.setMessage("Do you want to close app");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
//                        Toast.makeText(MainActivity.this, "you clicked yes", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
  //                      Toast.makeText(MainActivity.this, "YOou clicked NO", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }

        });
        btn_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog pg = new ProgressDialog(MainActivity.this);
                pg.setTitle("Download");
                pg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pg.setMessage("Downloading");
                pg.setProgress(0);
                pg.setMax(100);
                pg.setButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        Toast.makeText(MainActivity.this, "Download Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                pg.show();
            }
        });
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if (v == 1) {
                    Toast.makeText(MainActivity.this, "Unusable", Toast.LENGTH_SHORT).show();
                }
                if (v == 2) {
                    Toast.makeText(MainActivity.this, "Poor", Toast.LENGTH_SHORT).show();
                }
                if (v == 3) {
                    Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                }
                if (v == 4) {
                    Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();
                }
                if (v == 5) {
                    Toast.makeText(MainActivity.this, "Excellent", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

