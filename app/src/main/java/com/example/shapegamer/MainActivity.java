package com.example.shapegamer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtRadious;
    EditText txtAreaCircle;
    EditText txtPerimeterCircle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent circleIntent = new Intent(this,CircleActivity.class);
        Intent triangelIntent = new Intent(this,TriangleActivity.class);
        Intent rectangelIntent = new Intent(this,RectangleActivity.class);

        Button btnCircle = this.findViewById(R.id.btnCircle);
        Button btnRectangle = this.findViewById(R.id.btnCircleClear);
        Button btnTriangle = this.findViewById(R.id.btnTriangle);

        btnCircle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                circleIntent.setAction(Intent.ACTION_SEND);
                startActivity(circleIntent);

                //String value = txtRadious.getText().toString();


            }
        });
        btnTriangle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                triangelIntent.setAction(Intent.ACTION_SEND);
                startActivity(triangelIntent);



            }
        });
        btnRectangle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                rectangelIntent.setAction(Intent.ACTION_SEND);
                startActivity(rectangelIntent);

                //String value = txtRadious.getText().toString();


            }
        });



    }
}