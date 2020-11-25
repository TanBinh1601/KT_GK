package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class activity_gr extends AppCompatActivity {
    private GridView list;
    String[] web =
            {
                    "Thành Mập",
                    "Ngỏ 8",
                    "A Xìn",
                    "Nhà Hàng Parsley",
                    "Thành Mập",
            };
    String[] cs =
            {
                    "Ngon lắm nhaaa shop",
                    "Ăn ngon nhưng khá ồn",
                    "Ngon",
                    "Rất tốt",
                    "Ngon lắm nhaaa shop",
            };
    Integer[] imageId =
            {
                    R.drawable.a1,
                    R.drawable.a2,
                    R.drawable.a3,
                    R.drawable.a4,
                    R.drawable.a1,
            };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gr);

        CustomList adapter = new CustomList(this, web, cs, imageId);
        list =  findViewById(R.id.GV_01);
        list.setAdapter(adapter);
    }
}
