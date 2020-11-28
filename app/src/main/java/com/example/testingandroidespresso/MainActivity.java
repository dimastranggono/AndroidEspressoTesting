package com.example.testingandroidespresso;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int angka = 0;
    TextView TxtSkor;
    Button btnPoin1;
    Button btnPoin2;
    Button btnPoin3;
    Button tombolReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtSkor = (TextView) findViewById(R.id.txtSkor);
        btnPoin1 = (Button) findViewById(R.id.btn1);
        btnPoin2 = (Button) findViewById(R.id.btn2);
        btnPoin3 = (Button) findViewById(R.id.btn3);
        tombolReset = (Button) findViewById(R.id.btnReset);

        btnPoin1.setOnClickListener(this);
        btnPoin2.setOnClickListener(this);
        btnPoin3.setOnClickListener(this);
        tombolReset.setOnClickListener(this);
        TxtSkor.setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                angka = angka + 1;
                TxtSkor.setText(String.valueOf(angka));
                break;

            case R.id.btn2:
                angka = angka + 2;
                TxtSkor.setText(String.valueOf(angka));
                break;

            case R.id.btn3:
                angka = angka + 3;
                TxtSkor.setText(String.valueOf(angka));
                break;

            case R.id.btnReset:
                angka = 0;
                TxtSkor.setText(String.valueOf(angka));
                break;
        }
    }

}