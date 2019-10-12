package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class IntroActivity extends AppCompatActivity implements View.OnClickListener{
Button btonanter;
Button btonsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        btonanter = (Button) findViewById(R.id.button);
        btonanter.setOnClickListener(this);

        btonsig = (Button) findViewById(R.id.button2);
        btonsig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anter = new Intent(IntroActivity.this, EvolunoActivity.class);
                startActivity(anter);
            }
        });

    }
    public void onClick (View v){
        Intent Menu = new Intent(this,MenuActivity.class);
        startActivity(Menu);
        finish();


    }
}
