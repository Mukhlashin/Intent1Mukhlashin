package com.example.intent1mukhlashin;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.intent1mukhlashin.Fragment.RecyclerFragment1;
import com.example.intent1mukhlashin.Fragment.RecyclerFragment2;
import com.example.intent1mukhlashin.Fragment.RecyclerFragment3;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spRecy;
    FragmentManager fm;

    String[] listrecy = {"RecyclerView 1","RecyclerView 2","RecyclerView 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();

        spRecy = findViewById(R.id.sp_home);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listrecy);
        spRecy.setOnItemSelectedListener(this);
        spRecy.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        FragmentManager pindah;
        pindah = getSupportFragmentManager();
        switch (position) {
            case 0:
                pindah.beginTransaction().add(R.id.main_container, new RecyclerFragment1()).addToBackStack("").commit();
                break;
            case 1:
                pindah.beginTransaction().add(R.id.main_container, new RecyclerFragment2()).addToBackStack("").commit();
                break;
            case 2:
                pindah.beginTransaction().add(R.id.main_container, new RecyclerFragment3()).addToBackStack("").commit();

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
