package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button bton;
    Button bton1;
    Button bton2;
    Button bton3;
    Button bton4;
    Button bton5;
    Button bton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bton = (Button) findViewById(R.id.button10);
    bton.setOnClickListener(this);

   bton1 = (Button) findViewById(R.id.button4);
   bton1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent i = new Intent(MenuActivity.this, EvolunoActivity.class);
           startActivity(i);
           finish();
       }
   });

    bton2 = (Button) findViewById(R.id.button5);
    bton2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a = new Intent(MenuActivity.this,EvoludosActivity.class);
            startActivity(a);
            finish();
        }
    });

    bton3 = (Button) findViewById(R.id.button6);
    bton3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent b = new Intent(MenuActivity.this, EvolutresActivity.class);
            startActivity(b);
            finish();
        }
    });

    bton4 = (Button) findViewById(R.id.button7);
    bton4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent c = new Intent(MenuActivity.this, EvolucuatroActivity.class);
            startActivity(c);
            finish();
        }
    });

    bton5 = (Button) findViewById(R.id.button8);
    bton5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent d = new Intent(MenuActivity.this, EvoluquintaActivity.class);
            startActivity(d);
            finish();
        }
    });

    bton6 = (Button) findViewById(R.id.button21);
    bton6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent tr = new Intent(MenuActivity.this,RecomendacionActivity.class);
            startActivity(tr);
            finish();
        }
    });

    }

    public void onClick (View v){
        Intent Intro = new Intent(this,IntroActivity.class);
        startActivity(Intro);
        finish();

    }

}
