package br.com.livrokotlin.deluxesgallery;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_gallery);

        Button btnBack = findViewById(R.id.btnBack);
        Button btnCadastrar = findViewById(R.id.btnCadastrar);

        btnBack.setOnClickListener(v -> finish());

        btnCadastrar.setOnClickListener(v -> {

            Toast.makeText(this, "Carro cadastrado!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
