package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EvoluquintaActivity extends AppCompatActivity implements View.OnClickListener {
    Button btonw;
    Button btonq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evoluquinta);
        btonw = (Button) findViewById(R.id.button17);
        btonw.setOnClickListener(this);

        btonq = (Button) findViewById(R.id.button18);
        btonq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(EvoluquintaActivity.this, EvolucuatroActivity.class);
                startActivity(g);
                finish();
            }
        });


    }

    @Override
    public void onClick(View v) {
        Intent l = new Intent(this, MenuActivity.class);
        startActivity(l);
        finish();
    }
}
