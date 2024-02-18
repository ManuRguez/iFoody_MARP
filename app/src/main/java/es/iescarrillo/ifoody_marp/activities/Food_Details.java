package es.iescarrillo.ifoody_marp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import es.iescarrillo.ifoody_marp.R;

public class Food_Details extends AppCompatActivity {

    Button btnNextFood;

    ImageView imgBack;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);


        btnNextFood= findViewById(R.id.btnNextFood);


        btnNextFood.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Cart_Activity.class);
            startActivity(intent);
        });

        imgBack =findViewById(R.id.imgBack);

        imgBack.setOnClickListener(v ->{
            Intent intent2 = new Intent(getApplicationContext(), Side_Menu_Activity.class);
            startActivity(intent2);
        });





    }
}