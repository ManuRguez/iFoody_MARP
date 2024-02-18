package es.iescarrillo.ifoody_marp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import es.iescarrillo.ifoody_marp.R;

public class Cart_Activity extends AppCompatActivity {

    ImageView imgBack2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        imgBack2 = findViewById(R.id.imgBackCart);

        imgBack2.setOnClickListener(v ->{
            Intent intent2 = new Intent(getApplicationContext(), Side_Menu_Activity.class);
            startActivity(intent2);
        });
    }
}