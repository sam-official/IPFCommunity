package com.example.ipfcommunity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FeedActivity extends AppCompatActivity {
    //BottomNavigationView navbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        //navbar=findViewById(R.id.bottomNavigationView);

        /*navbar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                switch (item.getItemId()){
                    case R.id.feed:
                        Toast.makeText(FeedActivity.this, "u r  in feed section", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.contacts:
                        Toast.makeText(FeedActivity.this, "u r  in contacts section", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.profile:
                        Toast.makeText(FeedActivity.this, "u r  in profile section", Toast.LENGTH_SHORT).show();
                        return true;
                }return false;
            }

        });*/


    }
}