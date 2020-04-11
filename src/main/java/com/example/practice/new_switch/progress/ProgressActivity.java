package com.example.practice.new_switch.progress;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.practice.R;

public class ProgressActivity extends AppCompatActivity {

    private Button btn_progress;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        btn_progress = findViewById(R.id.btn_progress);
        progress = findViewById(R.id.progress);


        progress.setMax(200);
        progress.setProgress(40);

        btn_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog pg = new ProgressDialog(ProgressActivity.this);
                pg.setTitle("Progress title");
                pg.setMessage("Progress running");
                pg.setIcon(R.drawable.ic_android_black_24dp);
                pg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pg.setButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ProgressActivity.this, "Yes Clickes", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                });
                pg.show();
            }
        });
    }
}
