package com.alissoncipriano.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Sem ViewHolder
//        EditText editValue = findViewById(R.id.edit_value);
//        editValue.getText();

//        Com ViewHolder
        this.mViewHolder.editValue       = findViewById(R.id.edit_value);
        this.mViewHolder.textDollar      = findViewById(R.id.text_dollar);
        this.mViewHolder.textEuro        = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);
    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculate;
    }
}