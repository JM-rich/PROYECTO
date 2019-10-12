package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecomendacionActivity extends AppCompatActivity implements View.OnClickListener {
    Button btonsigg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendacion);
        btonsigg = (Button) findViewById(R.id.button20);
        btonsigg.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent sig = new Intent(this,MenuActivity.class);
        startActivity(sig);
        finish();
    }
}
