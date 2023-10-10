package com.example.pizzaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class detailsProduit extends AppCompatActivity {
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_produit);


        Intent intent=getIntent();



        TextView title = findViewById(R.id.titleProduit);

        TextView preparation = findViewById(R.id.preparation);
        TextView ingredients = findViewById(R.id.ingredients);
        TextView description = findViewById(R.id.descriptionProduit);
         btn = findViewById(R.id.btn);



        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(intent.getIntExtra("photo",0));

        title.setText(intent.getStringExtra("nom"));
        preparation.setText(intent.getStringExtra("preparation"));
        ingredients.setText(intent.getStringExtra("detailsIngred"));
        description.setText(intent.getStringExtra("description"));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(detailsProduit.this, MainActivity.class);
                startActivity(send);
            }
        });


    }

}