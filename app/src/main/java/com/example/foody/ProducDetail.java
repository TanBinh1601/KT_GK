package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProducDetail extends AppCompatActivity {
    ImageView img;
    TextView proName, proName1;

    String name;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i = getIntent();

        name = i.getStringExtra("name");
        image = i.getIntExtra("image", 0);

        proName1 = findViewById(R.id.title_1);
        proName = findViewById(R.id.title_2);
        img = findViewById(R.id.img_detail);

        proName1.setText(name);
        proName.setText(name);
        img.setImageResource(image);
    }
}
