package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EvolucuatroActivity extends AppCompatActivity implements View.OnClickListener {
    Button btond;
    Button btons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evolucuatro);

        btond = (Button) findViewById(R.id.button15);
        btond.setOnClickListener(this);

        btons = (Button) findViewById(R.id.button16);
        btons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(EvolucuatroActivity.this, EvolutresActivity.class);
                startActivity(e);
                finish();
            }
        });

    }

    @Override
    public void onClick(View v) {
        Intent k = new Intent(this, EvoluquintaActivity.class);
        startActivity(k);
        finish();
    }
}
