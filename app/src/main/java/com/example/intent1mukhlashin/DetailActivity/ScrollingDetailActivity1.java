package com.example.intent1mukhlashin.DetailActivity;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intent1mukhlashin.R;

public class ScrollingDetailActivity1 extends AppCompatActivity {

    ImageView imgDetail1;
    TextView deskripsiDetail1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgDetail1 = findViewById(R.id.img_detail1);
        deskripsiDetail1 = findViewById(R.id.tv_detail1);

        imgDetail1.setImageResource(getIntent().getIntExtra("gambar", 0));
        deskripsiDetail1.setText(getIntent().getStringExtra("deskripsi"));
        setTitle(getIntent().getStringExtra("nama"));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
