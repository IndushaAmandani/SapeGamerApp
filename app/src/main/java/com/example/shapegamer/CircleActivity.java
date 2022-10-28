package com.example.shapegamer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CircleActivity extends AppCompatActivity {

    EditText txtRadious ;
    TextView lblCircleArea;
    TextView lblCirclePerimeter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);


        Button btnCircleCalculate = this.findViewById(R.id.btnCircleCalculate);
        btnCircleCalculate.setText("Calculate");

        Button btnCircleClear = this.findViewById(R.id.btnCircleClear);
        btnCircleClear.setText("Clear");

        btnCircleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtRadious = findViewById(R.id.txtRadious);
                String r = txtRadious.getText().toString();

                CalculateCircleArea(v);
                CalculateCirclePerimeter(v);}
        });
        btnCircleClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCircleClear(v);
            }
        });


    }

    //Called when circle calculate is clicked
    public void  CalculateCircleArea (View v){

        txtRadious = findViewById(R.id.txtRadious);
        String t = txtRadious.getText().toString();

        double val1 = 0;
        double Area = 0;
        val1 = Double.parseDouble(t);
        Area = (Math.PI )*val1*val1;
        String area = Double.toString(Area);

        lblCircleArea = findViewById(R.id.lblCircleArea);
        lblCircleArea.setText(area);



    };
    public void  CalculateCirclePerimeter(View v){

        txtRadious = findViewById(R.id.txtRadious);
        String r = txtRadious.getText().toString();

        double val1 = 0;
        double Perimeter = 0;
        val1 = Double.parseDouble(r);
        Perimeter = Math.PI *2*val1;
        String perimeter = Double.toString(Perimeter);
        lblCirclePerimeter = findViewById(R.id.lblTriangelPerimeter);
        lblCirclePerimeter.setText(perimeter);



    };
    public void btnCircleClear(View v){
        txtRadious.setText(null);


        lblCircleArea.setText(null);
        lblCirclePerimeter.setText(null);


    }
}