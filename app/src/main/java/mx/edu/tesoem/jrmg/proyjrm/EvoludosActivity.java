package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EvoludosActivity extends AppCompatActivity implements View.OnClickListener {
    Button btonh;
    Button btong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evoludos);
        btonh = (Button) findViewById(R.id.button11);
        btonh.setOnClickListener(this);

        btong = (Button) findViewById(R.id.button12);
        btong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ante = new Intent(EvoludosActivity.this,EvolunoActivity.class);
                startActivity(ante);
                finish();
            }
        });

    }

    @Override
    public void onClick(View v) {
        Intent bv = new Intent(this, EvolutresActivity.class);
        startActivity(bv);
        finish();
    }
}
