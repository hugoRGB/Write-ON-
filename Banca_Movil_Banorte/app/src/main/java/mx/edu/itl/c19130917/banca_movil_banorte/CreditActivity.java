package mx.edu.itl.c19130917.banca_movil_banorte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_credit);

        getSupportActionBar().hide();
    }

    public void btnPreviousCreditClick (View v) {
        finish();
    }

    /*public void btnMenuClick (View v) {
        Intent intentMenu = new Intent(this, MenuActivity.class);
        startActivity(intentMenu);
    }*/
}