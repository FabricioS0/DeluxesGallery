package br.com.livrokotlin.deluxesgallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class CarDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardetails);


        Car car = (Car) getIntent().getSerializableExtra("car");

        if (car != null) {

            ImageView carImage = findViewById(R.id.carImage);
            carImage.setImageResource(car.getImageResourceId());

            LinearLayout detailsContainer = (LinearLayout) findViewById(R.id.carImage).getParent();

            // Get each section (name, horsepower, price, year, traction)
            LinearLayout nameSection = (LinearLayout) ((LinearLayout) detailsContainer).getChildAt(1);
            LinearLayout horsepowerSection = (LinearLayout) ((LinearLayout) detailsContainer).getChildAt(2);
            LinearLayout priceSection = (LinearLayout) ((LinearLayout) detailsContainer).getChildAt(3);
            LinearLayout yearSection = (LinearLayout) ((LinearLayout) detailsContainer).getChildAt(4);
            LinearLayout tractionSection = (LinearLayout) ((LinearLayout) detailsContainer).getChildAt(5);


            TextView nameTextView = (TextView) nameSection.getChildAt(1);
            TextView horsepowerTextView = (TextView) horsepowerSection.getChildAt(1);
            TextView priceTextView = (TextView) priceSection.getChildAt(1);
            TextView yearTextView = (TextView) yearSection.getChildAt(1);
            TextView tractionTextView = (TextView) tractionSection.getChildAt(1);

            nameTextView.setText(car.getName());
            horsepowerTextView.setText(car.getHorsepower());
            priceTextView.setText(car.getPrice());
            yearTextView.setText(car.getYear());
            tractionTextView.setText(car.getTraction());
        }


        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }
}
