package mx.edu.itl.c19130917.banca_movil_banorte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PayrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_payroll);

        getSupportActionBar().hide();
    }

    public void btnNextPayrollClick (View v) {
        Intent intentNext = new Intent(this, CreditActivity.class);
        startActivity(intentNext);
    }

    public void btnPreviousPayrollClick (View v) {
        finish();
    }

    /*public void btnMenuClick (View v) {
        Intent intentMenu = new Intent(this, MenuActivity.class);
        startActivity(intentMenu);
    }*/
}