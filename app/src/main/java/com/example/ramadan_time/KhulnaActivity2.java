package com.example.ramadan_time;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class KhulnaActivity2 extends AppCompatActivity {

    RecyclerView myRecyclerView;
    private ArrayList<User> ramadanList;


    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna2);

        myRecyclerView = findViewById(R.id.recyclerViewId);
        ramadanList = new ArrayList<>();

        setUserInfo();
        setAdaper();

        // Toolbar
        Toolbar toolbar = findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        // End Toolbar

    }

    private void setAdaper() {
        MyAdopter myAdopter = new MyAdopter(ramadanList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        myRecyclerView.setLayoutManager(layoutManager);
        myRecyclerView.setItemAnimator(new DefaultItemAnimator());
        myRecyclerView.setAdapter(myAdopter);
    }

    private void setUserInfo() {
        ramadanList.add(new User(01, "03 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(02, "04 April,2022", "Sunday", "04:13", "06:32"));
        ramadanList.add(new User(03, "05 April,2022", "Monday", "04:13", "06:32"));
        ramadanList.add(new User(04, "06 April,2022", "Tuesday", "04:13", "06:32"));
        ramadanList.add(new User(05, "07 April,2022", "Wednesday", "04:13", "06:32"));
        ramadanList.add(new User(06, "08 April,2022", "Thursday", "04:13", "06:32"));
        ramadanList.add(new User(07, "09 April,2022", "Friday", "04:13", "06:32"));
        ramadanList.add(new User(8, "010 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(9, "11 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(10, "12 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(11, "13 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(12, "14 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(13, "15 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(14, "16 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(15, "17 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(16, "18 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(17, "19 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(18, "20 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(19, "21 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(20, "22 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(21, "23 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(22, "24 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(23, "25 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(24, "26 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(25, "27 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(26, "28 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(27, "29 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(28, "30 April,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(29, "01 May,2022", "Saturday", "04:13", "06:32"));
        ramadanList.add(new User(30, "02 May,2022", "Saturday", "04:13", "06:32"));


    }

}