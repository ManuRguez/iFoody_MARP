package es.iescarrillo.ifoody_marp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import es.iescarrillo.ifoody_marp.R;

public class Welcome_Activity extends AppCompatActivity {

    Button btnNextWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnNextWelcome = findViewById(R.id.btnNextWelcome);

        btnNextWelcome.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SignUp_Activity.class);
            startActivity(intent);
        });
    }


}