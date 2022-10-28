package com.example.shapegamer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TriangleActivity extends AppCompatActivity {

    EditText txtBase ;
    EditText txtHeight ;
    EditText txtHypotenuse ;
    TextView lblTriangleArea;
    TextView lblTriangelPerimeter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);


        Button btnTriangleCalculate = this.findViewById(R.id.btnTriangleCalculate);
        btnTriangleCalculate.setText("Calculate");
        Button btnTriangleClear = this.findViewById(R.id.btnTriangelClear);
        btnTriangleClear.setText("Clear");


        btnTriangleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CalculateTriangleArea(v);
                CalculateTriangelPerimeter(v);
            }


        });

        btnTriangleClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnTriangelClear(view);
            }
        });



    }



        public void  CalculateTriangelPerimeter(View v){

            txtHeight = findViewById(R.id.txtHeight);
            String height = txtHeight.getText().toString();

            txtBase = findViewById(R.id.txtBase);
            String base = txtHeight.getText().toString();

            txtHypotenuse = findViewById(R.id.txtHypotenuse);
            String hypotenuse = txtHypotenuse.getText().toString();

            double val1 = 0;
            double val2 = 0;
            double val3 = 0;
            double Perimeter = 0;
            val1 = Double.parseDouble(height);
            val2 = Double.parseDouble(base);
            val3 = Double.parseDouble(hypotenuse);

            Perimeter = (val1 + val3 + val2);
            String perimeter = Double.toString(Perimeter);
            lblTriangelPerimeter = findViewById(R.id.lblTriangelPerimeter);
            lblTriangelPerimeter.setText(perimeter);



        };


    public void  CalculateTriangleArea(View view){

        txtHeight = findViewById(R.id.txtHeight);
        String height = txtHeight.getText().toString();

        txtBase = findViewById(R.id.txtBase);
        String base = txtHeight.getText().toString();


        double val1 = 0;
        double val2 = 0;

        double Area = 0;
        val1 = Double.parseDouble(height);
        val2 = Double.parseDouble(base);
        Area = ((0.5 )*val2*val1);
        String area = Double.toString(Area);

        lblTriangleArea = findViewById(R.id.lblTriangleArea);
        lblTriangleArea.setText(area);


    };
    public void btnTriangelClear(View v){
        txtHeight.setText(null);
        txtBase.setText(null);
        txtHypotenuse.setText(null);
        lblTriangleArea.setText(null);
        lblTriangelPerimeter.setText(null);


    }

    }


