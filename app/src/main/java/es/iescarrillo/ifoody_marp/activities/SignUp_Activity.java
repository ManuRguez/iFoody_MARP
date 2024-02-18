package es.iescarrillo.ifoody_marp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import es.iescarrillo.ifoody_marp.R;

public class SignUp_Activity extends AppCompatActivity {

    Button btnNextSign;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnNextSign = findViewById(R.id.btnNextSign);

        btnNextSign.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Login_Activity.class);
            startActivity(intent);
        });
    }
}