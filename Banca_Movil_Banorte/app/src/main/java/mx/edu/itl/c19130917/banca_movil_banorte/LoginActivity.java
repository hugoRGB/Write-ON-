package mx.edu.itl.c19130917.banca_movil_banorte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
    }

    public void btnNextClick (View v) {
        Intent intentNext = new Intent(this, PayrollActivity.class);
        startActivity(intentNext);
    }

    /*public void btnMenuClick (View v) {
        Intent intentMenu = new Intent(this, MenuActivity.class);
        startActivity(intentMenu);
    }*/
}