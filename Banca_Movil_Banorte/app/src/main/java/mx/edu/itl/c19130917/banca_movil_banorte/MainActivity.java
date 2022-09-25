package mx.edu.itl.c19130917.banca_movil_banorte;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }

    private EditText card;
    private View activity_main;
    private View error_layout;

    public void btnLoginClick (View v) {
        activity_main = getLayoutInflater().inflate(R.layout.activity_main, null);
        error_layout = getLayoutInflater().inflate(R.layout.error_layout, null);
        card = activity_main.findViewById(R.id.editTextCard);

        if(card.getText() != null) {
            Intent intentLogin = new Intent(this, LoginActivity.class);
            startActivity(intentLogin);
            finish();
        }
        else
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("ERROR").setView(error_layout)
                    .setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).setCancelable(false).create().show();
        }
    }
}