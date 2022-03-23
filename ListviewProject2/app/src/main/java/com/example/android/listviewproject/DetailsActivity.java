package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        TextView ItemName = findViewById(R.id.ItemName);
        ImageView ItemImage = findViewById(R.id.imageView2);

        Bundle bundle = getIntent().getExtras();
Items deliItem = (Items) bundle.getSerializable("Item");
ItemName.setText(deliItem.getItemName());
ItemImage.setImageResource(deliItem.getItemImage());

    }
}