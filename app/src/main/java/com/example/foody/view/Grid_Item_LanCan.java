package com.example.foody.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;

public class Grid_Item_LanCan extends AppCompatActivity {
    TextView name,name1;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__item__lan_can);
        name = findViewById(R.id.tv_griditem_moiday);
        name1 = findViewById(R.id.tv_griditem_moiday1);

        img = findViewById(R.id.img_griditem_moiday);
        Intent intent = getIntent();
        name1.setText(intent.getStringExtra("name"));
        name.setText(intent.getStringExtra("name"));
        img.setImageResource(intent.getIntExtra("image",0));
    }
}