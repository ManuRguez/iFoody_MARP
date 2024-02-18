package es.iescarrillo.ifoody_marp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import es.iescarrillo.ifoody_marp.R;

public class Login_Activity extends AppCompatActivity {

    Button btnNextLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnNextLogin = findViewById(R.id.btnNexLogin);

        btnNextLogin.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Side_Menu_Activity.class);
            startActivity(intent);
        });

    }
}