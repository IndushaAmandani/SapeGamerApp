package com.example.shapegamer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RectangleActivity extends AppCompatActivity {
    EditText txtBase2 ;
    EditText txtHeight1 ;

    TextView lblRectangleArea;
    TextView lblRectangelPerimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangel);
        Button btnRectangleCalculate = this.findViewById(R.id.btnRectangleCalculate);
        btnRectangleCalculate.setText("Calculate");
        Button btnRectangleClear = this.findViewById(R.id.btnRectangelClear);
        btnRectangleClear.setText("Clear");


       btnRectangleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CalculateRectangleArea(v);
                CalculateRectangelPerimeter(v);
            }
        });
       btnRectangleClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRectangleClear(v);

            }
        });

    }

    public void  CalculateRectangelPerimeter(View v){

        txtHeight1 = findViewById(R.id.txtHeight1);
        String height= txtHeight1.getText().toString();

        txtBase2 = findViewById(R.id.txtBase2);
        String base = txtBase2.getText().toString();



        double val1 = 0;
        double val2 = 0;

        double Perimeter = 0;
        val1 = Double.parseDouble(height);
        val2 = Double.parseDouble(base);


        Perimeter = (val1 +val2 )*2;
        String perimeter = Double.toString(Perimeter);
        lblRectangelPerimeter= findViewById(R.id.lblRectangelPerimeter);
        lblRectangelPerimeter.setText(perimeter);



    };

    public  void  CalculateRectangleArea(View view){

        txtHeight1 = findViewById(R.id.txtHeight1);
        String height = txtHeight1.getText().toString();

        txtBase2 = findViewById(R.id.txtBase2);
        String base = txtBase2.getText().toString();


        double val1 = 0;
        double val2 = 0;
        double Area = 0;
        val1 = Double.parseDouble(height);
        val2 = Double.parseDouble(base);
        Area = val1*val2;
        String area = Double.toString(Area);

        lblRectangleArea = findViewById(R.id.lblRectangleArea);
        lblRectangleArea.setText(area);


    };
    public void btnRectangleClear(View v){
        txtHeight1.setText(null);
        txtBase2.setText(null);

        lblRectangleArea.setText(null);
        lblRectangelPerimeter.setText(null);


    }
}