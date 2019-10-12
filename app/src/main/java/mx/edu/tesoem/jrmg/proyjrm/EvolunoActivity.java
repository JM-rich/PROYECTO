package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EvolunoActivity extends AppCompatActivity implements View.OnClickListener {

    Button bton8;
    Button bton9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evoluno);
        bton8 = (Button)  findViewById(R.id.button3);
        bton8.setOnClickListener(this);

        bton9 = (Button) findViewById(R.id.button9);
        bton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(EvolunoActivity.this, EvoludosActivity.class);
                startActivity(f);
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intr = new Intent(this, IntroActivity.class);
        startActivity(intr);
        finish();
    }
}
