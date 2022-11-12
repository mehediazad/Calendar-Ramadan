package com.example.ramadan_time;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView CardViewDhaka;
    CardView CardViewChitagon;
    CardView CardViewRajshahi;
    CardView CardViewRangpur;
    CardView CardViewMymensing;
    CardView CardViewBorisal;
    CardView CardViewSylhet;
    CardView CardViewKhulna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardViewDhaka     =  findViewById(R.id.dhakaId);
        CardViewChitagon  =  findViewById(R.id.ChitagonId);
        CardViewRajshahi  =  findViewById(R.id.RajshahiId);
        CardViewRangpur   =  findViewById(R.id.RangpurId);
        CardViewMymensing =  findViewById(R.id.MymensingId);
        CardViewBorisal   =  findViewById(R.id.BorisalId);
        CardViewSylhet    =  findViewById(R.id.SylhetId);
        CardViewKhulna    = findViewById(R.id.KhulnaId);

        CardViewDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DhakaActivity2.class);
                startActivity(intent);

            }
        });

        CardViewChitagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChitagonActivity2.class);
                startActivity(intent);
            }
        });
        CardViewRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RajshahiActivity2.class);
                startActivity(intent);
            }
        });

        CardViewRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RangpurActivity2.class);
                startActivity(intent);
            }
        });
        CardViewMymensing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MymensingActivity2.class);
                startActivity(intent);
            }
        });
        CardViewBorisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BorisalActivity2.class);
                startActivity(intent);
            }
        });
        CardViewSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SylhetActivity2.class);
                startActivity(intent);
            }
        });
        CardViewKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,KhulnaActivity2.class);
                startActivity(intent);
            }
        });
    }
}