package com.example.android.naturetech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {

    Button b, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        b = (Button) findViewById(R.id.KnowledgeCentre);
        b2 = (Button) findViewById(R.id.DailyActivityList);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Home.this, KnowledgeCentre.class);
                startActivity(i);


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i2 = new Intent(Home.this, VegetableTemplate.class);
                startActivity(i2);
            }
        });
    }
}
