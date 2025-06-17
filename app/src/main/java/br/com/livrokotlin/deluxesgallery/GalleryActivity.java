package br.com.livrokotlin.deluxesgallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        MaterialButton btnAdd = findViewById(R.id.btnAdd);
        GridView gridView = findViewById(R.id.gridViewCars);


        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lamborghini Huracan STO", "640 CV", "4.5 milhões", "2022", "Traseira", R.drawable.lamborghini_huracan_sto));

        CarAdapter adapter = new CarAdapter(this, cars);
        gridView.setAdapter(adapter);

        btnAdd.setOnClickListener(v -> {
            Intent intent = new Intent(GalleryActivity.this, CadastroActivity.class);
            startActivity(intent);
        });

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(GalleryActivity.this, CarDetailsActivity.class);
            intent.putExtra("car", cars.get(position));
            startActivity(intent);
        });
    }
}
