package com.example.tempconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText fahBox;
    private EditText celBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fahBox = findViewById(R.id.fahBox);
        celBox = findViewById(R.id.celBox);
    }

    public void convert(View v) {
        String input = fahBox.getText().toString();
        double fahValue = Double.parseDouble(input);
        double celValue = (fahValue - 32) * 5.0 / 9.0;
        celBox.setText(celValue+"");
    }

}
