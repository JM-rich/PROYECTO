package mx.edu.tesoem.jrmg.proyjrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcercadeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btonde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);

        btonde = (Button) findViewById(R.id.button19);
        btonde.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent de = new Intent(this,MenuActivity.class);
        startActivity(de);
        finish();
    }
}
