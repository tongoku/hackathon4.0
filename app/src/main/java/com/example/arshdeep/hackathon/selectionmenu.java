package com.example.arshdeep.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class selectionmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectionmenu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void tourplanner(){
        Intent tour = new Intent (selectionmenu.this, com.example.arshdeep.hackathon.tour.class);
        startActivity(tour);
    }

    public void audioguide(){
        //Intent audio = new Intent (selectionmenu.this,audioGuide.class);
        //startActivity(audio);
        //Toast toast = Toast.makeText(getApplicationContext(),"TODO",Toast.LENGTH_SHORT).show();
    }

    public void reviews(){
        Intent rev = new Intent(selectionmenu.this,review.class);
        startActivity(rev);
    }

    public void about(){
        Intent ab = new Intent (selectionmenu.this,about.class);
        startActivity(ab);
    }

}
