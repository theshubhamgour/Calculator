package com.theshubhamgour.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue ,etSecondValue;
    TextView tvAns;
    Button add,mul,sub,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.edFirstValue);
        etSecondValue = findViewById(R.id.edSecondValue);
        tvAns = findViewById(R.id.tvAnswer);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue, answer;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                answer = firstvalue + secondvalue;
                tvAns.setText("Answer = "+answer);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue, answer;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                answer = firstvalue - secondvalue;
                tvAns.setText("Answer = "+answer);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue, answer;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                answer = firstvalue * secondvalue;
                tvAns.setText("Answer = "+answer);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue, answer;
                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());
                answer = firstvalue / secondvalue;
                tvAns.setText("Answer = "+answer);
            }
        });
    }
}