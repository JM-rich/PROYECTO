package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EvolutresActivity extends AppCompatActivity implements View.OnClickListener{
    Button btongm;
    Button btonhg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evolutres);
        btongm = (Button) findViewById(R.id.button13);
        btongm.setOnClickListener(this);

        btonhg = (Button) findViewById(R.id.button14);
        btonhg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(EvolutresActivity.this, EvoludosActivity.class);
                startActivity(h);
                finish();
            }
        });


    }

    @Override
    public void onClick(View v) {
        Intent f = new Intent(this, EvolucuatroActivity.class);
        startActivity(f);
        finish();
    }
}
